package com.example.bryce.newsapp2;

class News {

    private String date;
    private String section;
    private String report;
    private String url;
    private String author;

    News(String date, String section, String report, String url, String author) {

        this.date = date;
        this.section = section;
        this.report = report;
        this.url = url;
        this.author = author;
    }

    String getDate() {
        return date;
    }

    String getSection() {
        return section;
    }

    String getReport() {
        return report;
    }

    String getUrl() {
        return url;
    }

    String getAuthor() {
        return author;

    }
}