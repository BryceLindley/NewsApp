package com.example.bryce.newsapp2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each article
 * in the data source (a list of {@link News} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {


    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context  of the app
     * @param articles is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list, parent, false);

        }
        News currentNews = getItem(position);

        String snippedArticle = currentNews.getmArticle().substring(0, 35);
        String snippedDate = currentNews.getmDate().substring(0, 4);

        TextView sectionTextView = listItemView.findViewById(R.id.section_name);
        sectionTextView.setText(currentNews.getmSectionName());

        TextView articleTextView = listItemView.findViewById(R.id.news_article);
        articleTextView.setText(currentNews.getmArticle());

        TextView dateTextView = listItemView.findViewById(R.id.date);

        dateTextView.setText(snippedDate);

        TextView authorTextView = listItemView.findViewById(R.id.author_text_view);
        authorTextView.setText(currentNews.getmAuthor());


        return listItemView;
    }
}
