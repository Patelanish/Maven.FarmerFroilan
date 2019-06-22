package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;

public interface Produce<T extends Edible> {


    EdibleEgg yield (T edible);


}

