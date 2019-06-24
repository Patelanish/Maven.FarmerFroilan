package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void eat() {
        //given
        Chicken chicken = new Chicken();
        EarOfCorn earOfCorn   = new EarOfCorn();
        //when
        chicken.eat(earOfCorn,1);
        //then
        Assert.assertEquals(chicken.getEatList().size(),1);
    }

    @Test
    public void hasEaten() {
        //given
        Chicken chicken = new Chicken();
        EarOfCorn earOfCorn   = new EarOfCorn();
        //when
        chicken.eat(earOfCorn,1);
        //then
        Assert.assertTrue(chicken.hasEaten());
    }

    @Test
    public void setHasEatenFalse() {
        //given
        Chicken chicken = new Chicken();
        //when
        chicken.setHasEatenFalse();
        //then
        Assert.assertTrue(!chicken.hasEaten());
    }

    @Test
    public void setHasEaten() {
        //given
        Chicken chicken = new Chicken();
        //when
        chicken.setHasEaten(true);
        //then
        Assert.assertTrue(chicken.hasEaten());
    }

    @Test
    public void makeNoise() {
        //given
        Chicken chicken = new Chicken();
        //when
        chicken.makeNoise();
    }

    @Test
    public void yield() {
        //given
        Chicken chicken = new Chicken();
        chicken.setHasBeenFertilized(false);
        //when
        EdibleEgg egg = chicken.yield();
        //then
        Assert.assertTrue(egg!=null);
    }

    @Test
    public void isHasBeenFertilized() {
        //given
        Chicken chicken = new Chicken();
        chicken.setHasBeenFertilized(true);
        //when
        boolean hasBeenFertilized = chicken.isHasBeenFertilized();
        //then
        Assert.assertTrue(hasBeenFertilized);
    }

    @Test
    public void setHasBeenFertilized() {
        //given
        Chicken chicken = new Chicken();
        //when
        chicken.setHasBeenFertilized(true);
        //then
        Assert.assertTrue(chicken.isHasBeenFertilized());
    }
}
