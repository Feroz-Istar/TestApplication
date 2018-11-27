package com.example.vaibhav.testapplication.myrecyclerview.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vaibhav.testapplication.R;
import com.example.vaibhav.testapplication.myrecyclerview.pojo.MyPojo;
import com.squareup.picasso.Picasso;

public class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView title, price;
    private ImageView image;


    public MyViewHolder(View itemView) {
        super(itemView);
        title = (TextView)itemView.findViewById(R.id.title);
        price = (TextView)itemView.findViewById(R.id.price);
        image = (ImageView)itemView.findViewById(R.id.image);
    }


    public void setData(MyPojo data){
        title.setText(data.getTitle());
        price.setText("Rs."+data.getPrice());
        Picasso.get().load(data.getImage()).into(image);
    }

}
