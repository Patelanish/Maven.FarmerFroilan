package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.AirCraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;

public class CropDuster extends Vehicle implements AirCraft, FarmVehicle {

    private Boolean isFlying=false;

    public void fly() {
        if (this.isMounted) {
            this.isFlying=true;
        }
    }

    public void harvest(CropRow row){};

    public void fertilize(CropRow row){
        if (this.isFlying) {
            row.setFertilized(true);
        }
    }

    public boolean isMounted() {
        return isMounted;
    }

    public void setIsMounted(Boolean isMounted){
        if(!isMounted)this.isFlying=false;
        this.isMounted = isMounted;
    }

    public boolean isDismounted() {
        return false;
    }

    public boolean isRidden() {
        return isRidden;
    }
    public void setIsRidden(Boolean isRidden){
        this.isRidden = isRidden;
    }
}
