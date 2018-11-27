package com.example.vaibhav.testapplication;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.example.vaibhav.testapplication.pojo.ManagerPipeline;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.List;

public class ProductAsyncTask extends AsyncTask<String, String, String> {
    private Context context;

    public ProductAsyncTask(Context context) {
        this.context = context;
    }

    private static final String TAG = "ProductAsyncTask" ;
    public Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    @Override
    protected void onPreExecute() {



    }

    @Override
    protected String doInBackground(String... strings) {
        HttpUtil httputil = new HttpUtil();
        httputil.setUrl("http://192.168.1.27:8080/istar/rest/sales_manager/3/pipelines");
        httputil.setConnectionTimeOut(5000);
        httputil.setType("GET");
        String httpresponse = httputil.getStringResponse();
        return httpresponse;
    }

    @Override
    protected void onPostExecute(String httpresponse) {

        //Log.d(TAG,httpresponse);

        try {

            JSONObject jsonObject = new JSONObject(httpresponse);
            jsonObject.get("response");
            Type listType = new TypeToken<List<ManagerPipeline>>(){}.getType();
            List<ManagerPipeline> managerPipeline = (List<ManagerPipeline>) gson.fromJson(jsonObject.get("response").toString(),listType);
            ((ViewpagerActivity)context).editor.putString("managerPipeline",jsonObject.get("response").toString());
            ((ViewpagerActivity)context).editor.commit();
            ((ViewpagerActivity)context).editor.apply();
            ((ViewpagerActivity)context).setViewPager(managerPipeline);
            Log.d(TAG, managerPipeline.size()+"");

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
