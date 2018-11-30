package com.example.enes.daggermvpretrofit;

import android.app.Application;

import com.example.enes.daggermvpretrofit.injectors.AppComponent;
import com.example.enes.daggermvpretrofit.injectors.AppModule;
import com.example.enes.daggermvpretrofit.injectors.DaggerAppComponent;

public class DaggerApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();

    }

    private void initializeInjector() {
        appComponent=DaggerAppComponent.builder().
                appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
