package com.example.moge.retrofittest.api;

import com.example.moge.retrofittest.bean.MeizhiBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2018/1/18.
 */

public interface MeiZhiService {

    /**
     * 妹纸列表
     */
    @GET("data/福利/{num}/{page}")
    Flowable<MeizhiBean> getGirlList(@Path("num") int num, @Path("page") int page);
}
