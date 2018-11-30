package com.example.enes.daggermvpretrofit.injectors;

import com.example.enes.daggermvpretrofit.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton @Component(modules =AppModule.class)
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
