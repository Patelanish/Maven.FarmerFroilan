package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.AirCraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class CropDuster extends Vehicle implements AirCraft, FarmVehicle {

    public void fly() {

    }

    public Edible harvest(Edible edible) {
        return null;
    }

    public void fertilize(){

    }

    public Edible harvest(Produce produce) {
        return null;
    }



    public boolean isMounted() {
        return isMounted;
    }
    public void setIsMounted(boolean isMounted){
        this.isMounted = isMounted;
    }

    public boolean isDismounted() {
        return false;
    }

    public boolean isRidden() {
        return isRidden;
    }
    public void setIsRidden(boolean isRidden){
        this.isRidden = isRidden;
    }
}
