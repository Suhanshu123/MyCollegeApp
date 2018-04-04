package com.example.android.codeathon.first_activity;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.android.codeathon.contacts_fragment_class.Pager_Contact;
import com.example.android.codeathon.R;
import com.example.android.codeathon.contacts_fragment_class.Safety;
import com.example.android.codeathon.contacts_fragment_class.club;
import com.example.android.codeathon.contacts_fragment_class.emergency;
import com.example.android.codeathon.contacts_fragment_class.proffesor;

public class ContactActivity extends AppCompatActivity implements
proffesor.OnFragmentInteractionListener,
club.OnFragmentInteractionListener,
emergency.OnFragmentInteractionListener,
Safety.OnFragmentInteractionListener{
    private ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Toolbar toolbar=findViewById(R.id.toolbar_about);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewpager=findViewById(R.id.view_pager_about);
        TabLayout tabLayout=findViewById(R.id.table_layout_about);


        tabLayout.addTab(tabLayout.newTab().setText("Professors"));
        tabLayout.addTab(tabLayout.newTab().setText("Clubs"));
        tabLayout.addTab(tabLayout.newTab().setText("Emergency"));
        tabLayout.addTab(tabLayout.newTab().setText("Safety"));
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        viewpager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        Pager_Contact pagerContact=new Pager_Contact(getSupportFragmentManager(),tabLayout.getTabCount());
        viewpager.setAdapter(pagerContact);

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
