package com.nsrosell.apps.yousave;

import android.app.Application;

import com.nsrosell.apps.yousave.whatsApp.injection.component.AppComponent;
import com.nsrosell.apps.yousave.whatsApp.injection.component.DaggerAppComponent;
import com.nsrosell.apps.yousave.whatsApp.injection.module.AppModule;


public class TheApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}