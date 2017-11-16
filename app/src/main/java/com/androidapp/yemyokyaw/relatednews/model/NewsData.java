package com.androidapp.yemyokyaw.relatednews.model;

/**
 * Created by yemyokyaw on 11/17/17.
 */

public class NewsData {

    private long id;
    private String title;

    public NewsData(){
        this.id = 0L;
        this.title = "";
    }

    public NewsData(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
