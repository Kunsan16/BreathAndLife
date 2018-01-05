package com.example.moge.retrofittest.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.moge.retrofittest.dagger.module.AppComponent;
import com.example.moge.retrofittest.dagger.module.AppModule;

import com.example.moge.retrofittest.dagger.module.DaggerAppComponent;
import com.example.moge.retrofittest.dagger.module.HttpModule;

import javax.inject.Inject;

/**
 * Created by moge on 2018/1/5.
 */

public class BaseActivity<T extends BasePresenter> extends AppCompatActivity {


    @Inject
    protected T mPresenter;

    private AppComponent mNetComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        mNetComponent = DaggerAppComponent.builder()
//                // list of modules that are part of this component need to be created here too
//                .appModule(new AppModule(this.getApplication())) // This also corresponds to the name of your module: %component_name%Module
//
//                .build();

    }

    public AppComponent getNetComponent() {
        return mNetComponent;
    }

}
