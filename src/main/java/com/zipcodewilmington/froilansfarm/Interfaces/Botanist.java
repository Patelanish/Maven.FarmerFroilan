package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;

public interface Botanist<T extends Crop> {

    void plant(T crop, CropRow<T> row);
}
