package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenCoopTest {

    @Test
    public void testNullaryConst(){
        ChickenCoop coop = new ChickenCoop();
        Assert.assertNotNull(coop);
        Integer expected=0;
        Integer actual = coop.count();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testNonNullaryConst(){
        Integer expected=5;
        ChickenCoop coop = new ChickenCoop(expected);
        Assert.assertNotNull(coop);
        Integer actual = coop.count();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countFertilized() {
        ChickenCoop coop = new ChickenCoop(5);
        Chicken hen = coop.getAnimal(2);
//        hen.fertilize();
        hen = coop.getAnimal(0);
//        hen.fertilize();
        Integer expected = 2;
        Integer actual = coop.countFertilized();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAllFertilizedFalse() {
        ChickenCoop coop = new ChickenCoop(5);
        Chicken hen = coop.getAnimal(2);
//        hen.fertilize();
        hen = coop.getAnimal(0);
//        hen.fertilize();
        Integer expected = 0;
        coop.setAllFertilizedFalse();
        Integer actual = coop.countFertilized();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void harvest() {
        Integer numChickens=5;
        ChickenCoop coop = new ChickenCoop(numChickens);
        Chicken hen = coop.getAnimal(2);
//        hen.fertilize();
        hen = coop.getAnimal(0);
//        hen.fertilize();
        Integer expectedFert=2;
        Integer actualFert=coop.countFertilized();
        Assert.assertEquals(expectedFert,actualFert);
        Integer expectedHarv = numChickens-expectedFert;
        Integer actualHarv = coop.harvest();
        Assert.assertEquals(expectedHarv,actualHarv);
        expectedFert=0;
        actualFert=coop.countFertilized();
        Assert.assertEquals(expectedFert,actualFert);
    }
}