package com.example.vaibhav.testapplication.myrecyclerview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vaibhav.testapplication.R;
import com.example.vaibhav.testapplication.myrecyclerview.adapter.MyAdapter;
import com.example.vaibhav.testapplication.myrecyclerview.pojo.MyPojo;
import com.github.javafaker.Faker;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    private ArrayList<MyPojo> myPojos = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        for(int i=0;i<10;i++){
            Faker faker = new Faker();
            MyPojo myPojo = new MyPojo();
            myPojo.setTitle(faker.book().publisher());
            myPojo.setPrice(faker.number().numberBetween(100,300));
            myPojo.setImage(faker.internet().image());
            myPojos.add(myPojo);
        }

        adapter = new MyAdapter(myPojos);
        recyclerView.setAdapter(adapter);

    }
}