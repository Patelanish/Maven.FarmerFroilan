package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;

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
}
