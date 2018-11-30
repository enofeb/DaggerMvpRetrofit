package com.example.enes.daggermvpretrofit.injectors;

import android.support.v4.content.PermissionChecker;

import com.example.enes.daggermvpretrofit.Car;
import com.example.enes.daggermvpretrofit.DaggerApplication;
import com.example.enes.daggermvpretrofit.Engine;
import com.example.enes.daggermvpretrofit.cars.BMWCar;
import com.example.enes.daggermvpretrofit.engines.DieselEngine;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final DaggerApplication daggerApplication;

    public AppModule(DaggerApplication daggerApplication){
        this.daggerApplication=daggerApplication;
    }

    //Dependency
    @Provides @Singleton
    DaggerApplication provideApp(){
        return daggerApplication;
    }
    //Dependency
    @Provides @Singleton
    Engine provideEngine(){
        return new DieselEngine();
    }
    //Dependency
    @Provides @Singleton
    Car provideCar(Engine engine){
        return new BMWCar(engine);
    }

}
