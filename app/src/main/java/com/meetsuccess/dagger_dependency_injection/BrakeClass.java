package com.meetsuccess.dagger_dependency_injection;

import javax.inject.Inject;
import javax.inject.Named;

public class BrakeClass implements Brakes {
    int hrspowe;
    int engineCapacity;
    @Inject
    public BrakeClass(@Named("horsePower") int hrspower,@Named("EngineCapacity") int engineCapacity){
        hrspowe=hrspower;
       this. engineCapacity=engineCapacity;

    }
    @Override
    public void startBrake() {

    }
}
