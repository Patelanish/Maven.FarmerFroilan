package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class TomatoPlant extends Crop implements Produce {
    private boolean hasBeenFertilized;

    public Tomato yield() {
        Tomato tomato = null;
        if(!hasBeenFertilized){
            tomato = new Tomato();
        }
        return tomato;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    }

