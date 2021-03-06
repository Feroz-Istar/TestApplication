package com.example.vaibhav.testapplication.taskViewPager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vaibhav.testapplication.R;
import com.example.vaibhav.testapplication.pojo.ManagerPipeline;

public class FragmentOne extends Fragment {
    private TextView task_description;
    private ManagerPipeline managerPipeline;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.dashboard_layout, container, false);
        task_description=(TextView)view.findViewById(R.id.task_description);

        if(getArguments() != null){
           managerPipeline = (ManagerPipeline) getArguments().getSerializable("obj");
           task_description.setText(managerPipeline.getName());
        }
        return view;
    }
}