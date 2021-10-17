package com.meetsuccess.dagger_dependency_injection;

import javax.inject.Inject;

public class wheels {
    private Rims rims;
    private Tyres tires;

public wheels(Rims rm,Tyres tyres){
    this.rims=rm;
    this.tires=tyres;

}
public void start(){

}
}
