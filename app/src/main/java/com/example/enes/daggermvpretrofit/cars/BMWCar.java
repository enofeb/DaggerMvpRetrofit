package com.example.enes.daggermvpretrofit.cars;

import android.util.Log;

import com.example.enes.daggermvpretrofit.Car;
import com.example.enes.daggermvpretrofit.Engine;

import javax.inject.Inject;

public class BMWCar implements Car {

    Engine engine;

    @Inject
    public BMWCar(Engine engine){
        this.engine=engine;
    }

    @Override
    public void start() {
        Log.v("DaggerExample","BMW Car was started ;)");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("DaggerExample","BMW Car was stopped;)");
        engine.turnOff();
    }
}
