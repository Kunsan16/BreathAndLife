package com.example.moge.retrofittest.bean;

import com.example.moge.retrofittest.base.BasePresenter;
import com.example.moge.retrofittest.base.BaseView;

/**
 * Created by moge on 2018/1/5.
 */

public interface Contract {

    interface View extends BaseView {


    }

    interface  NewsPresenter extends BasePresenter {

        void requstNews();

    }
}
