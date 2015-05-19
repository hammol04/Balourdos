package com.balourdos;

import android.app.Application;
import android.content.Context;

/**
 * Dependency injection container so components can be mock tested
 */
public class BalourdosApplication extends Application {
    public BalourdosApplication() {}

    private static BalourdosApplication instance;
    private static Context mContext;

    public static BalourdosApplication getInstance() {
        return instance;
    }

    public static Context getContext() {
        return mContext;
    }
    /**
     * If you want to add any information before the application is starting, before any activity, service, or receiver objects (excluding content providers) have been created,
     * call the onCreate method.
     * public void onCreate(){}
     */
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mContext = getApplicationContext();
    }
/**
 * The rest of the functions we can implement here: http://developer.android.com/reference/android/app/Application.html
 */
}
