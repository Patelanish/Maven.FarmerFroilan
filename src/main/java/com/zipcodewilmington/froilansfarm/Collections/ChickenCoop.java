package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

public class ChickenCoop extends AnimalStore<Chicken>{

    public ChickenCoop(){
        super();
    }

    public ChickenCoop(Integer numChickens){
        this();
        for(int i=0;i<numChickens;i++) this.animals.add(new Chicken());
    }

    public Integer countFertilized(){
        Integer counter=0;
        for(Chicken chicken:this.animals)if(chicken.isHasBeenFertilized())counter++;
        return counter;
    }

    public void setAllFertilizedFalse(){
        for(int i=0;i<this.animals.size();i++) animals.get(i).setHasBeenFertilized(false);
    }

    public Integer harvest(){
        Integer harvest = this.animals.size()-this.countFertilized();
        this.setAllFertilizedFalse();
        return harvest;
    }
}
