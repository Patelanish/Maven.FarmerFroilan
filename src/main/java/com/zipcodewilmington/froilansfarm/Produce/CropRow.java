package com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CropRow<Crop> {
    List<Crop> cropList = new ArrayList<Crop>();

    public List<Crop> getCropList() {
        return cropList;
    }
    public void addCrops(Crop crop){
        cropList.add(crop);
    }
    public Map getCrops() {
        return null;
    }
}
