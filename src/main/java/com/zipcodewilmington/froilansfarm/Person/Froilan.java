package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Collections.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Collections.Store;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.ArrayList;
import java.util.List;

public class Froilan extends Person implements Farmer {

    List<Edible> edible;
    Store store;


    public void eat(Edible food, Integer qty) {

        int x = store.getCount();
        if (qty < x) {
            x = x - qty;
            hasEaten = true;
        }

    }

    @Override
    public boolean hasEaten() {
        return false;
    }

    @Override
    public void setHasEatenFalse() {
        hasEaten = false;
    }

    @Override
    public void harvest(Tractor tractor, CropRow<Crop> row) {
        tractor.isMounted();
        //row.isFertilized();


    }

    @Override
    public void harvest(ChickenCoop cp) {
        cp.countFertilized();


    }

    @Override
    public void plant(Crop crop, CropRow croprow) {
        croprow.addCrops(crop);

    }

    @Override
    public void makeNoise() {

        System.out.println("Another day, another nickel!");

    }

    @Override
    public void mount(Rideable rideable) {
        if (rideable.isDismounted == true) {
            rideable.mount();

        }
    }

    @Override
    public void dismount(Rideable rideable) {
        if (rideable.isMounted == true) {
            rideable.dismount();
        }
    }

    @Override
    public void ride(Rideable rideable) {

        if (rideable.isRidden) {
            rideable.ride();

        }
    }
}
