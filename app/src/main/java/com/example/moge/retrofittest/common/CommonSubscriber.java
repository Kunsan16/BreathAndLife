package com.example.moge.retrofittest.common;

import android.text.TextUtils;

import com.example.moge.retrofittest.base.BaseView;

import io.reactivex.subscribers.ResourceSubscriber;
import retrofit2.HttpException;

/**
 * Created by moge on 2018/1/5.
 */


public abstract class CommonSubscriber<T> extends ResourceSubscriber<T> {
    private BaseView mView;
    private String mErrorMsg;
    private boolean isShowErrorState = true;

    protected CommonSubscriber(BaseView view){
        this.mView = view;
    }

    protected CommonSubscriber(BaseView view, String errorMsg){
        this.mView = view;
        this.mErrorMsg = errorMsg;
    }

    protected CommonSubscriber(BaseView view, boolean isShowErrorState){
        this.mView = view;
        this.isShowErrorState = isShowErrorState;
    }

    protected CommonSubscriber(BaseView view, String errorMsg, boolean isShowErrorState){
        this.mView = view;
        this.mErrorMsg = errorMsg;
        this.isShowErrorState = isShowErrorState;
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {
        if (mView == null) {
            return;
        }
        if (mErrorMsg != null && !TextUtils.isEmpty(mErrorMsg)) {
           // mView.showErrorMsg(mErrorMsg);
        }else if (e instanceof HttpException) {
          //  mView.showErrorMsg("数据加载失败ヽ(≧Д≦)ノ");
        } else {
           // mView.showErrorMsg("未知错误ヽ(≧Д≦)ノ");
          //  LogUtil.d(e.toString());
        }
        if (isShowErrorState) {
          //  mView.stateError();
        }
    }
}
