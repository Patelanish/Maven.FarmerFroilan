package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Person.Froilan;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StableTest {

    @Test
    public void testNullaryConst(){
        Stable stable = new Stable();
        Assert.assertNotNull(stable);
        Integer expected=0;
        Integer actual = stable.count();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testNonNullaryConst(){
        Integer expected=5;
        Stable stable = new Stable(expected);
        Assert.assertNotNull(stable);
        Integer actual = stable.count();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countRiddenToday() {
        Stable stable = new Stable(4);
        Horse horse = stable.getAnimal(0);
        Froilan froilan = new Froilan();
//        froilan.ride(horse);
        horse = stable.getAnimal(3);
//        froilan.ride(horse);
        Integer expected = 2;
        Integer actual = stable.countRiddenToday();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setAllRiddenFalse() {
        Stable stable = new Stable(4);
        Horse horse = stable.getAnimal(0);
        Froilan froilan = new Froilan();
//        froilan.ride(horse);
        horse = stable.getAnimal(3);
//        froilan.ride(horse);
        stable.setAllRiddenFalse();
        Integer expected = 0;
        Integer actual = stable.countRiddenToday();
        Assert.assertEquals(expected,actual);
    }
}