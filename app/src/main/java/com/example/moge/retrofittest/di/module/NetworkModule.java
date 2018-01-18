package com.example.moge.retrofittest.di.module;

import com.example.moge.retrofittest.Service;
import com.example.moge.retrofittest.api.Api;
import com.example.moge.retrofittest.api.MeiZhiService;
import com.example.moge.retrofittest.api.NetWorkService;


import java.io.File;
import java.io.IOException;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by ennur on 6/28/16.
 */
@Module
public class NetworkModule {
    File cacheFile;

    public NetworkModule(File cacheFile) {
        this.cacheFile = cacheFile;
    }

    @Provides
    @Singleton
    OkHttpClient provideCall() {
        Cache cache = null;
        try {
            cache = new Cache(cacheFile, 10 * 1024 * 1024);
        } catch (Exception e) {
            e.printStackTrace();
        }

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request original = chain.request();

                        // Customize the request
                        Request request = original.newBuilder()
                                .header("Content-Type", "application/json")
                                .removeHeader("Pragma")
                                .build();

                        okhttp3.Response response = chain.proceed(request);
                        response.cacheResponse();
                        // Customize or return the response
                        return response;
                    }
                })
                .cache(cache)

                .build();


        return okHttpClient;
    }

    @Provides
    @Singleton
    @SuppressWarnings("unused")
    public NetWorkService providesNetworkService(Retrofit retrofit) {
        return retrofit.create(NetWorkService.class);
    }

    @Provides
    @Singleton
    public MeiZhiService provideMeiZhiService(OkHttpClient client){
        return buildRetrofit(Api.URL,client).create(MeiZhiService.class);
    }


    @Provides
    @Singleton
    @SuppressWarnings("unused")
    public Service providesService(
            NetWorkService networkService,MeiZhiService service) {
        return new Service(networkService,service);
    }

    private Retrofit buildRetrofit(String url,OkHttpClient client){
        return new Retrofit.Builder()
                .baseUrl(url)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

}
