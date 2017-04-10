package com.yue.customcamera;

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


    public String getFILTER_PATH() {
        return FILTER_PATH;
    }

    private void initDir() {
    }


    //根据后缀自动生成临时文件
    public String getTempFileNameForExtension(String extension) {
        return getTempPath() + File.separator + System.currentTimeMillis() + extension;
    }

    public String getTempFileName() {
        return getTempPath() + File.separator + System.currentTimeMillis();
    }

    //退出登录时需清除UID和TOKEN
    public void exit() {
        uid = 0;
        token = "";
    }


    public boolean is_first() {
        return is_first;
    }

    public void setIs_first(boolean is_first) {
        this.is_first = is_first;
    }

    public Context getContext() {
        return context;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public long getMaxMemory() {
        return maxMemory;
    }

    public String getBasePath() {
        return BASE_PATH;
    }

    public String getAppPath() {
        return APP_PATH;
    }

    public String getCachePath() {
        return CACHE_PATH;
    }

    public String getCACHE_PATH_FRAMES() {
        return CACHE_PATH_FRAMES;
    }

    public String getTempPath() {
        return TEMP_PATH;
    }

    public String getVIDEO_TEMP_PATH() {
        return VIDEO_TEMP_PATH;
    }

    public void setVIDEO_TEMP_PATH(String VIDEO_TEMP_PATH) {
        this.VIDEO_TEMP_PATH = VIDEO_TEMP_PATH;
    }

    public String getPicturePath() {
        return PICTURE_PATH;
    }

    public String getGifPath() {
        return GIF_PATH;
    }

    public String getApkPath() {
        return APK_PATH;
    }

    public int getUid() {
        return uid;
    }

    public int getTitleBarHeight() {
        return titleBarHeight;
    }

    public void setTitleBarHeight(int titleBarHeight) {
        this.titleBarHeight = titleBarHeight;
    }

    public String getSCENE_PATH() {
        return SCENE_PATH;
    }

    public void setTextHeight(int textHeight) {
        this.textHeight = textHeight;
    }

    public void setTextWidth(int textWidth) {
        this.textWidth = textWidth;
    }

    public int getTextWidth() {
        return textWidth;
    }
}
