package com.example.android.codeathon.fragment_event_detail;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Suhanshu on 30-03-2018.
 */

public class pager_event_detail extends FragmentStatePagerAdapter {
    int number;
    public pager_event_detail(FragmentManager fm,int number_of_tab) {
        super(fm);
        number=number_of_tab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Codeathon();
            case 1: return new Speedomer();
            case 2: return new Hydrorisesr();
            case 3: return new Electricio();
            case 4: return new Weber();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return number;
    }
}
