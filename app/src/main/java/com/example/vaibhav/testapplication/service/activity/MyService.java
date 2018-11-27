package com.example.vaibhav.testapplication.service.activity;

import android.app.IntentService;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.example.vaibhav.testapplication.service.activity.handler.ServiceHandler;

public class MyService extends Service {
    private static final String TAG = "MyService";
    int mStartMode;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
       Log.d(TAG,"service started" + START_STICKY);

        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"service stopped");

    }

}




