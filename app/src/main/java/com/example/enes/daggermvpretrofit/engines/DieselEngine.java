package com.example.enes.daggermvpretrofit.engines;

import android.util.Log;

import com.example.enes.daggermvpretrofit.Engine;

public class DieselEngine implements Engine {
    @Override
    public void turnOn() {
        Log.v("DaggerExample","Diesel Engine turned on :)");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample","Diesel Engine turned off :)");
    }
}
