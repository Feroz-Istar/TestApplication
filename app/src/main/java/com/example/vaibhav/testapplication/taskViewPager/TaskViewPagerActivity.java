package com.example.vaibhav.testapplication.taskViewPager;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vaibhav.testapplication.CaurosalViewPager;
import com.example.vaibhav.testapplication.R;
import com.example.vaibhav.testapplication.pojo.ManagerPipeline;

import java.util.List;

public class TaskViewPagerActivity extends AppCompatActivity {
    CaurosalViewPager viewpager;
    private List<ManagerPipeline> managerPipeline ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_view_pager);
        viewpager = (CaurosalViewPager)findViewById(R.id.viewpager);
        new TaskAsync(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);

    }

    public void setViewPager(List<ManagerPipeline> managerPipeline) {
        viewpager.setAdapter(new TaskPagerAdapter(getSupportFragmentManager(),this, managerPipeline));
    }
}
