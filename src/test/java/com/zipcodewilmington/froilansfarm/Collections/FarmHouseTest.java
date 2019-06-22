package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Person.Froilan;
import com.zipcodewilmington.froilansfarm.Person.Froilanda;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FarmHouseTest {
    public FarmHouse farmhouse = FarmHouse.getInstance();

    @Test
    public void getInstanceNotNull() {
        Assert.assertNotNull(farmhouse);
    }

    @Test
    public void getPeople() {
        List<Person> people = FarmHouse.getPeople();
        Assert.assertNotNull(people);
        Integer expected = 2;
        Integer actual = people.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFroilan() {
        Froilan froilan = FarmHouse.getFroilan();
        Assert.assertNotNull(froilan);
    }

    @Test
    public void getFroilanda() {
        Froilanda froilanda = FarmHouse.getFroilanda();
        Assert.assertNotNull(froilanda);
    }
}