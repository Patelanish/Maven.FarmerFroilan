package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;

public interface FarmVehicle {
    void harvest(CropRow<Crop> row);
}
