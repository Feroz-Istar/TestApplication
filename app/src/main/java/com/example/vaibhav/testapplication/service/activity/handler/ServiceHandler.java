package com.example.vaibhav.testapplication.service.activity.handler;




import android.os.Looper;
import android.os.Message;
import android.util.Log;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class ServiceHandler  extends Handler {
    private static final String TAG = "ServiceHandler" ;

    public ServiceHandler(){}

    public void handleMessage(Message msg) {
        // Normally we would do some work here, like download a file.
        // For our sample, we just sleep for 5 seconds.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Restore interrupt status.
            Thread.currentThread().interrupt();
        }
        // Stop the service using the startId, so that we don't stop
        // the service in the middle of handling another job
        stopSelf(msg.arg1);
    }

    private void stopSelf(int arg1) {
        Log.d(TAG,"inside stopSelf");
    }


    @Override
    public void publish(LogRecord record) {

    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}
