package com.zipcodewilmington.froilansfarm.Utility;

import com.zipcodewilmington.froilansfarm.Collections.Farm;
import com.zipcodewilmington.froilansfarm.Collections.FarmHouse;
import com.zipcodewilmington.froilansfarm.Collections.Field;
import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class WeeklyScheduleTest {
    private InputStream testInputStream = new ByteArrayInputStream("ok\nok\nok\nok\nok\nok\nok\nok\nok\nok\nok\nok\nok\nok\nok\nok\n".getBytes());
    private Console console = new Console(testInputStream,System.out);
    private WeeklySchedule ws = new WeeklySchedule(console);

    @Test
    public void testDailyActivitiesBegin() {
        ws.dailyActivitiesBegin();
        Integer expectedEaten = 27;
        Integer actualEaten = Farm.countHasEaten();
        Integer expectedRiden = 10;
        Integer actualRiden = Farm.countHorsesRidden();
        Assert.assertEquals(expectedEaten,actualEaten);
        Assert.assertEquals(expectedRiden,actualRiden);

    }

    @Test
    public void testDailyActivitiesEnd() {
        ws.dailyActivitiesBegin();
        ws.dailyActivitiesEnd();
        Integer expectedEaten = 0;
        Integer actualEaten = Farm.countHasEaten();
        Integer expectedRiden = 0;
        Integer actualRiden = Farm.countHorsesRidden();
        Assert.assertEquals(expectedEaten,actualEaten);
        Assert.assertEquals(expectedRiden,actualRiden);
    }

    @Test
    public void sundaySchedule() {
        Integer expectedBefore = 0;
        Integer actualBefore = Field.getRows().size();
        Assert.assertEquals(expectedBefore,actualBefore);
        ws.sundaySchedule();
        Integer expectedAfter = 3;
        Integer actualAfter = Field.getRows().size();
        Assert.assertEquals(expectedAfter,actualAfter);

    }

    @Test
    public void mondaySchedule() {
        Field.clear();
        ws.sundaySchedule();
        Integer expectedBefore = 0;
        Integer actualBefore = Field.countFertilized();
        Assert.assertEquals(expectedBefore,actualBefore);
        ws.mondaySchedule();
        Integer expectedAfter = 3;
        Integer actualAfter = Field.countFertilized();
        Assert.assertEquals(expectedAfter,actualAfter);
    }

    @Test
    public void tuesdaySchedule() {
        Field.clear();
        ws.sundaySchedule();
        ws.mondaySchedule();
        Integer cornBefore = Farm.getCornStore().getCount();
        Integer tomatoesBefore = Farm.getTomatoStore().getCount();
        Integer potatoesBefore = Farm.getPotatoStore().getCount();
        Integer cornExpected = cornBefore+Field.getRows().get(0).getCropList().size();
        Integer tomatoesExpected = tomatoesBefore+Field.getRows().get(1).getCropList().size();
        Integer potatoesExpected = potatoesBefore+Field.getRows().get(2).getCropList().size();
        ws.tuesdaySchedule();
        Integer cornActual = Farm.getCornStore().getCount();
        Integer tomatoesActual = Farm.getTomatoStore().getCount();
        Integer potatoesActual = Farm.getPotatoStore().getCount();
        Assert.assertEquals(cornExpected,cornActual);
        Assert.assertEquals(tomatoesExpected,tomatoesActual);
        Assert.assertEquals(potatoesExpected,potatoesActual);
    }

    @Test
    public void wednesdaySchedule() {
        Integer before = Farm.getEggStore().getCount();
        Integer expected = before+15;
        ws.wednesdaySchedule();
        Integer actual = Farm.getEggStore().getCount();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void thursdaySchedule() {
        Integer expectedBefore = 0;
        Integer actualBefore = Field.getRows().size();
        Assert.assertEquals(expectedBefore,actualBefore);
        ws.thursdaySchedule();
        Integer expectedAfter = 3;
        Integer actualAfter = Field.getRows().size();
        Assert.assertEquals(expectedAfter,actualAfter);
    }

    @Test
    public void fridaySchedule() {
        Field.clear();
        ws.thursdaySchedule();
        Integer expectedBefore = 0;
        Integer actualBefore = Field.countFertilized();
        Assert.assertEquals(expectedBefore,actualBefore);
        ws.fridaySchedule();
        Integer expectedAfter = 3;
        Integer actualAfter = Field.countFertilized();
        Assert.assertEquals(expectedAfter,actualAfter);
    }

    @Test
    public void saturdaySchedule() {
        Field.clear();
        ws.thursdaySchedule();
        ws.fridaySchedule();
        Integer cornBefore = Farm.getCornStore().getCount();
        Integer tomatoesBefore = Farm.getTomatoStore().getCount();
        Integer potatoesBefore = Farm.getPotatoStore().getCount();
        Integer cornExpected = cornBefore+Field.getRows().get(0).getCropList().size();
        Integer tomatoesExpected = tomatoesBefore+Field.getRows().get(1).getCropList().size();
        Integer potatoesExpected = potatoesBefore+Field.getRows().get(2).getCropList().size();
        ws.fridaySchedule();
        Integer cornActual = Farm.getCornStore().getCount();
        Integer tomatoesActual = Farm.getTomatoStore().getCount();
        Integer potatoesActual = Farm.getPotatoStore().getCount();
        Assert.assertEquals(cornExpected,cornActual);
        Assert.assertEquals(tomatoesExpected,tomatoesActual);
        Assert.assertEquals(potatoesExpected,potatoesActual);
    }

    @Test
    public void run() {
        Integer cornBefore = Farm.getCornStore().getCount();
        Integer tomatoesBefore = Farm.getTomatoStore().getCount();
        Integer potatoesBefore = Farm.getPotatoStore().getCount();
        Integer eggsBefore = Farm.getEggStore().getCount();
        ws.run();
        Integer cornAfter = Farm.getCornStore().getCount();
        Integer tomatoesAfter = Farm.getTomatoStore().getCount();
        Integer potatoesAfter = Farm.getPotatoStore().getCount();
        Integer eggsAfter = Farm.getEggStore().getCount();
        Assert.assertTrue(cornAfter>cornBefore);
        Assert.assertTrue(tomatoesAfter>tomatoesBefore);
        Assert.assertTrue(potatoesAfter>potatoesBefore);
        Assert.assertTrue(eggsAfter>eggsBefore);

    }
}