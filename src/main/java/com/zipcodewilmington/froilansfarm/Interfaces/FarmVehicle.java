package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Produce.CropRow;

public interface FarmVehicle<E extends Edible> {

    E harvest(CropRow cropRow);


}
