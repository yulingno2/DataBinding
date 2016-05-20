package com.antonioleiva.materializeyourapp.models;

import java.util.List;

/**
 * Created by Wang Xuanyu on 16/3/30.
 */
public class NewsBeans {
    /**
     * newsId : 125187524
     * newsType : 3
     * time : 2016-03-30 12:55:32
     * updateTime : 1459313732000
     * title : 四川2人暴力拒捕夺枪 1名嫌犯携六四式手枪逃跑
     * media : 华西都市报
     * digNum : 0
     * commentNum : 3315
     * description : 昨晚,四川达州发生暴力拒捕夺枪案,2名民警被打并丢失六四式枪支,1名嫌犯被控制,另1人在逃,枪支尚未追回>>
     * newsLink : news://1_125187524
     * link2 : news://channelId=1&newsId=125187524
     * listPic : http://n1.itc.cn/img7/adapt/wb/focal/2016/03/30/145931004357546545_180_180.JPEG
     * images : [{"url":"http://n1.itc.cn/img7/adapt/wb/common/2016/03/30/145931006303999600_639_1136.JPEG","width":"639","height":"1136"}]
     * newsUrl : http://3g.k.sohu.com/t/n125187524
     * abstraction : 昨晚,四川达州发生暴力拒捕夺枪案,2名民警被打并丢失六四式枪支,1名嫌犯被控制,另1人在逃,枪支尚未追回>>
     */

    private List<ArticlesBean> articles;

    public List<ArticlesBean> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlesBean> articles) {
        this.articles = articles;
    }

    public static class ArticlesBean {
        private String title;
        private String listPic;
        private String content;
        /**
         * url : http://n1.itc.cn/img7/adapt/wb/common/2016/03/30/145931006303999600_639_1136.JPEG
         * width : 639
         * height : 1136
         */

        private List<ImagesBean> images;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getListPic() {
            return listPic;
        }

        public void setListPic(String listPic) {
            this.listPic = listPic;
        }

        public List<ImagesBean> getImages() {
            return images;
        }

        public void setImages(List<ImagesBean> images) {
            this.images = images;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public static class ImagesBean {
            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
