package com.example.moge.retrofittest;

import com.example.moge.retrofittest.bean.ZhihuNews;

import io.reactivex.Flowable;

/**
 * Created by moge on 2018/1/5.
 */

public class DataManage implements HttpHelper {


    HttpHelper mHttpHelper;


    public DataManage(HttpHelper httpHelper) {
        mHttpHelper = httpHelper;
    }

    @Override
    public Flowable<ZhihuNews> getNews() {
        return mHttpHelper.getNews();
    }
}
