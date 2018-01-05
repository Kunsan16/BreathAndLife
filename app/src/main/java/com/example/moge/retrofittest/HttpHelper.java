package com.example.moge.retrofittest;

import com.example.moge.retrofittest.bean.ZhihuNews;

import io.reactivex.Flowable;

/**
 * Created by moge on 2018/1/5.
 */

public interface HttpHelper {


    Flowable<ZhihuNews> getNews();

}
