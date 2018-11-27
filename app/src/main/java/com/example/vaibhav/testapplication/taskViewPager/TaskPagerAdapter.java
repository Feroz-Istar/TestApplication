package com.example.vaibhav.testapplication.taskViewPager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vaibhav.testapplication.pojo.ManagerPipeline;

import java.util.List;

public class TaskPagerAdapter extends FragmentStatePagerAdapter {
    private Context context;
    private List<ManagerPipeline> managerPipeline;

    public TaskPagerAdapter(FragmentManager fm, Context context, List<ManagerPipeline> managerPipeline) {
        super(fm);
        this.context = context;
        this.managerPipeline = managerPipeline;
    }

    @Override
    public Fragment getItem(int i) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("obj",managerPipeline.get(i));
        Fragment f = new FragmentOne();
        f.setArguments(bundle);
        return f;
    }

    @Override
    public int getCount() {
        return managerPipeline.size();
    }
}
