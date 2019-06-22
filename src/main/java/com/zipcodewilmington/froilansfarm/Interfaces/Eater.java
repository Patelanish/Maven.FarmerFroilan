package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Produce.Crop;

public interface Eater<E extends Edible> {

    void eat(Edible edible, Integer qty);
    void setHasEatenFalse();
}
