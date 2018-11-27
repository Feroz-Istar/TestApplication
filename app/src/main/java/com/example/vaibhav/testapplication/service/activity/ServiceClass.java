package com.example.vaibhav.testapplication.service.activity;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import java.util.Timer;

public class ServiceClass extends IntentService {
    private static final String TAG = "ServiceClass" ;


    public ServiceClass() {
        super("Service Class");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Restore interrupt status.
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "service starting");
        onHandleIntent(intent);
        return super.onStartCommand(intent,flags,startId);
    }

    @Override
    public void onDestroy(){
        stopSelf();
        Log.d(TAG,"service stopped");
    }
}
