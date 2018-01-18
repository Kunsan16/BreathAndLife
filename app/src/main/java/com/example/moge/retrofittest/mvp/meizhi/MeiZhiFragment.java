package com.example.moge.retrofittest.mvp.meizhi;

import android.util.Log;

import com.example.moge.retrofittest.R;
import com.example.moge.retrofittest.base.BaseFragment;
import com.example.moge.retrofittest.bean.MeizhiBean;

/**
 * Created by Administrator on 2018/1/15.
 */

public class MeiZhiFragment extends BaseFragment<Contract.MeizhiPresenter> implements Contract.MeiZhiView{


    @Override
    public int layoutId() {
        return R.layout.fragment_meizhi;
    }

    @Override
    public void initView() {
        //mPresenter.requestMeizhi();
    }


    @Override
    public void setPresenter(Contract.MeizhiPresenter presenter) {
       /// this.mPresenter=presenter;
    }

    @Override
    public void showMeizhi(MeizhiBean meizhiBean) {
        Log.d("Meizhi",meizhiBean.getResults().get(0).getUrl());
    }
}
