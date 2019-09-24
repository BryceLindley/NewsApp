package com.example.bryce.newsapp2;

public class News {


    //  title of the article
    private String mDate;


    // name of the section
    private String mSectionName;


    private String mArticle;

    private String mUrl;
    private String mAuthor;

    /**
     * Constructor (@link News) object.
     *
     * @param date    is the date of the article
     * @param section is the name of the section
     */

    public News(String date, String section, String report, String url, String author) {

        mDate = date;
        mSectionName = section;
        mArticle = report;
        mUrl = url;
        mAuthor = author;
    }

    /**
     * Returns the date of the article
     */
    public String getmDate() {
        return mDate;
    }

    /**
     * Returns the news headline
     */
    public String getmSectionName() {
        return mSectionName;
    }

    /**
     * Returns the actual article
     */
    public String getmArticle() {
        return mArticle;
    }

    /**
     * Returns the website of the article
     */
    public String getUrl() {
        return mUrl;
    }

    public String getmAuthor() {
        return mAuthor;

    }
}