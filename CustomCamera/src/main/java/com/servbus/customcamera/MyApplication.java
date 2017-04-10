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
    //屏幕尺寸
    private int screenWidth;
    private int screenHeight;
    //应用的最高申请内存
    private long maxMemory;
    //默认存储目录
    private String BASE_PATH;
    //APP默认路径
    private String APP_PATH;
    //缓存路径
    private String CACHE_PATH;
    //划图解析图片路径
    private String CACHE_PATH_FRAMES;
    //临时文件目录
    private String TEMP_PATH;
    private String VIDEO_TEMP_PATH;
    //图片保存目录
    private String PICTURE_PATH;
    private String FONT_CACHE_PATH;

    public String getVIDEO_PATH() {
        return VIDEO_PATH;
    }

    private String VIDEO_PATH;
    private String VIDEO_FRAMES_PATH;
    //UID
    private int uid = 0;
    //token
    private String token;
    //TitleBar高度
    private static int titleBarHeight = 0;
    private String GIF_PATH;
    private String APK_PATH;
    private String FILTER_PATH;
    private String SCENE_PATH;
    private String FONT_PATH;
    private int textHeight;
    private int textWidth;
    private boolean is_first = false;

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
