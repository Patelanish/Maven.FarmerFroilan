package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Person.Froilan;
import com.zipcodewilmington.froilansfarm.Person.Froilanda;
import com.zipcodewilmington.froilansfarm.Person.Person;

import java.util.ArrayList;
import java.util.List;

final public class FarmHouse {
    private static FarmHouse INSTANCE;

    final private static List<Person> people = new ArrayList<>();
    final private static Froilan froilan=new Froilan();
    final private static Froilanda froilanda=new Froilanda();

    public static FarmHouse getInstance(){
        if(INSTANCE==null){
            INSTANCE = new FarmHouse();
        }
        return INSTANCE;
    }

    public static List<Person> getPeople() {
        return people;
    }

    public static Froilan getFroilan(){return froilan;}

    public static Froilanda getFroilanda(){return froilanda;}

    private FarmHouse(){
        people.add(froilan);
        people.add(froilanda);
    }

    public static Integer getNumHasEaten(){
        Integer counter=0;
        for(int i = 0; i<people.size();i++){
            if(people.get(i).hasEaten())counter++;
        }
        return counter;
    }

    public static void setAllHasEatenFalse(){
        for(int i = 0; i<people.size();i++){
            people.get(i).setHasEatenFalse();
        }
    }
}
