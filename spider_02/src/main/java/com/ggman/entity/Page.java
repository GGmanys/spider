package com.ggman.entity;

/**
 * 保存页面实体类
 */
public class Page {
    //页面内容
    private String content;
    //总播放量
    private String allnumber;
    //每日播放量
    private String daynumber;
    //评论数
    private String commentnnumber;
    //收藏数
    private String  conllectnumber;
    //赞
    private String suppornumber;
    //踩
    private String againstnumber;
    //名称
    private String tvname;
    //url
    private String url;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAllnumber() {
        return allnumber;
    }

    public void setAllnumber(String allnumber) {
        this.allnumber = allnumber;
    }

    public String getDaynumber() {
        return daynumber;
    }

    public void setDaynumber(String daynumber) {
        this.daynumber = daynumber;
    }

    public String getCommentnnumber() {
        return commentnnumber;
    }

    public void setCommentnnumber(String commentnnumber) {
        this.commentnnumber = commentnnumber;
    }

    public String getConllectnumber() {
        return conllectnumber;
    }

    public void setConllectnumber(String conllectnumber) {
        this.conllectnumber = conllectnumber;
    }

    public String getSuppornumber() {
        return suppornumber;
    }

    public void setSuppornumber(String suppornumber) {
        this.suppornumber = suppornumber;
    }

    public String getAgainstnumber() {
        return againstnumber;
    }

    public void setAgainstnumber(String againstnumber) {
        this.againstnumber = againstnumber;
    }

    public String getTvname() {
        return tvname;
    }

    public void setTvname(String tvname) {
        this.tvname = tvname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
