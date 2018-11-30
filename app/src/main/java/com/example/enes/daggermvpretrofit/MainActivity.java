package com.example.enes.daggermvpretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inject();

        car.start();
        car.stop();

    }



    private void inject(){
        DaggerApplication daggerApp=(DaggerApplication) getApplication();
        daggerApp.getAppComponent().inject(this);
    }
}
