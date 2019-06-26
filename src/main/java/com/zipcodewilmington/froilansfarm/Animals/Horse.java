package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Collections.Farm;
import com.zipcodewilmington.froilansfarm.Collections.Store;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Animal implements Rideable {
    private boolean isMounted;
    private boolean isRidden;
    List<Edible> eatList = new ArrayList<Edible>();

    public void eat(Edible edible, Integer qty) {
        Store store = Farm.selectEdibleStore(edible);
        if(store.getCount()>=qty){
            store.eat(edible,qty);
            hasEaten = true;
            eatList.add(edible);
        }
    }
    public List<Edible> getEatList() {
        return eatList;
    }

    public boolean hasEaten() {
        return hasEaten;
    }
    public void setHasEatenFalse() {
        hasEaten = false;
    }
    public void setHasEaten(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }

    public void makeNoise() {
        System.out.println("NEEEIGH");
    }

    public boolean isMounted() {
        return isMounted;
    }
    public void setIsMounted(Boolean isMounted){
        this.isMounted = isMounted;
    }

    public boolean isDismounted() {
        return !this.isMounted;
    }

    public boolean isRidden() {
        return isRidden;
    }
    public void setIsRidden(Boolean isRidden){
        this.isRidden = isRidden;
    }
}
