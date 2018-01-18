package com.example.moge.retrofittest.api;

import com.example.moge.retrofittest.bean.MeizhiBean;
import com.example.moge.retrofittest.bean.ZhihuNews;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by moge on 2018/1/3.
 */

public interface NetWorkService {


    @GET("api/4/news/latest")
    Flowable<ZhihuNews> getNews();






}
