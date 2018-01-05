package com.example.moge.retrofittest;

import com.example.moge.retrofittest.api.NetWorkService;
import com.example.moge.retrofittest.bean.ZhihuNews;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * Created by moge on 2018/1/5.
 */

public class RetrofitHelper implements HttpHelper{

    private NetWorkService mZhihuApiService;

    @Inject
    public RetrofitHelper(NetWorkService zhihuApiService) {
        this.mZhihuApiService = zhihuApiService;

    }

    @Override
    public Flowable<ZhihuNews> getNews() {
        return mZhihuApiService.getNews();
    }
}
