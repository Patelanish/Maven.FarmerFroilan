package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Collections.Farm;
import com.zipcodewilmington.froilansfarm.Collections.Store;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

public class Froilanda extends Person implements Pilot {

    public void eat(Edible edible, Integer qty) {
        Store store = Farm.selectEdibleStore(edible);
        if(store.getCount()>=qty){
            store.eat(edible,qty);
            hasEaten = true;
            // eatList.add(edible);
        }
    }


    @Override
    public void setHasEatenFalse() {
        hasEaten=false;
    }


    @Override
    public boolean hasEaten() {
        return hasEaten;
    }

    public void makeNoise() {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    @Override
    public void ride(Rideable rideable) {

    }

    @Override
    public void fertilize(CropDuster cd, CropRow<Crop> row) {

    }
}
