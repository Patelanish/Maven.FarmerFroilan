package com.zipcodewilmington.froilansfarm;

public interface Eater<E extends Edible> {

    void eat(E food);
}
