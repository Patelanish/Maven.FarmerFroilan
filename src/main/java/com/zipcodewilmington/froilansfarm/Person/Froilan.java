
package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Collections.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Collections.Farm;
import com.zipcodewilmington.froilansfarm.Collections.Field;
import com.zipcodewilmington.froilansfarm.Collections.Store;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.List;

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
        rideable.setIsMounted(true);
    }

    public void dismount(Rideable rideable) {
        rideable.setIsMounted(false);
    }

    @Override
    public void ride(Rideable rideable) {
        rideable.setIsRidden(true);
    }

    @Override
    public void plant(Crop crop) {
        CropRow row = new CropRow();
        for (int i = 0; i < 120; i++) {
            row.addCrops(crop);
        }
        Field.addRow(row);
    }

    public void harvest(List<Chicken> chickens) {
        for(Chicken chicken:chickens){
            if(!chicken.isHasBeenFertilized())Farm.getEggStore().storeEdibles(4);
        }
    }
}