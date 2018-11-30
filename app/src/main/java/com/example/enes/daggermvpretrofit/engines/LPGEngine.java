package com.example.enes.daggermvpretrofit.engines;

import android.util.Log;

import com.example.enes.daggermvpretrofit.Engine;
public class LPGEngine implements Engine {
    @Override
    public void turnOn() {
        Log.v("DaggerExample","LPG Engine turned on :)");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample","LPG Engine turned off :)");
    }
}
