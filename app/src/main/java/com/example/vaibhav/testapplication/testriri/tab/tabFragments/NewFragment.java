package com.example.vaibhav.testapplication.testriri.tab.tabFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vaibhav.testapplication.R;
import com.example.vaibhav.testapplication.myrecyclerview.adapter.MyAdapter;

public class NewFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_one, container, false);
        return view;
    }
}
