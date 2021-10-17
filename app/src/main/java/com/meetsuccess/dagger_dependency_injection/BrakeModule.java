package com.meetsuccess.dagger_dependency_injection;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public  class BrakeModule {
    int hrPower;
    public BrakeModule(){}
        @Provides
    public Brakes ProvideBrakeModule(BrakeClass brakeClass)
    {
return brakeClass;
    }
//    public BrakeModule(int horsePower){
//        hrPower=horsePower;
//
//    }
//    @Provides
//    public Brakes ProvideBrakeModule()
//    {
//return new BrakeClass(hrPower);
//    }
//    @Binds
//    abstract public Brakes ProvideBrakeModule(BrakeClass brk);
}
