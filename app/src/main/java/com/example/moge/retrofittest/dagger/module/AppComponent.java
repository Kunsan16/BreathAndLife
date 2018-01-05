package com.example.moge.retrofittest.dagger.module;

import com.example.moge.retrofittest.DataManage;
import com.example.moge.retrofittest.MainActivity;
import com.example.moge.retrofittest.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by moge on 2018/1/5.
 */

@Singleton
@Component(modules = { HttpModule.class,AppModule.class})
public interface AppComponent {

    RetrofitHelper retrofitHelper();  //提供http的帮助类

    DataManage getDataManager(); //数据中心


}
