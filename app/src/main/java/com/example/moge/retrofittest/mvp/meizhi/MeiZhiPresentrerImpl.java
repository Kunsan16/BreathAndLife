package com.example.moge.retrofittest.mvp.meizhi;

import android.util.Log;

import com.example.moge.retrofittest.Service;
import com.example.moge.retrofittest.base.RxPresenter;
import com.example.moge.retrofittest.bean.MeizhiBean;
import com.example.moge.retrofittest.bean.ZhihuNews;
import com.example.moge.retrofittest.common.CommonSubscriber;
import com.example.moge.retrofittest.http.TransformUtils;
import com.example.moge.retrofittest.mvp.zhihu.NewsView;

import javax.inject.Inject;

import io.reactivex.functions.Function;

/**
 * Created by Administrator on 2018/1/14.
 */

public class MeiZhiPresentrerImpl extends RxPresenter implements Contract.MeizhiPresenter{


    Service dataService;

    Contract.MeiZhiView meiZhiView;

    @Inject
    public MeiZhiPresentrerImpl(Contract.MeiZhiView meiZhiView, Service dataService) {
        this.meiZhiView=meiZhiView;
        this.dataService=dataService;
        this.meiZhiView.setPresenter(this);
    }

    @Override
    public void requestMeizhi() {
        addSubscribe(dataService.getMeiZhiList(10,1)
                .compose(TransformUtils.<MeizhiBean>rxSchedulerHelper())
                .map(new Function<MeizhiBean, MeizhiBean>() {
                    @Override
                    public MeizhiBean apply(MeizhiBean meizhiBean) {

                        return meizhiBean;
                    }
                })
                .subscribeWith(new CommonSubscriber<MeizhiBean>(meiZhiView) {
                    @Override
                    public void onNext(MeizhiBean meizhiBean) {
                          meiZhiView.showMeizhi(meizhiBean);
                    }
                }));

    }
}
