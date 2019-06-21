package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Tractor extends Vehicle implements FarmVehicle<Edible> {

    public Edible harvest(Edible edible) {
        return null;
    }

    public Edible harvest(Produce produce) {
        return null;
    }
}
