package com.example.moge.retrofittest.di.component;


import com.example.moge.retrofittest.base.App;
import com.example.moge.retrofittest.di.module.AppModule;
import com.example.moge.retrofittest.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2018/1/18.
 */
@Singleton
@Component(modules = { AppModule.class,NetworkModule.class})
public interface AppComponent {


    App getContext();  // 提供App的Context
}
