package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Animals.Animal;

import java.util.ArrayList;
import java.util.List;

abstract class AnimalStore<E extends Animal> {
    List<E> animals;
    static final Integer maxAnimals=4;

    AnimalStore(){
        this.animals=new ArrayList<>();
    }

 /*   AnimalStore(List<E> animals){
        this.animals = animals;
    }*/

    public Integer count(){
        return this.animals.size();
    }

    public E getAnimal(Integer i) {
        if(i< animals.size()) return animals.get(i);
        return null;
    }

    public void setAllHasEatenFalse(){
        for(int i = 0; i<this.animals.size();i++){
            this.animals.get(i).setHasEatenFalse();
        }
    }

    public Integer getNumHasEaten(){
        Integer counter=0;
        for(int i = 0; i<this.animals.size();i++){
       //     if(this.animals.get(i).hasEaten())counter++;//////////////////////////
        }
        return counter;
    }
}
