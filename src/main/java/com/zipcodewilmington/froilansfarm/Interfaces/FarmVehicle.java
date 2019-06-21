package com.zipcodewilmington.froilansfarm.Interfaces;

public interface FarmVehicle<E extends Edible> {

    E harvest(Produce produce);

}
