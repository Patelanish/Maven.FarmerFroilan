package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FarmTest {

    @Test
    public void getInstance() {
        Farm farm = Farm.getInstance();
        Assert.assertNotNull(farm);
    }

    @Test
    public void countHorses() {
        Integer expected = 10;
        Integer actual = Farm.countHorses();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countChickens() {
        Integer expected = 15;
        Integer actual = Farm.countChickens();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHorses() {
        Integer expected = 10;
        Integer actual = Farm.getHorses().size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getChickens() {
        Integer expected = 15;
        Integer actual = Farm.getChickens().size();
        Assert.assertEquals(expected,actual);
    }
}