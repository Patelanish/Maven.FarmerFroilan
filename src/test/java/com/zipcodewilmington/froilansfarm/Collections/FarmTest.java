package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Produce.Potato;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
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

    @Test
    public void getEggStore() {
        Store<EdibleEgg> eggstore = Farm.getEggStore();
        Assert.assertNotNull(eggstore);
    }

    @Test
    public void getCornStore() {
        Store<EarOfCorn> cornStore = Farm.getCornStore();
        Assert.assertNotNull(cornStore);
    }

    @Test
    public void getTomatoStore() {
        Store<Tomato> tomatoStore = Farm.getTomatoStore();
        Assert.assertNotNull(tomatoStore);
    }

    @Test
    public void getPotatoStore() {
        Store<Potato> potatoStore = Farm.getPotatoStore();
        Assert.assertNotNull(potatoStore);
    }

    @Test
    public void getField() {
        Field field = Farm.getField();
        Assert.assertNotNull(field);
    }

    @Test
    public void getCoops() {
        List<ChickenCoop> coops = Farm.getCoops();
        Assert.assertNotNull(coops);
    }

    @Test
    public void getTractor() {
        Tractor tractor = Farm.getTractor();
        Assert.assertNotNull(tractor);
    }

    @Test
    public void getCropDuster() {
        CropDuster cropDuster = Farm.getCropDuster();
        Assert.assertNotNull(cropDuster);
    }
}