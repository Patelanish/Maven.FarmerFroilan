package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class FroilanTest {

    @Test
    public void plant() {

        Crop crop = new CornStalk();
        Integer expected= 1;
        Froilan froilan = new Froilan();
        CropRow cropRow = new CropRow();

        ArrayList<Crop> list  = new ArrayList<Crop>();
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

        Rideable rideable= new Horse();
        Froilan froilan = new Froilan();

        froilan.mount(rideable);
        boolean expected = true;
        boolean actual= rideable.isMounted();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismount() {

        Rideable rideable= new Horse();
        Froilan froilan = new Froilan();

        froilan.dismount(rideable);
        assertTrue(rideable.isDismounted());


    }

    @Test
    public void ride() {

        Rideable rideable= new Horse();
        Froilan froilan = new Froilan();

        froilan.ride(rideable);
        assertTrue(rideable.isRiden());

    }
}
