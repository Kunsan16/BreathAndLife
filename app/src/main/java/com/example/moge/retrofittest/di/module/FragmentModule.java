package com.example.moge.retrofittest.di.module;



import android.support.v4.app.Fragment;

import dagger.Module;

/**
 * Created by Administrator on 2018/1/18.
 */
@Module
public class FragmentModule {

    private Fragment fragment;

    public FragmentModule(Fragment fragment){
        this.fragment=fragment;
    }
}
