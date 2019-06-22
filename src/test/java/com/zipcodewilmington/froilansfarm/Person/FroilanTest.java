package com.zipcodewilmington.froilansfarm.Person;

import org.junit.Test;

import static org.junit.Assert.*;

public class FroilanTest {

    @Test
    public void plant() {

        Crop crop = new Crop() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        Integer expected= 1;
        Froilan froilan = new Froilan();
        CropRow cropRow = new CropRow();

        ArrayList<Crop> list  = new ArrayList<>();

        list.add(crop);

        froilan.plant(crop);

        Integer actual= cropRow.getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eat() {
        Edible edible= new EdibleEgg();

        //eat(Edible food, Integer qty)
        Froilan froilan = new Froilan();
        froilan.eat(edible, 1);
        boolean expected= true;
        boolean actual= froilan.hasEaten();

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void makeNoise() {
    }

    @Test
    public void mount() {
    }

    @Test
    public void dismount() {
    }

    @Test
    public void ride() {
    }
}
