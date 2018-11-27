package com.example.vaibhav.testapplication.taskViewPager;

import android.content.Context;
import android.os.AsyncTask;

import com.example.vaibhav.testapplication.HttpUtil;
import com.example.vaibhav.testapplication.pojo.ManagerPipeline;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.List;

public class TaskAsync extends AsyncTask<String, String, String> {
    private Context context;


    private static final String TAG = "ProductAsyncTask" ;
    public Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    public TaskAsync(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
    }

    @Override
    protected String doInBackground(String... strings) {
        HttpUtil httpUtil = new HttpUtil();
        httpUtil.setUrl("http://192.168.1.27:8080/istar/rest/sales_manager/3/pipelines");
        httpUtil.setConnectionTimeOut(5000);
        httpUtil.setType("GET");
        String response = httpUtil.getStringResponse();
        return response;
    }

    @Override
    protected void onPostExecute(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            jsonObject.get("response");
            Type listType = new TypeToken<List<ManagerPipeline>>(){}.getType();
            List<ManagerPipeline> managerPipeline = gson.fromJson(jsonObject.get("response").toString(),listType);
            ((TaskViewPagerActivity)context).setViewPager(managerPipeline);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
