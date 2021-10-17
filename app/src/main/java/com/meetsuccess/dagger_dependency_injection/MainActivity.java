package com.meetsuccess.dagger_dependency_injection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    car car1;
    @Inject
    car car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  CarComponent carComponent=DaggerCarComponent.create();
//        CarComponent carComponent=DaggerCarComponent.builder().brakeModule(new BrakeModule(100)).build();
        CarComponent carComponent=((ExcampleApplication)getApplication()).getCarComponent();
        carComponent.inject(this);

        //car comonent object will be created every time even the screen is rotated


        car1.start();
        car2.start();
    }
}