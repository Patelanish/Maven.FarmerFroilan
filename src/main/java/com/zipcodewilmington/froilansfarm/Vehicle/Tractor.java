package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Collections.Farm;
import com.zipcodewilmington.froilansfarm.Collections.Store;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;

import java.util.List;

public class Tractor extends Vehicle implements FarmVehicle {
    
    public void harvest(CropRow row) {
        if(row.isFertilized()&&this.isMounted){
            List<Crop> cropList = row.getCropList();
            Store store = Farm.selectEdibleStore(cropList.get(0).yield());
            store.storeEdibles(cropList.size());
        }
    }

    public boolean isMounted() {
        return isMounted;
    }
    public void setIsMounted(Boolean isMounted){
        this.isMounted = isMounted;
    }

    public boolean isDismounted() {
        return !this.isMounted();
    }

    public boolean isRidden() {
        return isRidden;
    }

    @Override
    public void setIsRidden(Boolean bool) {
        this.isRidden = bool;
    }

    public void setIsRidden(boolean isRidden){
        this.isRidden = isRidden;
    }
}
