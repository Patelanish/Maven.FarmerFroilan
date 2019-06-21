package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.List;

public class Store<E extends Edible> {

    private Integer edibleCount;
    private final E edible;

    public Store(Integer edibleCount, E edibleType) {
        this.edibleCount = edibleCount;
        this.edible=edibleType;
    }

    public Integer getCount() {
        return edibleCount;
    }

    public Boolean eat(E edibleType, Integer numEaten){
        if(numEaten<=edibleCount&&edibleType.getClass()==edible.getClass()) {
            edibleCount-=numEaten;
            return true;
        }
        return false;
    }

    public Boolean store(E edibleType,Integer numStored){
        if(edibleType.getClass()==edible.getClass()){
            this.edibleCount+=numStored;
            return true;
        }
        return false;
    }
}
