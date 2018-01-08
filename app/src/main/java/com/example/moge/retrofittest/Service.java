package com.example.moge.retrofittest;


import com.example.moge.retrofittest.api.NetWorkService;
import com.example.moge.retrofittest.api.Zhihu2Service;
import com.example.moge.retrofittest.base.BaseObserver;
import com.example.moge.retrofittest.bean.ZhihuNews;
import com.example.moge.retrofittest.common.CommonSubscriber;
import com.example.moge.retrofittest.http.TransformUtils;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;


/**
 * Created by ennur on 6/25/16.
 */
public class Service {

    private final NetWorkService networkService;

    private final Zhihu2Service service;

    @Inject
    public Service(NetWorkService networkService, Zhihu2Service service) {
        this.networkService = networkService;
        this.service=service;
    }

    public Flowable<ZhihuNews> getCityList() {
        return networkService.getNews();
    }

    public Flowable<ZhihuNews> getZhi() {
        return service.getNews2();
    }

}
