package com.example.android.codeathon;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.android.codeathon.fragment_event_detail.Codeathon;
import com.example.android.codeathon.fragment_event_detail.Electricio;
import com.example.android.codeathon.fragment_event_detail.Hydrorisesr;
import com.example.android.codeathon.fragment_event_detail.Speedomer;
import com.example.android.codeathon.fragment_event_detail.Weber;
import com.example.android.codeathon.fragment_event_detail.pager_event_detail;

public class Events_detail extends AppCompatActivity
        implements Speedomer.OnFragmentInteractionListener,
        Hydrorisesr.OnFragmentInteractionListener,
        Codeathon.OnFragmentInteractionListener,
        Weber.OnFragmentInteractionListener,
        Electricio.OnFragmentInteractionListener {
    private ViewPager viewpager;
    private Toolbar toolbar;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_detail);
        toolbar = findViewById(R.id.toolbar_event_detail);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout=findViewById(R.id.table_layout_event_detail);

        viewpager=findViewById(R.id.view_pager_event_detail);

        tabLayout.addTab(tabLayout.newTab().setText("CODEATHON"));
        tabLayout.addTab(tabLayout.newTab().setText("SPEEDOMERS"));
        tabLayout.addTab(tabLayout.newTab().setText("HYDRORISER"));
        tabLayout.addTab(tabLayout.newTab().setText("INCLINO"));
        tabLayout.addTab(tabLayout.newTab().setText("WEBER"));
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);


        pager_event_detail pagerEventDetail = new pager_event_detail(getSupportFragmentManager(), tabLayout.getTabCount());
        viewpager.setAdapter(pagerEventDetail);

        viewpager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void open_hydroriser_website(View view) {
        startActivity(new Intent(this,event_detail_web_page.class));
    }
}
