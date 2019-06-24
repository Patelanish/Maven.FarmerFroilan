package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Collections.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class Froilan extends Person implements Farmer {


    public void eat(Edible food, Integer qty) {

    }

    @Override
<<<<<<< HEAD
    public boolean hasEaten() {
        return false;
=======
    public void setHasEatenFalse() {
        hasEaten=false;
    }

    @Override
    public boolean hasEaten() {
        return hasEaten;
>>>>>>> 60b6564124c04dfbd85498d913cc13c36c1a80b9
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
