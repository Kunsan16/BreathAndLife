package com.example.moge.retrofittest.mvp;

import com.example.moge.retrofittest.bean.ZhihuNews;

/**
 * Created by moge on 2018/1/4.
 */

public interface NewsView<T> {


    void setPresenter(T presenter);

    void printNews(ZhihuNews zhihuNews);
}
