package com.example.moge.retrofittest.di.module;

import com.example.moge.retrofittest.api.Api;
import com.example.moge.retrofittest.base.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/1/18.
 */
@Module
public class AppModule {

    private App application;

    public AppModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    App provideApplicationContext() {
        return application;
    }
}
