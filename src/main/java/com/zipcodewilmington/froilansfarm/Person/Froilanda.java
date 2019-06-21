package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

public class Froilanda extends Person implements Pilot {
    public void eat(Edible food, Integer qty) {

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
