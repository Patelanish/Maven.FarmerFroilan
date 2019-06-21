package com.zipcodewilmington.froilansfarm.Utility;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Collections.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Collections.Farm;
import com.zipcodewilmington.froilansfarm.Collections.FarmHouse;
import com.zipcodewilmington.froilansfarm.Collections.Field;
import com.zipcodewilmington.froilansfarm.Person.Froilan;
import com.zipcodewilmington.froilansfarm.Person.Froilanda;
import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
//import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.PotatoPlant;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;

import java.util.List;

public class WeeklySchedule {
    private static Farm farm;
    private static FarmHouse farmHouse = FarmHouse.getInstance();
    private static Froilan froilan;
    private static Froilanda froilanda;
    private static Field field;
    private static List<ChickenCoop> coops;

    public WeeklySchedule(){
        farm = Farm.getInstance();
        farmHouse = FarmHouse.getInstance();
        froilan = FarmHouse.getFroilan();
        froilanda = FarmHouse.getFroilanda();
        field = Farm.getField();
        coops = Farm.getCoops();
    }

    public void run(){
        sundaySchedule();
        mondaySchedule();
        tuesdaySchedule();
        wednesdaySchedule();
        thursdaySchedule();
        fridaySchedule();
        saturdaySchedule();
    }

    public void dailyActivities(){
        List<Horse> horses = Farm.getHorses();
        for(int i=0;i<horses.size();i++){
            froilan.ride(horses.get(i));
            horses.get(i).eat(Farm.getCornStore().getEdible(),3);
        }
        froilan.eat(Farm.getEggStore().getEdible(),5);
        froilan.eat(Farm.getCornStore().getEdible(),1);
        froilan.eat(Farm.getTomatoStore().getEdible(),2);
        froilanda.eat(Farm.getEggStore().getEdible(),2);
        froilanda.eat(Farm.getCornStore().getEdible(),2);
        froilanda.eat(Farm.getTomatoStore().getEdible(),1);
    }

    protected void sundaySchedule(){
        dailyActivities();
        froilan.plant(new CornStalk(),Field.getRows().get(0));
        froilan.plant(new TomatoPlant(),Field.getRows().get(1));
        froilan.plant(new PotatoPlant(),Field.getRows().get(2));
    }

    protected void mondaySchedule(){
        dailyActivities();
        for(int i=0;i<Field.getRows().size();i++)froilanda.fertilize(Farm.getCropDuster(),Field.getRows().get(i));
    }

    protected void tuesdaySchedule(){
        dailyActivities();
        for(int i=0;i<Field.getRows().size();i++)froilan.harvest(Farm.getTractor(),Field.getRows().get(i));
    }

    protected void wednesdaySchedule(){
        dailyActivities();
        for(int i=0;i<coops.size();i++)froilan.harvest(coops.get(i));
    }

    protected void thursdaySchedule(){
        dailyActivities();
        froilan.plant(new CornStalk(),Field.getRows().get(0));
        froilan.plant(new TomatoPlant(),Field.getRows().get(1));
        froilan.plant(new PotatoPlant(),Field.getRows().get(2));
    }

    protected void fridaySchedule(){
        dailyActivities();
        for(int i=0;i<Field.getRows().size();i++)froilanda.fertilize(Farm.getCropDuster(),Field.getRows().get(i));
    }

    protected void saturdaySchedule(){
        dailyActivities();
        for(int i=0;i<Field.getRows().size();i++)froilan.harvest(Farm.getTractor(),Field.getRows().get(i));
    }
}
