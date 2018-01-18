package com.example.moge.retrofittest;

import android.os.Bundle;
import android.util.Log;

import com.example.moge.retrofittest.base.BaseActivity;
import com.example.moge.retrofittest.mvp.zhihu.Contract;
import com.example.moge.retrofittest.bean.ZhihuNews;
import com.example.moge.retrofittest.mvp.zhihu.NewsPresenterImpl;
import com.example.moge.retrofittest.mvp.zhihu.NewsView;

import javax.inject.Inject;

import pub.devrel.easypermissions.EasyPermissions;




public class MainActivity extends BaseActivity<Contract.NewsPresenter> implements NewsView {


    @Inject
    public  Service service;
    private Contract.NewsPresenter mNewspresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNewspresenter=new NewsPresenterImpl(this,service);

        mNewspresenter.requstNews();
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        // Forward results to EasyPermissions
        //将结果传入EasyPermissions中
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }



    @Override
    public void printNews(ZhihuNews zhihuNews) {
             Log.d("MainActivity",zhihuNews.getStories().get(0).getTitle());
    }

    @Override
    public void setPresenter(Contract.NewsPresenter presenter) {
        this.mNewspresenter=presenter;
    }
}
