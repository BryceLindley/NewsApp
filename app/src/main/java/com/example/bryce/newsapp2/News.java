package com.example.bryce.newsapp2;

class News {

    private String mDate;
    private String mSectionName;
    private String mArticle;
    private String mUrl;
    private String mAuthor;

    News(String date, String section, String report, String url, String author) {

        mDate = date;
        mSectionName = section;
        mArticle = report;
        mUrl = url;
        mAuthor = author;
    }

    String getmDate() {
        return mDate;
    }

    String getmSectionName() {
        return mSectionName;
    }

    String getmArticle() {
        return mArticle;
    }

    String getUrl() {
        return mUrl;
    }

    String getmAuthor() {
        return mAuthor;

    }
}