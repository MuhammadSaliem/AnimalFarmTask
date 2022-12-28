package org.example;

import org.example.farm.AnimalArray;
import org.example.farm.AnimalFarm;
import org.example.farm.DonkeyArray;
import org.example.files.FarmFile;
import org.example.interfaces.IAnimal;
import org.example.interfaces.ILion;
import org.example.models.*;

import java.lang.reflect.Array;
import java.text.MessageFormat;


public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {


//
//        AnimalFarm farm = new AnimalFarm();
//        Lion lion1 = (Lion) farm.lionList.find("lion1");
//        Tiger tiger1 = (Tiger)  farm.tigerList.find("tiger1");
//
//        farm.display();
//
//        var arr = lion1.mate(tiger1);
//        System.out.println(String.format("%s - %d", arr.toString(), arr.length));
//
//        farm.display();
//
//        Liger liger0 =(Liger) farm.lionList.find("Liger0");
//        farm.tigerList.moveTo(liger0);
//
//        farm.display();
//        System.out.println(MessageFormat.format("{0}", liger0.getName()));
//
//        Horse horse = (Horse)farm.horseList.find(0);
//        Donkey donkey = ((Donkey)farm.donkeyList.find(0));
//        horse.mate(donkey);
//
//        new FarmFile(farm).createSummaryFile();
//
//        IAnimal lion = new Lion();
//
//
//        foo(lion);
//
//        System.out.println(liger0.mating(new Lion(), new Lion()));
//        System.out.println(liger0.mating(new Tiger(), new Tiger()));
//        System.out.println(liger0.mating(new Zebra(), new Zebra()));
//        System.out.println(liger0.mating(new Donkey(), new Donkey()));
//        System.out.println(liger0.mating(new Horse(), new Horse()));


//        AnimalFarm farm = new AnimalFarm();
//        new FarmFile(farm).createSummaryFile();
//        farm.lionList.add(new Lion("Simba", 13, 67));
//
//        farm.tigerList.delete("tiger01");
//
//        // Encapsulation
//        farm.tigerList.add(new Liger("Liger11"));
//        farm.tigerList.add(new Liger("Liger11"));

//        new FarmFile(farm).createSummaryFile();
//        //System.out.println(farm.tigerList.find("tiger01").getName());
//
//        Lion simba = (Lion)farm.lionList.find("Simba");
//        Lion[] arr = simba.mate(new Lion("Lena"));
//        System.out.println(arr + " " + arr.length);
//
//        Liger ligerToMove = (Liger)farm.lionList.find("liger5");
//        farm.tigerList.moveTo(ligerToMove);
//
//        new FarmFile(farm).createSummaryFile();

        Lion simba = new Lion("Simba");
        AnimalFarm farm = new AnimalFarm();
        farm.lionList.moveTo(simba);
        System.out.println(farm.lionList.find("Simba").getName());

        var arr = simba.mate(new Tiger());
        System.out.println(arr+ " " + arr.length);
        new FarmFile(farm).createSummaryFile();
    }

    public static void foo(Object obj)
    {
        System.out.println("foo");
        if(obj.getClass() == Lion.class)
            System.out.println("Lion");
        else if (obj.getClass() == Tiger.class) {
            System.out.println("Tiger");
        }
        else
            System.out.println("Unknown");
    }

    public static void foo2(Object obj)
    {
        System.out.println("foo2");
        if(obj.getClass().equals(Lion.class))
            System.out.println("Lion");
        else if (obj.getClass().equals(Tiger.class)) {
            System.out.println("Tiger");
        }
        else
            System.out.println("Unknown");
    }
}
