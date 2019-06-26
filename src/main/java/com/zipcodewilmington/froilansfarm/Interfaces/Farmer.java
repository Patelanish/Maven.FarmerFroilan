package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Collections.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.List;

public interface Farmer extends Rider, Botanist {

  //  public void harvest(Tractor tractor, CropRow<Crop> row);
    public void harvest(List<Chicken> chickens);
}
