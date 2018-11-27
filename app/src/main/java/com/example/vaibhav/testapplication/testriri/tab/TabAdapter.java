package com.example.vaibhav.testapplication.testriri.tab;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vaibhav.testapplication.testriri.tab.tabFragments.FragmentThree;
import com.example.vaibhav.testapplication.testriri.tab.tabFragments.FragmentTwo;
import com.example.vaibhav.testapplication.testriri.tab.tabFragments.NewFragment;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentStatePagerAdapter {
   private String[] listOfTitles;

    public TabAdapter(FragmentManager fm, String[] listOfTitles) {
        super(fm);
        this.listOfTitles = listOfTitles;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch(i){
            case 0:
               fragment = new NewFragment();
                break;

            case 1:
               fragment = new FragmentTwo();
                break;

            case 2:
                fragment = new FragmentThree();
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listOfTitles[position];
    }

    @Override
    public int getCount() {
        return listOfTitles.length;
    }
}