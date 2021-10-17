package com.meetsuccess.dagger_dependency_injection;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
@Singleton
@Component(modules = {WheelModule.class,BrakeModule.class})
public interface CarComponent {
   public void inject(MainActivity mainActivity);
   @Component.Builder
   interface Builder{
      CarComponent build();
      @BindsInstance
      Builder horsepower(@Named("horsePower") int horspepower);
      @BindsInstance
      Builder engineCapacity(@Named("EngineCapacity")int engineCapacity);

   }
}
