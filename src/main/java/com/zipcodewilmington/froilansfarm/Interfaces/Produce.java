package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public interface Produce<T extends Edible> {


    void yield (T edible);


}

