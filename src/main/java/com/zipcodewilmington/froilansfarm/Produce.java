package com.zipcodewilmington.froilansfarm;

public interface Produce<T extends Edible> {


    void yield (T edible);


}

