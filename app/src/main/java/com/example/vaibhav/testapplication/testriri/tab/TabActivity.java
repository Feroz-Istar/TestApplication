package com.example.vaibhav.testapplication.testriri.tab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vaibhav.testapplication.R;
import com.example.vaibhav.testapplication.taskViewPager.FragmentOne;
import com.example.vaibhav.testapplication.testriri.tab.tabFragments.FragmentThree;
import com.example.vaibhav.testapplication.testriri.tab.tabFragments.FragmentTwo;
import com.example.vaibhav.testapplication.testriri.tab.tabFragments.NewFragment;

public class TabActivity extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    String[] tabTitles={"Tab 1","Tab 2","Tab 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        adapter = new TabAdapter
                (getSupportFragmentManager(), tabTitles);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
