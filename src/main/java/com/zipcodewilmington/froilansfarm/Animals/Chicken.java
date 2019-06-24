package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Animal implements Produce<EdibleEgg> {
    private boolean hasEaten;
    private boolean hasBeenFertilized;

    List<Edible> eatList = new ArrayList<Edible>();

    public void eat(Edible edible, Integer qty) {
        hasEaten = true;
        eatList.add(edible);
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

    public EdibleEgg yield(EdibleEgg edible) {
        EdibleEgg edibleEgg = null;
        if(!hasBeenFertilized){
            edibleEgg = edible;
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
