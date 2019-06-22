package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Produce.*;

import java.util.ArrayList;
import java.util.List;

final public class Field {
    private static Field INSTANCE;

    final private static List<CropRow> rows = new ArrayList<>();

    public static Field getInstance(){
        if(INSTANCE==null){
            INSTANCE = new Field();
        }
        return INSTANCE;
    }

    private Field(){}

    public static List<CropRow> getRows() {
        return rows;
    }

    public static void addRow(CropRow<? extends Crop> row){
        rows.add(row);
    }

    public static void removeRow(int index){
        rows.remove(index);
    }
}
