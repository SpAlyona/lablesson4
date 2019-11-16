package ru.mirea.spichakav.looper;

import android.annotation.*;
import android.os.*;
import android.util.Log;
import android.widget.*;
import android.view.*;


import java.util.logging.LogRecord;

public class MyLooper extends Thread {
    private int number = 0;
    private TextView textVi;
    public Handler handler;
    @SuppressLint("HandlerLeak")
    @Override
    public void run(){
        Log.d("MyLooper", "run");
        Looper.prepare();
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg){
                Log.d("MyLooper", number + ":"+ msg.getData().getString("KEY"));
                number++;

            }
        };
        Looper.loop();
    }
}
