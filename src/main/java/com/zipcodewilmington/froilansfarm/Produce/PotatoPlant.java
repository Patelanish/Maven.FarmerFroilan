package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class PotatoPlant extends Crop implements Produce {
    private boolean hasBeenFertilized;

    public Potato yield() {
        Potato potato = null;
        if(!hasBeenFertilized){
            potato = new Potato();
        }
        return potato;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    }
