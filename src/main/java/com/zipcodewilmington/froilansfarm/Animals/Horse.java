package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    public void eat(Edible corn, Integer qty) {

    }

    public void makeNoise() {

    }

    public void eat(Edible food) {

    }

    @Override
    public void setHasEatenFalse() {
        //hasEatenToday=false;
    }
}
