package com.example.android.codeathon.first_activity;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.android.codeathon.fragments.PagerAdapter;
import com.example.android.codeathon.R;
import com.example.android.codeathon.fragments.BlankFragment1;
import com.example.android.codeathon.fragments.BlankFragment2;
import com.example.android.codeathon.fragments.BlankFragment3;
import com.example.android.codeathon.fragments.BlankFragment4;
import com.example.android.codeathon.fragments.BlankFragment5;
import com.example.android.codeathon.fragments.BlankFragment6;
import com.example.android.codeathon.fragments.BlankFragment7;

public class AboutActivity extends AppCompatActivity implements
        BlankFragment1.OnFragmentInteractionListener
    ,BlankFragment2.OnFragmentInteractionListener
    ,BlankFragment3.OnFragmentInteractionListener
    ,BlankFragment4.OnFragmentInteractionListener
    ,BlankFragment5.OnFragmentInteractionListener
    ,BlankFragment6.OnFragmentInteractionListener
    ,BlankFragment7.OnFragmentInteractionListener

{

    private ViewPager viewpager;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        toolbar=findViewById(R.id.toolbar_about);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout=findViewById(R.id.table_layout_about);

        viewpager=findViewById(R.id.view_pager_about);

        tabLayout.addTab(tabLayout.newTab().setText("ABOUT"));
        tabLayout.addTab(tabLayout.newTab().setText("VC"));
        tabLayout.addTab(tabLayout.newTab().setText("DEANS"));
        tabLayout.addTab(tabLayout.newTab().setText("VISION/MISSION"));
        tabLayout.addTab(tabLayout.newTab().setText("HISTORY"));
        tabLayout.addTab(tabLayout.newTab().setText("ADMINISTRATION"));
        tabLayout.addTab(tabLayout.newTab().setText("ACHIEVEMENTS"));
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);


        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewpager.setAdapter(adapter);

//        it moves to different tab with the change in pager
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
        if(item.getItemId()==android.R.id.home){
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
