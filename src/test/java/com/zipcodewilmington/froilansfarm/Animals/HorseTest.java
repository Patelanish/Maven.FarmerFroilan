package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void eat() {
        //given
        Horse horse = new Horse();
        EarOfCorn earOfCorn   = new EarOfCorn();
        //when
        horse.eat(earOfCorn,1);
        //then
        Assert.assertEquals(horse.getEatList().size(),1);
    }

    @Test
    public void getEatList() {
        //given
        Horse horse = new Horse();
        EarOfCorn earOfCorn   = new EarOfCorn();
        //when
        horse.eat(earOfCorn,1);
        //then
        Assert.assertTrue(horse.hasEaten());
    }

    @Test
    public void hasEaten() {
        //given
        Horse horse = new Horse();
        //when
        horse.setHasEaten(true);
        //then
        Assert.assertTrue(horse.hasEaten());
    }

    @Test
    public void setHasEatenFalse() {
        //given
        Horse horse = new Horse();
        //when
        horse.setHasEatenFalse();
        //then
        Assert.assertTrue(!horse.hasEaten());
    }

    @Test
    public void setHasEaten() {
        //given
        Horse horse = new Horse();
        //when
        horse.setHasEaten(true);
        //then
        Assert.assertTrue(horse.hasEaten());
    }

    @Test
    public void makeNoise() {
        //given
        Horse horse = new Horse();
        //when
        horse.makeNoise();
    }

    @Test
    public void isMounted() {
        //given
        Horse horse = new Horse();
        //when
        boolean isMounted =  horse.isMounted();
        //then
        Assert.assertTrue(!isMounted);
    }

    @Test
    public void setIsMounted() {
        //given
        Horse horse = new Horse();
        //when
        horse.setIsMounted(true);
        //then
        Assert.assertTrue(horse.isMounted());
    }

    @Test
    public void isDismounted() {
        //given
        Horse horse = new Horse();
        //when
        boolean isMounted =  horse.isDismounted();
        //then
        Assert.assertTrue(!isMounted);
    }

    @Test
    public void isRiden() {
        //given
        Horse horse = new Horse();
        //when
        boolean isRiben =  horse.isRidden();
        //then
        Assert.assertTrue(!isRiben);
    }

    @Test
    public void setIsRiden() {
        //given
        Horse horse = new Horse();
        //when
        horse.setIsRidden(true);
        //then
        Assert.assertTrue(horse.isRidden());
    }
}
