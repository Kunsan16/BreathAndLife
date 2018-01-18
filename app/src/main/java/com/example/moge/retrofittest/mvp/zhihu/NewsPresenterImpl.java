package com.example.moge.retrofittest.mvp.zhihu;

import android.util.Log;

import com.example.moge.retrofittest.Service;
import com.example.moge.retrofittest.base.RxPresenter;
import com.example.moge.retrofittest.common.CommonSubscriber;
import com.example.moge.retrofittest.bean.ZhihuNews;
import com.example.moge.retrofittest.http.TransformUtils;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;

/**
 * Created by moge on 2018/1/3.
 */

public class NewsPresenterImpl extends RxPresenter implements Contract.NewsPresenter {

    private NewsView newsView;

    Service mDataManager;


    public NewsPresenterImpl(NewsView newsView,Service service) {
        this.newsView=newsView;
         this.mDataManager=service;
        this.newsView.setPresenter(this);
    }


    @Override
    public void start() {
//        RxJavaRetrofitUtils.getInstance().getNews(new BaseObserver<ZhihuNews>() {
//
//            @Override
//            protected void onSuccees(ZhihuNews zhihuNews) throws Exception {
//                    newsView.printNews(zhihuNews);
//            }
//
//            @Override
//            protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
//
//            }
//        });
    }


    @Override
    public void requstNews() {
        addSubscribe(mDataManager.getCityList()
                .compose(TransformUtils.<ZhihuNews>rxSchedulerHelper())
                .map(new Function<ZhihuNews, ZhihuNews>() {
                    @Override
                    public ZhihuNews apply(ZhihuNews dailyListBean) {



                        return dailyListBean;
                    }
                })
                .subscribeWith(new CommonSubscriber<ZhihuNews>(newsView) {
                    @Override
                    public void onNext(ZhihuNews dailyListBean) {
                        List<ZhihuNews.StoriesBean> list = dailyListBean.getStories();
                        for(ZhihuNews.StoriesBean item : list) {
                            item.setAdd(item.getTitle());
                        }
                       newsView.printNews(dailyListBean);
                    }
                }));

        addSubscribe(mDataManager.getZhi()
                .compose(TransformUtils.<ZhihuNews>rxSchedulerHelper())
                .map(new Function<ZhihuNews, ZhihuNews>() {
                    @Override
                    public ZhihuNews apply(ZhihuNews dailyListBean) {



                        return dailyListBean;
                    }
                })
                .subscribeWith(new CommonSubscriber<ZhihuNews>(newsView) {
                    @Override
                    public void onNext(ZhihuNews dailyListBean) {
                        List<ZhihuNews.StoriesBean> list = dailyListBean.getStories();
                        for(ZhihuNews.StoriesBean item : list) {
                            item.setAdd(item.getTitle());
                        }
                        newsView.printNews(dailyListBean);
                    }
                }));

    }
}
