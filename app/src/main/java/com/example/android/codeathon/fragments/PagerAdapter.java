package com.example.android.codeathon.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.android.codeathon.fragments.BlankFragment1;
import com.example.android.codeathon.fragments.BlankFragment2;
import com.example.android.codeathon.fragments.BlankFragment3;
import com.example.android.codeathon.fragments.BlankFragment4;
import com.example.android.codeathon.fragments.BlankFragment5;
import com.example.android.codeathon.fragments.BlankFragment6;
import com.example.android.codeathon.fragments.BlankFragment7;

/**
 * Created by Suhanshu on 28-03-2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumberofTabs;

    public PagerAdapter(FragmentManager fm, int number_of_Tabs) {
        super(fm);
        this.mNumberofTabs = number_of_Tabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                BlankFragment1 blankFragment1 = new BlankFragment1();
                return blankFragment1;

            case 1:
                BlankFragment2 blankFragment2 = new BlankFragment2();
                return blankFragment2;
            case 2:
                BlankFragment3 blankFragment3=new BlankFragment3();
                return blankFragment3;
            case 3:
                BlankFragment4 blankFragment4 = new BlankFragment4();
                return blankFragment4;
            case 4:
                BlankFragment5 blankFragment5 = new BlankFragment5();
                return blankFragment5;
            case 5:
                BlankFragment6 blankFragment6 = new BlankFragment6();
                return blankFragment6;
            case 6:
                BlankFragment7 blankFragment7 = new BlankFragment7();
                return blankFragment7;
            default: return null;


        }
    }

    @Override
    public int getCount() {
        return mNumberofTabs;
    }
}
