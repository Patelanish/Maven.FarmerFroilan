package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {
    boolean isMounted;
    boolean isRidden;
    public void makeNoise() {

    }
}
