package com.example.android.codeathon.first_activity;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.android.codeathon.R;
import com.example.android.codeathon.facility_fragments.computer;
import com.example.android.codeathon.facility_fragments.gym;
import com.example.android.codeathon.facility_fragments.internet;
import com.example.android.codeathon.facility_fragments.library;
import com.example.android.codeathon.facility_fragments.pager_facility;

public class FacilityActivity extends AppCompatActivity implements
        computer.OnFragmentInteractionListener,
        gym.OnFragmentInteractionListener,
        internet.OnFragmentInteractionListener,
        library.OnFragmentInteractionListener
{

    private ViewPager viewpager;
    private Toolbar toolbar;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);
        toolbar=findViewById(R.id.toolbar_facility);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout=findViewById(R.id.table_layout_facility);

        viewpager=findViewById(R.id.view_pager_facility);

        tabLayout.addTab(tabLayout.newTab().setText("COMPUTER"));
        tabLayout.addTab(tabLayout.newTab().setText("GYM"));
        tabLayout.addTab(tabLayout.newTab().setText("INTERNET"));
        tabLayout.addTab(tabLayout.newTab().setText("LIBRARY"));
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        pager_facility pagerFacility=new pager_facility(getSupportFragmentManager(),tabLayout.getTabCount());
        viewpager.setAdapter(pagerFacility);

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
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

}
