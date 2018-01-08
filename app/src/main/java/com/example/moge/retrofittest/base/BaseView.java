package com.example.moge.retrofittest.base;

/**
 * Created by moge on 2018/1/5.
 */

public interface BaseView<T> {

    void setPresenter(T presenter);

    void showErrorMsg(String errorMsg);
}
