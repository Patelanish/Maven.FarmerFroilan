package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;

import java.security.CryptoPrimitive;
import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle<Edible> {

        ArrayList<Crop> crop;

    public Edible harvest(CropRow cropRow) {

       cropRow.getCrops();
       ArrayList<Edible> edibles= new ArrayList<Edible>();

       for (Crop crops: crop){

           Edible edible;
         //  edibles.add();
       }


        return null;
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

        return isDismounted;
    }

    public void setIsDismounted(boolean isDismounted){

        this.isDismounted= isDismounted;
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
