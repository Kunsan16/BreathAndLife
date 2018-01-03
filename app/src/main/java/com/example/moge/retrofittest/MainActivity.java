package com.example.moge.retrofittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import pub.devrel.easypermissions.EasyPermissions;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestData();
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        // Forward results to EasyPermissions
        //将结果传入EasyPermissions中
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    private void requestData() {


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
