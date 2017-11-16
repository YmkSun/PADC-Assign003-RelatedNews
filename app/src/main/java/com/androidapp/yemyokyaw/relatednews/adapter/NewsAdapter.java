package com.androidapp.yemyokyaw.relatednews.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidapp.yemyokyaw.relatednews.NewsDelegate;
import com.androidapp.yemyokyaw.relatednews.R;
import com.androidapp.yemyokyaw.relatednews.model.NewsData;
import com.androidapp.yemyokyaw.relatednews.viewholders.NewsViewHolder;


/**
 * Created by aung on 11/4/17.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    private LayoutInflater mLayoutInflator;
    private NewsDelegate mNewsItemDelegate;

    public NewsAdapter(Context context, NewsDelegate newsItemDelegate) {
        mLayoutInflator = LayoutInflater.from(context);
        mNewsItemDelegate = newsItemDelegate;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newsItemView = mLayoutInflator.inflate(R.layout.view_related_news, parent, false);
        return new NewsViewHolder(newsItemView, mNewsItemDelegate);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
