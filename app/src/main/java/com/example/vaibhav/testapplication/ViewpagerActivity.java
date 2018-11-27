package com.example.vaibhav.testapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vaibhav.testapplication.pojo.ManagerPipeline;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class ViewpagerActivity extends AppCompatActivity {
    CaurosalViewPager viewPager;
    public SharedPreferences sharedpreferences;
    public SharedPreferences.Editor editor;
    public Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        viewPager = (CaurosalViewPager) findViewById(R.id.viewpager);
        sharedpreferences = getSharedPreferences(getResources().getString(R.string.app_name), Context.MODE_PRIVATE);
        editor = sharedpreferences.edit();
        if(sharedpreferences.getString("managerPipeline",null)==null) {
            new ProductAsyncTask(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        }
        else
        {
            String response = sharedpreferences.getString("managerPipeline",null);
            Type listType = new TypeToken<List<ManagerPipeline>>() {
            }.getType();
            List<ManagerPipeline> managerPipeline = (List<ManagerPipeline>) gson.fromJson(response,listType);
        }

    }


    public void setViewPager( List<ManagerPipeline> managerPipeline){
        viewPager.setAdapter(new CustomPagerAdapter(getSupportFragmentManager(),this, managerPipeline));

    }
}
