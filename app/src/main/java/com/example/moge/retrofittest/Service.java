package com.example.moge.retrofittest;


import com.example.moge.retrofittest.api.MeiZhiService;
import com.example.moge.retrofittest.api.NetWorkService;
import com.example.moge.retrofittest.base.BaseObserver;
import com.example.moge.retrofittest.bean.MeizhiBean;
import com.example.moge.retrofittest.bean.ZhihuNews;
import com.example.moge.retrofittest.common.CommonSubscriber;
import com.example.moge.retrofittest.http.TransformUtils;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;


/**
 * Created by ennur on 6/25/16.
 */
public class Service {
    private final NetWorkService networkService;
    private final MeiZhiService service;

    public Service(NetWorkService networkService,MeiZhiService service) {
        this.networkService = networkService;
        this.service=service;
    }

    public Flowable<ZhihuNews> getCityList() {
        return networkService.getNews();
    }

    //获取妹汁列表
    public Flowable<MeizhiBean> getMeiZhiList(int num,int page){
        return service.getGirlList(num,page);
    }

}
