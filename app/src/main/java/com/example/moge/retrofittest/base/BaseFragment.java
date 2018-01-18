package com.example.moge.retrofittest.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import javax.inject.Inject;

/**
 * Created by Administrator on 2018/1/18.
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment {

//    @Inject
//    public T mPresenter;

//    protected FragmentComponent getFragmentComponent(){
//        return DaggerFragmentComponent.builder()
//                .appComponent(App.getAppComponent())
//                .fragmentModule(getFragmentModule())
//                .build();
//    }
//
//    protected FragmentModule getFragmentModule(){
//        return new FragmentModule(this);
//    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(layoutId(),container);
        initView();
        return view;

    }


    public abstract int layoutId();

    public abstract void initView();

}
