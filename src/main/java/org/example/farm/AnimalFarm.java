package org.example.farm;

import org.example.models.*;

import java.util.Random;

public class AnimalFarm {
    public LionArray lionList;
    public TigerArray tigerList;
    public ZebraArray zebraList;
    public DonkeyArray donkeyList;
    public HorseArray horseList;

    public AnimalFarm() {
        lionList = new LionArray(5);
        tigerList = new TigerArray(5);
        zebraList = new ZebraArray(5);
        donkeyList = new DonkeyArray(5);
        horseList = new HorseArray(5);


        for(int i = 0; i < 4; i++)
        {
            lionList.add(new Lion("lion"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
        lionList.add(new Liger("liger5", new Random().nextInt(15), new Random().nextFloat(10, 100)));

        for(int i = 0; i < 4; i++)
        {
            tigerList.add(new Tiger("tiger"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
        tigerList.add(new Liger("liger5", new Random().nextInt(15), new Random().nextFloat(10, 100)));

        for(int i = 0; i < 9; i++)
        {
            zebraList.add(new Zebra("zebra"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
        zebraList.add(new Donkey("donkey10", new Random().nextInt(15), new Random().nextFloat(10, 100)));

        for(int i = 0; i < 7; i++)
        {
            donkeyList.add(new Donkey("donkey"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
        for(int i = 0; i < 17; i++)
        {
            horseList.add(new Horse("horse"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
        for(int i = 0; i < 3; i++)
        {
            horseList.add(new Mule("Mule"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
    }

    public void display(){
        lionList.print("Lion");
        tigerList.print("Tiger");
        zebraList.print("Zebra");
        donkeyList.print("Donkey");
        horseList.print("Horse");
    }
}
