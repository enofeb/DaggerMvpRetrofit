package com.example.enes.daggermvpretrofit;

import android.app.Application;

import com.example.enes.daggermvpretrofit.injectors.AppComponent;

public class DaggerApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();


    }

    private void initializeInjector() {
       //appComponent=Dagg
    }
}
