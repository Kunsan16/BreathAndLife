package com.example.moge.retrofittest;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by moge on 2018/1/3.
 */

public interface NetWorkService {


    @GET("api/4/news/latest")
    Observable<ZhihuNews> getNews();
}
