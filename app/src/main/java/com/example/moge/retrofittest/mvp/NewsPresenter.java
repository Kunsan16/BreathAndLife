package com.example.moge.retrofittest.mvp;

import com.example.moge.retrofittest.http.RxJavaRetrofitUtils;
import com.example.moge.retrofittest.bean.ZhihuNews;
import com.example.moge.retrofittest.base.BaseObserver;
import com.example.moge.retrofittest.base.BasePresenter;

/**
 * Created by moge on 2018/1/3.
 */

public class NewsPresenter implements BasePresenter {

    private NewsView newsView;

    public NewsPresenter(NewsView newsView) {
        this.newsView=newsView;
        this.newsView.setPresenter(this);
    }



    @Override
    public void start() {
        RxJavaRetrofitUtils.getInstance().getNews(new BaseObserver<ZhihuNews>() {

            @Override
            protected void onSuccees(ZhihuNews zhihuNews) throws Exception {
                    newsView.printNews(zhihuNews);
            }

            @Override
            protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {

            }
        });
    }
}
