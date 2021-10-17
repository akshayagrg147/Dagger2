package com.meetsuccess.dagger_dependency_injection;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class WheelModule {
    //when class is 3rd part,we dont have access to put @inject annotation
    @Provides
    Rims provideRims(){
        //1st called
        return new Rims();
    }
    @Provides
    Tyres provideTyres(){
        //2nd called
        return new Tyres();
    }
    @Provides
    wheels provideWheels(Rims rM,Tyres ty){
        //3rd called
        return new wheels(rM,ty);
    }
}
