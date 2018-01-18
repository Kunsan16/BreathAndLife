package com.example.moge.retrofittest.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.moge.retrofittest.bean.MeizhiBean;


/**
 * Created by Administrator on 2018/1/14.
 */

public class MeiZhiAdapter extends BaseQuickAdapter<MeizhiBean, BaseViewHolder> {



    public MeiZhiAdapter(int layoutResId) {
        super(layoutResId);
    }


    @Override
    protected void convert(BaseViewHolder helper, MeizhiBean item) {

//        GlideApp.with(mContext)
//                .asGif()
//                .load(item.)
//                .into(imageView);
    }
}
