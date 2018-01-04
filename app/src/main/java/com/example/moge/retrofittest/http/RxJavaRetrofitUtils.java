package com.example.moge.retrofittest.http;

import android.util.Log;

import com.example.moge.retrofittest.api.NetWorkService;
import com.example.moge.retrofittest.bean.ZhihuNews;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observer;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by moge on 2018/1/3.
 */

public class RxJavaRetrofitUtils {

    private Retrofit retrofit;
    private NetWorkService netWorkService;

    private static final long TIMEOUT = 30;

    private static OkHttpClient httpClient = new OkHttpClient.Builder()
            // 添加通用的Header
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request.Builder builder = chain.request().newBuilder();
                   // builder.addHeader("token", "123");
                    return chain.proceed(builder.build());

                }
            })
            /*
            这里可以添加一个HttpLoggingInterceptor，因为Retrofit封装好了从Http请求到解析，
            出了bug很难找出来问题，添加HttpLoggingInterceptor拦截器方便调试接口
             */
            .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(String message) {
                    Log.i("OKHTTP拦截日志",message);
                }
            }).setLevel(HttpLoggingInterceptor.Level.BASIC))
            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .build();

    private RxJavaRetrofitUtils() {
        /**
         * 构造函数私有化
         * 并在构造函数中进行retrofit的初始化
         */
        // Retrofit是基于OkHttpClient的，可以创建一个OkHttpClient进行一些配置

        /**
         * 由于retrofit底层的实现是通过okhttp实现的，所以可以通过okHttp来设置一些连接参数
         * 如超时等
         */
        retrofit = new Retrofit.Builder()
                .baseUrl("http://news-at.zhihu.com/")
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        netWorkService=retrofit.create(NetWorkService.class);
    }

    private static class sinalInstance {
        public static final RxJavaRetrofitUtils instance = new RxJavaRetrofitUtils();
    }

    public  static RxJavaRetrofitUtils getInstance(){
        return sinalInstance.instance;
    }

    public void getNews(Observer<ZhihuNews> observer){

        netWorkService.getNews()
                .compose(TransformUtils.<ZhihuNews>setThread())
                .retryWhen(new RetryWhenNetworkException())
                .subscribe(observer);
    }



}
