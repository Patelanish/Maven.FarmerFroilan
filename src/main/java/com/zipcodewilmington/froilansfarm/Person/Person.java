package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Person implements Eater, NoiseMaker {
    protected boolean hasEaten;
}
