package com.example.moge.retrofittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.moge.retrofittest.bean.ZhihuNews;
import com.example.moge.retrofittest.mvp.NewsPresenter;
import com.example.moge.retrofittest.mvp.NewsView;

import pub.devrel.easypermissions.EasyPermissions;




public class MainActivity extends AppCompatActivity implements NewsView<NewsPresenter> {


    private NewsPresenter mNewspresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNewspresenter=new NewsPresenter(this);
        mNewspresenter.start();
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        // Forward results to EasyPermissions
        //将结果传入EasyPermissions中
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }


    @Override
    public void setPresenter(NewsPresenter presenter) {
             this.mNewspresenter=presenter;
    }

    @Override
    public void printNews(ZhihuNews zhihuNews) {
             Log.d("MainActivity",zhihuNews.getStories().get(0).getTitle());
    }
}
