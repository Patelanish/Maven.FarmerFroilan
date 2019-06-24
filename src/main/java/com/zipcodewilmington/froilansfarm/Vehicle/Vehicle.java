package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Vehicle implements NoiseMaker, Rideable {
    public void makeNoise() {

    }

    @Override
    public boolean isMounted() {
        return false;
    }

    @Override
    public boolean isDismounted() {
        return false;
    }

    @Override
    public boolean isRiden() {
        return false;
    }
}
