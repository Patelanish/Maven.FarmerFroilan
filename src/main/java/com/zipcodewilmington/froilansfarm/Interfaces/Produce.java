package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;

public interface Produce<T extends Edible> {


    Edible yield ();


}

