package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;


public class CornStalk extends Crop implements Produce<EarOfCorn> {
    private boolean hasBeenFertilized;

    public EarOfCorn yield() {
        EarOfCorn earOfCorn = null;
        if(!hasBeenFertilized){
            earOfCorn = new EarOfCorn();
        }
        return earOfCorn;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


}
