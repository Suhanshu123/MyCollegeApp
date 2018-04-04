package com.example.android.codeathon.facility_fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.android.codeathon.facility_fragments.computer;
import com.example.android.codeathon.facility_fragments.gym;
import com.example.android.codeathon.facility_fragments.internet;
import com.example.android.codeathon.facility_fragments.library;

/**
 * Created by Suhanshu on 30-03-2018.
 */

public class pager_facility extends FragmentStatePagerAdapter {
    int number_of_tabs;
    public pager_facility(FragmentManager fm,int count) {
        super(fm);
        this.number_of_tabs=count;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new computer();
            case 1: return new gym();
            case 2: return new internet();
            case 3: return new library();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return number_of_tabs;
    }
}
