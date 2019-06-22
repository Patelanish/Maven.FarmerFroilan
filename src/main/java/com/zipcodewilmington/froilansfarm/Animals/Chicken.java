package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce<EdibleEgg> {
    public void eat() {

    }

    public void makeNoise() {

    }


    public EdibleEgg yield(EdibleEgg egg) {
        return new EdibleEgg();

    }

    public void eat(Edible food) {

    }
}
