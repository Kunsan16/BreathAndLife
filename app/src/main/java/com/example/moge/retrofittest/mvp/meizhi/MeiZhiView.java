package com.example.moge.retrofittest.mvp.meizhi;

import com.example.moge.retrofittest.base.BaseView;
import com.example.moge.retrofittest.bean.MeizhiBean;

/**
 * Created by Administrator on 2018/1/14.
 */

public interface MeiZhiView extends BaseView<Contract.MeizhiPresenter>{


    void showMeizhi(MeizhiBean meizhiBean);
}
