package com.example.moge.retrofittest.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/1/14.
 */

public class MeizhiBean {


    /**
     * error : false
     * results : [{"_id":"5a5411fb421aa90fef2035f3","createdAt":"2018-01-09T08:51:07.91Z","desc":"1-9","publishedAt":"2018-01-10T07:57:19.486Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20180109085038_4A7atU_rakukoo_9_1_2018_8_50_25_276.jpeg","used":true,"who":"daimajia"},{"_id":"5a443fcb421aa90fe72536ed","createdAt":"2017-12-28T08:50:19.747Z","desc":"12-28","publishedAt":"2018-01-04T13:45:57.211Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20171228085004_5yEHju_Screenshot.jpeg","used":true,"who":"代码家"},{"_id":"5a4ad432421aa90fe2f02d1a","createdAt":"2018-01-02T08:37:06.235Z","desc":"1-2","publishedAt":"2018-01-02T08:43:32.216Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20180102083655_3t4ytm_Screenshot.jpeg","used":true,"who":"daimajia"},{"_id":"5a431acd421aa90fe50c02a8","createdAt":"2017-12-27T12:00:13.664Z","desc":"12-27","publishedAt":"2017-12-27T12:13:22.418Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20171227115959_lmlLZ3_Screenshot.jpeg","used":true,"who":"daimajia"},{"_id":"5a392689421aa90fe50c0293","createdAt":"2017-12-19T22:47:37.468Z","desc":"12-19","publishedAt":"2017-12-25T08:28:04.64Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20171219224721_wFH5PL_Screenshot.jpeg","used":true,"who":"daimajia"},{"_id":"5a388e4c421aa90fe2f02ced","createdAt":"2017-12-19T11:58:04.567Z","desc":"12-19","publishedAt":"2017-12-19T12:00:28.893Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20171219115747_tH0TN5_Screenshot.jpeg","used":true,"who":"daimajia"},{"_id":"5a2f2486421aa90fe2f02cd2","createdAt":"2017-12-12T08:36:22.670Z","desc":"12-12","publishedAt":"2017-12-15T08:59:11.361Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20171212083612_WvLcTr_Screenshot.jpeg","used":true,"who":"daimajia"},{"_id":"5a2dd04e421aa90fe2f02ccc","createdAt":"2017-12-11T08:24:46.981Z","desc":"12-11","publishedAt":"2017-12-11T08:43:39.682Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20171211082435_CCblJd_Screenshot.jpeg","used":true,"who":"daimajia"},{"_id":"5a273d40421aa90fef203585","createdAt":"2017-12-06T08:43:44.386Z","desc":"12-6","publishedAt":"2017-12-06T08:49:34.303Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20171206084331_wylXWG_misafighting_6_12_2017_8_43_16_390.jpeg","used":true,"who":"daimajia"},{"_id":"5a20ace0421aa90fe50c024c","createdAt":"2017-12-01T09:14:08.63Z","desc":"12-1","publishedAt":"2017-12-05T08:48:31.384Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20171201091356_OPqmuO_kanna399_1_12_2017_9_13_42_126.jpeg","used":true,"who":"daimajia"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 5a5411fb421aa90fef2035f3
         * createdAt : 2018-01-09T08:51:07.91Z
         * desc : 1-9
         * publishedAt : 2018-01-10T07:57:19.486Z
         * source : chrome
         * type : 福利
         * url : http://7xi8d6.com1.z0.glb.clouddn.com/20180109085038_4A7atU_rakukoo_9_1_2018_8_50_25_276.jpeg
         * used : true
         * who : daimajia
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
