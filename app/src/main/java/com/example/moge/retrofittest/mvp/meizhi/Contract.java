package com.example.moge.retrofittest.mvp.meizhi;

import com.example.moge.retrofittest.base.BasePresenter;
import com.example.moge.retrofittest.base.BaseView;
import com.example.moge.retrofittest.bean.MeizhiBean;

/**
 * Created by moge on 2018/1/5.
 */

public interface Contract {

    interface MeiZhiView extends BaseView<Contract.MeizhiPresenter>{
        void showMeizhi(MeizhiBean meizhiBean);
    }

    interface  MeizhiPresenter extends BasePresenter {

        void requestMeizhi();

    }
}
