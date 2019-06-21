package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Eater<E extends Edible> {

    void eat(E food);
}
