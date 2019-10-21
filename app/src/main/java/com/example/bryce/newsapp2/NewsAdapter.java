package com.example.bryce.newsapp2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    NewsAdapter(Context context, List<News> articles) {
        super(context, 0, articles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list, parent, false);

        }
        News currentNews = getItem(position);

        String snippedArticle = currentNews.getReport().substring(0, 35);
        String snippedDate = currentNews.getDate().substring(0, 4);

        TextView sectionTextView = listItemView.findViewById(R.id.section_name);
        sectionTextView.setText(currentNews.getSection());

        TextView articleTextView = listItemView.findViewById(R.id.news_article);
        articleTextView.setText(currentNews.getReport());

        TextView dateTextView = listItemView.findViewById(R.id.date);

        dateTextView.setText(snippedDate);

        TextView authorTextView = listItemView.findViewById(R.id.author_text_view);
        authorTextView.setText(currentNews.getAuthor());

        return listItemView;
    }
}
