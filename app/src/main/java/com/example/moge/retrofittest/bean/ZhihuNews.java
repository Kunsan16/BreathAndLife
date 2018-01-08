package com.example.moge.retrofittest.bean;

import java.util.List;

/**
 * Created by moge on 2018/1/3.
 */

public class ZhihuNews {


    /**
     * date : 20180103
     * stories : [{"title":"2017 年，他们永远地离开了我们，留在了那山野中","ga_prefix":"010310","images":["https://pic3.zhimg.com/v2-9dc5101ff0176fac24cc0de76492fbd6.jpg"],"multipic":true,"type":0,"id":9663598},{"title":"为了玩微信「跳一跳」，还有什么是人类不能动用的\u2026\u2026","ga_prefix":"010309","images":["https://pic4.zhimg.com/v2-71ca8cedaa462e717fe4c16ff22a062f.jpg"],"multipic":true,"type":0,"id":9663593},{"images":["https://pic2.zhimg.com/v2-dc4aa623bc6b87ae3b434091ec8c5749.jpg"],"type":0,"id":9663671,"ga_prefix":"010308","title":"男子钓鱼时触电身亡，法院说供电公司没错，但要赔 37 万"},{"title":"看完中国版《解忧杂货店》，喜忧参半，感觉很复杂","ga_prefix":"010307","images":["https://pic3.zhimg.com/v2-368fe1889c21f7d1282b23d11b84e396.jpg"],"multipic":true,"type":0,"id":9663713},{"images":["https://pic2.zhimg.com/v2-dd1cdcfcf97ab8d5fc4290e892b7f179.jpg"],"type":0,"id":9663732,"ga_prefix":"010307","title":"用 Python 给头像加上圣诞帽"},{"title":"2017 年度盘点 · 值得一说的年度最佳 app","ga_prefix":"010307","images":["https://pic3.zhimg.com/v2-727e31eb3e49afdc3978c7273b0d8596.jpg"],"multipic":true,"type":0,"id":9663693},{"images":["https://pic1.zhimg.com/v2-ed49b93a88194a81624ec2c7c8eaa308.jpg"],"type":0,"id":9663579,"ga_prefix":"010306","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic3.zhimg.com/v2-fdff8c4c4c28dba22ddf7110189903ca.jpg","type":0,"id":9663693,"ga_prefix":"010307","title":"2017 年度盘点 · 值得一说的年度最佳 app"},{"image":"https://pic4.zhimg.com/v2-7e9fd36497e34005cf01469606312647.jpg","type":0,"id":9663598,"ga_prefix":"010310","title":"2017 年，他们永远地离开了我们，留在了那山野中"},{"image":"https://pic1.zhimg.com/v2-12df982f04a521b67bfbf598ab1d274c.jpg","type":0,"id":9663593,"ga_prefix":"010309","title":"为了玩微信「跳一跳」，还有什么是人类不能动用的\u2026\u2026"},{"image":"https://pic1.zhimg.com/v2-2317a13df9f113988e15d3dc5b18587c.jpg","type":0,"id":9663283,"ga_prefix":"010216","title":"我们常说的「门槛高低」，怎么和地位、等级扯上关系的？"},{"image":"https://pic3.zhimg.com/v2-2dfe262b0bb8586124486d74ef952cbe.jpg","type":0,"id":9663567,"ga_prefix":"010215","title":"为什么高档的米其林餐厅，往往给人一种吃不饱的感觉？"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * title : 2017 年，他们永远地离开了我们，留在了那山野中
         * ga_prefix : 010310
         * images : ["https://pic3.zhimg.com/v2-9dc5101ff0176fac24cc0de76492fbd6.jpg"]
         * multipic : true
         * type : 0
         * id : 9663598
         */

        private String title;
        private String ga_prefix;
        private boolean multipic;
        private int type;
        private int id;
        private String add;
        private List<String> images;

        public String getAdd() {
            return add;
        }

        public void setAdd(String add) {
            this.add = add;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic3.zhimg.com/v2-fdff8c4c4c28dba22ddf7110189903ca.jpg
         * type : 0
         * id : 9663693
         * ga_prefix : 010307
         * title : 2017 年度盘点 · 值得一说的年度最佳 app
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
