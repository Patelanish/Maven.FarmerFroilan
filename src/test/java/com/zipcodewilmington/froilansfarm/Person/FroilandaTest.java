package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FroilandaTest {

    @Test
    public void eatEggTest() {
        Edible edible = new EdibleEgg();
        Froilanda froilanda = new Froilanda();

        froilanda.eat(edible, 1);
        boolean expected = true;
        boolean actual = froilanda.hasEaten;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTomatoTest() {
        Edible edible = new Tomato();
        Froilanda froilanda = new Froilanda();

        froilanda.eat(edible, 5);
        boolean expected = true;
        boolean actual = froilanda.hasEaten;

    }
        @Test
        public void makeNoiseTest () {

        Froilanda froilanda = new Froilanda();
        froilanda.makeNoise();
        String expected = "Let's get this bread!";
        assertEquals(expected, "Let's get this bread!");

        }

        @Test
        public void mount () {

            Rideable rideable= new CropDuster();
            Froilanda froilanda = new Froilanda();

            froilanda.mount(rideable);
            boolean expected = true;
            boolean actual= rideable.isMounted;

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void dismount () {
            Rideable rideable= new CropDuster();
            Froilanda froilanda = new Froilanda();

            froilanda.dismount(rideable);
            assertTrue(rideable.isDismounted);

        }

        @Test
        public void ride () {

            Rideable rideable= new CropDuster();
            Froilanda froilanda = new Froilanda();

            froilanda.ride(rideable);
            assertTrue(rideable.isRidden);

        }
    }
