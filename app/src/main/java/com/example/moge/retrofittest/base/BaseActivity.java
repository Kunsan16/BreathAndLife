package com.example.moge.retrofittest.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.moge.retrofittest.dagger.module.ActivityComponent;
import com.example.moge.retrofittest.dagger.module.ActivityModule;
import com.example.moge.retrofittest.dagger.module.AppComponent;

import com.example.moge.retrofittest.dagger.module.DaggerAppComponent;
import com.example.moge.retrofittest.dagger.module.NetworkModule;


import java.io.File;

import javax.inject.Inject;

/**
 * Created by moge on 2018/1/5.
 */

public class BaseActivity<T extends BasePresenter> extends AppCompatActivity {



    private AppComponent mNetComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        mNetComponent = DaggerAppComponent.builder()
//                // list of modules that are part of this component need to be created here too
//                .appModule(new AppModule(this.getApplication())) // This also corresponds to the name of your module: %component_name%Module
//
//                .build();
        File cacheFile = new File(getCacheDir(), "responses");
        mNetComponent = DaggerAppComponent.builder().networkModule(new NetworkModule(cacheFile)).build();

    }

    public AppComponent getDeps() {
        return mNetComponent;
    }



    protected ActivityModule getActivityModule(){
        return new ActivityModule(this);
    }

}
