package com.zipcodewilmington.froilansfarm.Collections;

public class Stable extends AnimalStore<Horse>{

    Stable(){
        super();
    }

    Stable(Integer numHorses){
        this();
        for(int i=0;i<numHorses;i++) this.animals.add(new Horse());
    }

    public Integer countRiddenToday(){
        Integer counter=0;
        //   for(Horse horse:this.animals)if(horse.isRidden())counter++;///////////////////////////////
        return counter;
    }

    public void setAllRiddenFalse(){
 //       for(int i=0;i<this.animals.size();i++) this.animals.setRidden(false);///////////////////////////////
    }

}
