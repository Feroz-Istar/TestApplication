package com.example.vaibhav.testapplication.myrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vaibhav.testapplication.R;
import com.example.vaibhav.testapplication.myrecyclerview.pojo.MyPojo;
import com.example.vaibhav.testapplication.myrecyclerview.viewholder.MyViewHolder;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private ArrayList<MyPojo> myPojos;

    public MyAdapter(ArrayList<MyPojo> myPojos) {
        this.myPojos = myPojos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.my_recycler_layout, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.setData(myPojos.get(i));
    }

    @Override
    public int getItemCount() {
        return myPojos.size();
    }
}
