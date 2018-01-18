package com.example.moge.retrofittest.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.moge.retrofittest.R;
import com.example.moge.retrofittest.bean.ZhihuNews;

import java.util.List;

/**
 * Created by moge on 2018/1/8.
 */

public class NewsAdapter extends BaseQuickAdapter<ZhihuNews, BaseViewHolder> {


    public NewsAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(BaseViewHolder helper, ZhihuNews item) {

    }
}
