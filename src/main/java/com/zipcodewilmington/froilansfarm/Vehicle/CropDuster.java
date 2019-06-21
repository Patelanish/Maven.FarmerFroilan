package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.AirCraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends Vehicle implements AirCraft, FarmVehicle {

    public void fly() {

    }

    public Edible harvest(Edible edible) {
        return null;
    }

    public void fertilize(){

    }
}
