package com.androidapp.yemyokyaw.relatednews.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.androidapp.yemyokyaw.relatednews.NewsDelegate;
import com.androidapp.yemyokyaw.relatednews.model.NewsData;

/**
 * Created by aung on 11/4/17.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder {

    private NewsDelegate mData;

    public NewsViewHolder(View itemView, NewsDelegate data) {
        super(itemView);
        mData = data;
    }
}
