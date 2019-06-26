package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Collections.Farm;
import com.zipcodewilmington.froilansfarm.Collections.Store;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Animal implements Produce<EdibleEgg> {
    private boolean hasBeenFertilized;

    List<Edible> eatList = new ArrayList<Edible>();
    Farm farm = Farm.getInstance();

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
        System.out.println("CLUCK");
    }

    public EdibleEgg yield() {
        EdibleEgg edibleEgg = null;
        if(!hasBeenFertilized){
            edibleEgg = new EdibleEgg();
        }
        return edibleEgg;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

}
