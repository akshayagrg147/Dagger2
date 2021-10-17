package com.meetsuccess.dagger_dependency_injection;

import javax.inject.Inject;

public class car {
    @Inject
     Engine engine;
    private wheels wheels;
    private Brakes brakes;
    private Driver dr;

    @Inject
    public car(wheels whl,Brakes brak,Driver driver){

        wheels=whl;
        brakes=brak;
        dr=driver;

    }
    public void start(){
        wheels.start();
        engine.start();;
        brakes.startBrake();
        dr.start();
        System.out.println("ccccc");
        System.out.println("driver object"+dr);
    }
    @Inject
    public void passtoCarRemote(Remote remote)
    {
        remote.setCarw(this);
    }

}
