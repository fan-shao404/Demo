package com.fanshao.demo.base;

import android.app.Application;
import android.util.Log;

import com.tencent.bugly.crashreport.CrashReport;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initBugly();
    }

    /**
     * 初始化Bugly
     */
    private void initBugly() {
        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(this);
        strategy.setDeviceID("-------------");
        CrashReport.initCrashReport(this,"058eda19a0",true, strategy);
    }
}
