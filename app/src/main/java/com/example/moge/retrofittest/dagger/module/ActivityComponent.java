package com.example.moge.retrofittest.dagger.module;

import android.app.Activity;


import com.example.moge.retrofittest.MainActivity;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

    //void inject(MainActivity mainActivity);


}
