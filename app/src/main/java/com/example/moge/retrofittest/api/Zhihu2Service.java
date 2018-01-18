package com.example.moge.retrofittest.api;

import com.example.moge.retrofittest.bean.ZhihuNews;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * Created by moge on 2018/1/3.
 */

public interface Zhihu2Service {


    @GET("api/4/news/latest")
    Flowable<ZhihuNews> getNews2();
}
