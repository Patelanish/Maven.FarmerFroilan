
package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Collections.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Collections.Farm;
import com.zipcodewilmington.froilansfarm.Collections.Store;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class Froilan extends Person implements Farmer {


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
    public void plant(Crop crop) {

    }

    @Override
    public void harvest(Tractor tractor, CropRow<Crop> row) {

    }

    @Override
    public void harvest(ChickenCoop cp) {

    }
}