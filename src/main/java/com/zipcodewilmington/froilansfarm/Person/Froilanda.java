package com.zipcodewilmington.froilansfarm.Person;

import com.sun.prism.shader.Solid_ImagePattern_Loader;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import java.util.ArrayList;
import java.util.List;

public class Froilanda extends Person implements Pilot {

    List<Edible> edible = new ArrayList<>();

    public void eat(Edible food, Integer qty) {
            hasEaten= true;
            edible.add(food);
    }

    @Override
    public boolean hasEaten() {
        return hasEaten;
    }

    @Override
    public void setHasEatenFalse() {
        hasEaten=false;
    }

    public void setHasEaten(boolean hasEaten){
        this.hasEaten = hasEaten;
    }


    public void makeNoise() {

        System.out.println("Let's get this bread!");
    }

    public void mount(Rideable rideable) {

        rideable.isDismounted();
        rideable.mount();

    }

    public void dismount(Rideable rideable) {

        //isMounted= true;
        rideable.dismount();
    }

    @Override
    public void ride(Rideable rideable) {

        rideable.isRidden();
        rideable.ride();

    }

    @Override
    public void fertilize(CropDuster cd, CropRow<Crop> row) {

    }
}
