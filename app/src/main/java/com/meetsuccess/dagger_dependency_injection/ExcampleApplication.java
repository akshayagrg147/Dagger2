package com.meetsuccess.dagger_dependency_injection;

import android.app.Application;

public class ExcampleApplication extends Application {
    CarComponent carComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        carComponent=DaggerCarComponent.builder().horsepower(100).engineCapacity(10000).build();
    }
    public CarComponent getCarComponent(){
        return carComponent;
    }
}
