package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.AirCraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;

public class CropDuster extends Vehicle implements AirCraft, FarmVehicle {

    private boolean isFlying;


    public CropDuster() {

    }

    public void fly() {
       if(isMounted==true){
           isFlying= true;
       }

       System.out.println("Up, up, and away!");
    }

    public Edible harvest(Edible edible) {
        return null;
    }

    public void fertilize(){

    }

    public Edible harvest(CropRow cropRow) {

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

    @Override
    public void mount() {

    }

    @Override
    public void dismount() {

    }

    @Override
    public void ride() {

    }


}
