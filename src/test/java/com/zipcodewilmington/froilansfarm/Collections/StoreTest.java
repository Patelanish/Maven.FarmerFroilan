package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import org.junit.Assert;
import org.junit.Test;


public class StoreTest {

    @Test
    public void getCount() {
        Integer expected = 42;
        Store<EdibleEgg> store = new Store(expected,new EdibleEgg());
        Integer actual = store.getCount();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTrue() {
        Integer initial = 42;
        Integer eaten = 21;
        Integer expected = initial-eaten;
        Store<EdibleEgg> store = new Store(initial,new EdibleEgg());
        Boolean success = store.eat(new EdibleEgg(),eaten);
        Assert.assertTrue(success);
        Integer actual = store.getCount();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatFalse() {
        Integer expected = 42;
        Integer eaten = 145000;
        Store<EdibleEgg> store = new Store(expected,new EdibleEgg());
        Boolean success = store.eat(new EdibleEgg(),eaten);
        Assert.assertFalse(success);
        Integer actual = store.getCount();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void store() {
        Integer initial = 42;
        Integer stored = 21;
        Integer expected = initial+stored;
        Store<EdibleEgg> store = new Store(initial,new EdibleEgg());
        store.store(new EdibleEgg(),stored);
        Integer actual = store.getCount();
        Assert.assertEquals(expected,actual);
    }
}