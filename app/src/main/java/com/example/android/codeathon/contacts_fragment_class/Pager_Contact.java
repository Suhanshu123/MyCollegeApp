package com.example.android.codeathon.contacts_fragment_class;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.android.codeathon.contacts_fragment_class.Safety;
import com.example.android.codeathon.contacts_fragment_class.club;
import com.example.android.codeathon.contacts_fragment_class.emergency;
import com.example.android.codeathon.contacts_fragment_class.proffesor;

/**
 * Created by Suhanshu on 30-03-2018.
 */

public class Pager_Contact extends FragmentStatePagerAdapter {
    int number_of_tabs;
    public Pager_Contact(FragmentManager fm, int number_of_tabs) {
        super(fm);
        this.number_of_tabs=number_of_tabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new proffesor();
            case 1: return new club();
            case 2: return new emergency();
            case 3: return new Safety();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return number_of_tabs;
    }
}
