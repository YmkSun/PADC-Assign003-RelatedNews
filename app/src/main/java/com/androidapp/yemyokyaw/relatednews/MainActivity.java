package com.androidapp.yemyokyaw.relatednews;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.androidapp.yemyokyaw.relatednews.adapter.NewsAdapter;
import com.androidapp.yemyokyaw.relatednews.adapter.NewsImagesPagerAdapter;
import com.androidapp.yemyokyaw.relatednews.model.NewsData;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NewsDelegate {

    @BindView(R.id.vp_news_details_images)
    ViewPager vpNewsDetailImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);

        NewsImagesPagerAdapter newsImagesPagerAdapter = new NewsImagesPagerAdapter((getApplicationContext()));
        vpNewsDetailImages.setAdapter(newsImagesPagerAdapter);

        RecyclerView rvNews = findViewById(R.id.rv_related_news);
        rvNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        NewsAdapter newsAdapter = new NewsAdapter(getApplicationContext(), this);
        rvNews.setAdapter(newsAdapter);
    }
}
