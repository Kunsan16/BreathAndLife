package com.example.moge.retrofittest;


import com.example.moge.retrofittest.api.NetWorkService;
import com.example.moge.retrofittest.base.BaseObserver;
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

    public Service(NetWorkService networkService) {
        this.networkService = networkService;
    }

    public Flowable<ZhihuNews> getCityList() {

        return networkService.getNews();

    }

    public interface GetCityListCallback{
        void onSuccess(ZhihuNews cityListResponse);

        void onError();
    }
}
