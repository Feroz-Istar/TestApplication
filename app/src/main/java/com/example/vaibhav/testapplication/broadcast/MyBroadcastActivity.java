package com.example.vaibhav.testapplication.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.vaibhav.testapplication.R;

public class MyBroadcastActivity extends AppCompatActivity {
    private static final String TAG = "MyBroadcastActivity";
    private Button button;
    private RelativeLayout main_container;
    int count=1;
    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
           Bundle bundle =  intent.getExtras();
            String key;
           if(bundle!=null && count%2 != 0){
               main_container.setBackgroundColor(Color.parseColor(bundle.getString("key1")));
               key = bundle.getString("key1");
               count++;
           }
           else{
               main_container.setBackgroundColor(Color.parseColor(bundle.getString("key2")));
               key = bundle.getString("key2");
               count++;
           }
           Log.d(TAG, "value:"+ key +"\n count:"+ count);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_broadcast);
        main_container = findViewById(R.id.main_container);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("intentName");
                intent.putExtra("key1","#000000");
                intent.putExtra("key2","#ffffff");
                LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "The onResume() event");
        LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, new
                IntentFilter("intentName"));
    }

    /**
     * Called when another activity is taking focus.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "The onPause() event");
        LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);

    }


}

