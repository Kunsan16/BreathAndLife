package com.example.moge.retrofittest.dagger.module;

import com.example.moge.retrofittest.DataManage;
import com.example.moge.retrofittest.HttpHelper;
import com.example.moge.retrofittest.RetrofitHelper;
import com.example.moge.retrofittest.base.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by moge on 2018/1/5.
 */

@Module
public class AppModule {

    private final App application;

    public AppModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    App provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
        return retrofitHelper;
    }

    @Provides
    @Singleton
    DataManage provideDataManager(HttpHelper httpHelper) {
        return new DataManage(httpHelper);
    }
}
