package com.example.vaibhav.testapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.example.vaibhav.testapplication.dashboardViewPager.dashboardFragment.FragmentOne;
import com.example.vaibhav.testapplication.pojo.ManagerPipeline;

import java.util.List;

class CustomPagerAdapter extends FragmentStatePagerAdapter {
    private Context context;
    List<ManagerPipeline> managerPipeline;


    public CustomPagerAdapter(FragmentManager fm,  Context context, List<ManagerPipeline> managerPipeline) {
        super(fm);
        this.context=context;
        this.managerPipeline = managerPipeline;
    }

    @Override
    public Fragment getItem(int i) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("obj",managerPipeline.get(i));
        Fragment fragment = new FragmentOne();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return managerPipeline.size();
    }
}
