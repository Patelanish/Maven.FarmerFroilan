package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Produce.Potato;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.ArrayList;
import java.util.List;

final public class Farm {
    final private static Farm INSTANCE = new Farm(15,10);

    static FarmHouse farmHouse;

    static List<ChickenCoop> coops;
    static List<Stable> stables;

    static Tractor tractor;
    static CropDuster cropDuster;

    static Field field;

    static Store<EdibleEgg> eggStore;
    static Store<EarOfCorn> cornStore;
    static Store<Tomato> tomatoStore;
    static Store<Potato> potatoStore;

    public static Farm getInstance(){
        return INSTANCE;
    }

    public Farm(Integer numChickens, Integer numHorses) {
        farmHouse = FarmHouse.getInstance();
        coops = new ArrayList<ChickenCoop>();
        for (int i = 0; i < numChickens/ChickenCoop.maxAnimals; i++) {
            coops.add(new ChickenCoop(ChickenCoop.maxAnimals));
        }
        if(numChickens%ChickenCoop.maxAnimals>0)coops.add(new ChickenCoop(numChickens%ChickenCoop.maxAnimals));
        stables = new ArrayList<Stable>();
        for (int i = 0; i < numHorses/Stable.maxAnimals; i++) {
            stables.add(new Stable(Stable.maxAnimals));
        }
        if(numHorses%Stable.maxAnimals>0)stables.add(new Stable(numHorses%Stable.maxAnimals));
        field = Field.getInstance();
        eggStore = new Store<>(49,new EdibleEgg());
        cornStore = new Store<>(231, new EarOfCorn());
        tomatoStore = new Store<>(21, new Tomato());
        potatoStore = new Store<>(0, new Potato());
        tractor = new Tractor();
        cropDuster = new CropDuster();
    }

    static public Integer countHorses(){
        Integer counter=0;
        for(Stable stable:stables){
            counter+=stable.count();
        }
        return counter;
    }

    static public Integer countChickens(){
        Integer counter=0;
        for(ChickenCoop coop:coops){
            counter+=coop.count();
        }
        return counter;
    }

    static public List<Horse> getHorses(){
        List<Horse> horses = new ArrayList<>();
        for(Stable stable:stables){
            horses.addAll(stable.animals);
        }
        return horses;
    }

    static public List<Chicken> getChickens(){
        List<Chicken> chickens = new ArrayList<>();
        for(ChickenCoop coop:coops){
            chickens.addAll(coop.animals);
        }
        return chickens;
    }

    public static Store<EdibleEgg> getEggStore() {
        return eggStore;
    }

    public static Store<EarOfCorn> getCornStore() {
        return cornStore;
    }

    public static Store<Tomato> getTomatoStore() {
        return tomatoStore;
    }

    public static Store<Potato> getPotatoStore() {
        return potatoStore;
    }

    public static Field getField() {
        return field;
    }

    public static List<ChickenCoop> getCoops() {
        return coops;
    }

    public static Tractor getTractor() {
        return tractor;
    }

    public static CropDuster getCropDuster() {
        return cropDuster;
    }

    public static void setAllHorsesRiddenToFalse(){
        for(Stable stable:stables){
            stable.setAllRiddenFalse();
        }
    }

    public static Integer countHorsesRidden(){
        Integer answer=0;
        for(Stable stable:stables){answer+=stable.countRiddenToday();}
        return answer;
    }

    public static Integer countHasEaten(){
        Integer counter=0;
        for(Stable stable:stables){counter+=stable.getNumHasEaten();}
        for(ChickenCoop coop:coops){counter+=coop.getNumHasEaten();}
        counter+=FarmHouse.getNumHasEaten();
        return counter;
    }

    public static void setAllHasEatenToFalse(){
        for(Stable stable:stables){stable.setAllHasEatenFalse();}
        for(ChickenCoop coop:coops){coop.setAllHasEatenFalse();}
        FarmHouse.setAllHasEatenFalse();
    }
}
