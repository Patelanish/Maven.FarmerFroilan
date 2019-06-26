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
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.List;

public class WeeklySchedule {
    private Console console;
    private static Farm farm;
    private static FarmHouse farmHouse = FarmHouse.getInstance();
    private static Froilan froilan;
    private static Froilanda froilanda;
    private static Field field;
    private static List<ChickenCoop> coops;
    private static Tractor tractor = Farm.getTractor();
    private static CropDuster cropDuster = Farm.getCropDuster();

    public WeeklySchedule(Console console){
        this.console=console;
        farm = Farm.getInstance();
        farmHouse = FarmHouse.getInstance();
        froilan = FarmHouse.getFroilan();
        froilanda = FarmHouse.getFroilanda();
        field = Farm.getField();
        coops = Farm.getCoops();
    }

    public WeeklySchedule(){
        this(new Console(System.in,System.out));
    }

    public void run(){
        sundaySchedule();
        mondaySchedule();
        tuesdaySchedule();
        wednesdaySchedule();
        thursdaySchedule();
        fridaySchedule();
        saturdaySchedule();
        console.println("Alrighty then, another week come and gone on Froilan's farm.\n" +
                "Bright and early tomorrow we start all over again\n" +
                "E I E I -- oh, to hell with farming, I'm gonna go learn some coding instead.");
    }

    public void dailyActivitiesBegin(){
        console.println("Good morning!\nCurrently, we have:\n"+
        String.format("\t%d eggs;\n",Farm.getEggStore().getCount())+
                String.format("\t%d ears of corn;\n",Farm.getCornStore().getCount())+
                String.format("\t%d tomatoes;\n",Farm.getTomatoStore().getCount())+
                String.format("\t%d potatoes.",Farm.getPotatoStore().getCount()));
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
    public void dailyActivitiesEnd(){
        Farm.setAllHorsesRiddenToFalse();
        Farm.setAllHasEatenToFalse();
        console.getStringInput("Good night!");
    }

    protected void sundaySchedule(){
        dailyActivitiesBegin();
        console.println("It's Sunday. Time for some planting!");
        froilan.plant(new CornStalk());
        console.println("Row 0 planted with corn.");
        froilan.plant(new TomatoPlant());
        console.println("Row 1 planted with tomatoes.");
        froilan.plant(new PotatoPlant());
        console.println("Row 2 planted with potatoes.\nGood work, Farmer Froilan!");
        dailyActivitiesEnd();
    }

    protected void mondaySchedule(){
        dailyActivitiesBegin();
        console.println("It's Monday. Let's prep the crop-duster!\nGood luck, Froilanda!");
        froilanda.mount(cropDuster);
        for(int i=0;i<Field.getRows().size();i++)cropDuster.fertilize(Field.getRows().get(i));
        froilanda.dismount(cropDuster);
        console.println("Whew, it's was touch & go, but the ole bucket of bolts made it through another day!" +
                "\nWell done, Froilanda, that must have been terrifying.  Why don't you take a few days off?\n" +
                "Maybe you should go inspect our store of moonshine. Oh, well maybe wait until after flying, next time.");
        dailyActivitiesEnd();
    }

    protected void tuesdaySchedule(){
        dailyActivitiesBegin();
        console.println("It's Tuesday. Froilan, fire up that tractor for the harvest.");
        froilan.mount(tractor);
        for(int i=0;i<Field.getRows().size();i++)tractor.harvest(Field.getRows().get(i));
        froilan.dismount(tractor);
        console.println("Well, all the crops are in.  Hard to believe this pays the bills,\n" +
                "but what can you expect when you harvest two days after planting?\n" +
                "Time to call the congressman and make sure they aren't talking about cutting the subsidies again.");
        dailyActivitiesEnd();
    }

    protected void wednesdaySchedule(){
        dailyActivitiesBegin();
        console.println("It's Wednesday. Let's see what those chickens have been up to.\n" +
                "Froilan, grab that pitchfork, just in case.");
        froilan.harvest(Farm.getChickens());
        console.println("Okay, all the eggs have been gathered.\n" +
                "Y'know, we should probably think about doing this more than once a week.\n" +
                "Too bad Froilanda's nerves are still shot.");
        dailyActivitiesEnd();
    }

    protected void thursdaySchedule(){
        dailyActivitiesBegin();
        console.println("It's Thursday. Time for some more planting!");
        froilan.plant(new CornStalk());
        console.println("Row 0 planted with corn.");
        froilan.plant(new TomatoPlant());
        console.println("Row 1 planted with tomatoes.");
        froilan.plant(new PotatoPlant());
        console.println("Row 2 planted with potatoes.\nFarmer Froilan, you've done it again!");
        dailyActivitiesEnd();
    }

    protected void fridaySchedule(){
        dailyActivitiesBegin();
        console.println("It's Friday. Froilanda, where did you park the crop-duster?\n" +
                "Oh, there it is in the horse paddock, let's see...\n*clunk*\n" +
                "... oops, I hope that wasn't important. Ok, off you go!");
        froilanda.mount(cropDuster);
        for(int i=0;i<Field.getRows().size();i++)cropDuster.fertilize(Field.getRows().get(i));
        froilanda.dismount(cropDuster);
        console.println("Froilanda, looks like you succeeded in dusting all the coops, in addition to the crops.\n"+
                "\nRemember what I told you about saving the moonshine until after?\n" +
                "Oh well, at least we won't be needing to harvest any edible eggs for five more days.");
        dailyActivitiesEnd();
    }

    protected void saturdaySchedule(){
        dailyActivitiesBegin();
        console.println("It's Saturday. Tractor's ready for some harvesting.\n");
        froilan.mount(tractor);
        for(int i=0;i<Field.getRows().size();i++)tractor.harvest(Field.getRows().get(i));
        froilan.dismount(tractor);
        console.println("And another harvest is in.");
        dailyActivitiesEnd();
    }
}
