package com.example.moge.retrofittest;

import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by moge on 2018/1/3.
 */

public class NewsPresenter {


        public void requestData(){

            RxJavaRetrofitUtils.getInstance().getNews(new Observer<ZhihuNews>() {
                Disposable d;
                @Override
                public void onSubscribe(Disposable d) {
                    this.d=d;
                }

                @Override
                public void onNext(ZhihuNews zhihuNews) {
                    Log.i("onNext",zhihuNews.getDate());
                }

                @Override
                public void onError(Throwable e) {
                    Log.i("onError",e.getMessage());
                    d.dispose();
                }

                @Override
                public void onComplete() {
                    Log.i("onComplete","onComplete");
                }
            });


        }
}
