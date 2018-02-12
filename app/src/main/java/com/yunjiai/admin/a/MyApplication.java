package com.yunjiai.admin.a;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Created by admin on 2018/1/22.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);

    }
}
