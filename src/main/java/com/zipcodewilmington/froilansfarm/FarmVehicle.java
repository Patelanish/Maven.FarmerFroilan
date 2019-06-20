package com.zipcodewilmington.froilansfarm;

public interface FarmVehicle<E extends Edible> {

    E harvest(E edible);

}
