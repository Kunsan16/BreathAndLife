package com.example.moge.retrofittest.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by moge on 2018/1/5.
 */

public class RxPresenter implements BasePresenter{


    protected CompositeDisposable mCompositeDisposable;



    @Override
    public void start() {

    }


    protected void unSubscribe() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();
        }
    }

    protected void addSubscribe(Disposable subscription) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(subscription);
    }

}
