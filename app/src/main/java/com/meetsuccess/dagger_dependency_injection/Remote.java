package com.meetsuccess.dagger_dependency_injection;

import javax.inject.Inject;

public class Remote {
    private car carw;
    @Inject
    public Remote(){

    }
    public void setCarw(car car1)
    {
        this.carw=car1;
    }
}
