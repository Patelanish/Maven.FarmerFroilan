package com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CropRow<C extends Crop> {
    List<C> cropList = new ArrayList<>();

    public CropRow() {
        this.isFertilized = false;
    }
    public List<C> getCropList() {
        return cropList;
    }
    public void addCrops(C crop){
        cropList.add(crop);
    }

    public boolean isFertilized() {
        return isFertilized;
    }

    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }

    private boolean isFertilized;
}
