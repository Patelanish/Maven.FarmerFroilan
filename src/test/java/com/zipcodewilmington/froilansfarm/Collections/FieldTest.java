package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FieldTest {
    public Field field = Field.getInstance();

    @Test
    public void getInstanceNotNull() {
        Assert.assertNotNull(field);
    }

    @Test
    public void getRows() {
        List<CropRow> rows = Field.getRows();
        Integer expectedSize = 3;
        Integer actualSize=rows.size();
        Assert.assertEquals(expectedSize,actualSize);
    }

    @Test
    public void addRow() {
        List<CropRow> rows = Field.getRows();
        CropRow<? extends Crop> newRow = new CropRow<>();
        Integer initialSize = rows.size();
        Integer expectedSize = initialSize+1;
        Field.addRow(newRow);
        Integer actualSize=rows.size();
        Assert.assertEquals(expectedSize,actualSize);
    }

    @Test
    public void removeRow() {
        List<CropRow> rows = Field.getRows();
        Integer initialSize = rows.size();
        Integer expectedSize = initialSize-1;
        Field.removeRow(0);
        Integer actualSize=rows.size();
        Assert.assertEquals(expectedSize,actualSize);
    }
}