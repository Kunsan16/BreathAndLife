package com.example.moge.retrofittest.mvp.zhihu;

import com.example.moge.retrofittest.base.BaseView;
import com.example.moge.retrofittest.bean.ZhihuNews;

/**
 * Created by moge on 2018/1/4.
 */

public interface NewsView extends BaseView<Contract.NewsPresenter>{


    void printNews(ZhihuNews zhihuNews);

}
