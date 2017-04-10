package com.servbus.customcamera;

import android.app.Application;
import android.content.Context;

import java.io.File;
import java.io.IOException;

/**
 * Created by Wxcily on 15/10/30.
 */
public class MyApplication extends Application {

    //Application单例
    private static MyApplication instance;
    //Context
    private Context context;

    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        context = this.getApplicationContext();
    }



}
