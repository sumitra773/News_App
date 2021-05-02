package com.example.android.newsapp;

public class News {

    private String mTitle;
    private String mDate;
    private String mUrl;
    private String mAuthor;
    private String mSection;

    public News(String title, String date, String url, String author, String section) {
        mTitle = title;
        mDate = date;
        mUrl = url;
        mAuthor = author;
        mSection = section;
    }

    public String getTitle() {
        return mTitle;
    }


    public String getDate() {
        return mDate;
    }


    public String getUrl() {
        return mUrl;
    }


    public String getAuthor() {
        return mAuthor;
    }


    public String getSection() {
        return mSection;
    }


}
