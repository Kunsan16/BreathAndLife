package com.example.moge.retrofittest.di.component;

import com.example.moge.retrofittest.di.module.FragmentModule;
import com.example.moge.retrofittest.mvp.meizhi.MeiZhiFragment;

import dagger.Component;

/**
 * Created by Administrator on 2018/1/18.
 */

@Component(modules = {FragmentModule.class})
public interface FragmentComponent {

    void inject(MeiZhiFragment fragment);
}
