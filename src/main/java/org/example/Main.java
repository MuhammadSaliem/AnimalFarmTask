package org.example;

import org.example.interfaces.IAnimal;
import org.example.interfaces.IDonkeySpecies;

import org.example.interfaces.ILionSpecies;
import org.example.models.*;

import java.util.ArrayList;
import java.util.zip.ZipError;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//        Donkey donkey = new Donkey("donkey1");
//
//        Lion lion = new Lion("lion1");
//
//        Lion liger = new Lion("liger1");
//
//        if(lion instanceof ILionSpecies)
//            System.out.println(true);
//
//        if(liger instanceof IAnimal)
//            System.out.println(true);

//        IAnimal liger = new Lion("liger1");
//        IAnimal mule = new Mule("mule1");
//
//        System.out.println(mule.getClass().getInterfaces()[1].getSimpleName());
//        mule.makeSound();

        IAnimal[] arr = new IAnimal[3];
        arr[0] = new Lion("lion1");
        arr[1] = new Mule("mule1");
        arr[2] = new Lion("liger1");

        AnimalArray<Lion> animalArray = new AnimalArray<Lion>(Lion.class, 2);

        Lion lion = new Lion("lion1");
        System.out.println(animalArray.isLegalAddition(lion));
        animalArray.insert(lion);


        Lion lion2 = new Lion("lion2");
        System.out.println(animalArray.isLegalAddition(lion2));
        animalArray.insert(lion2);

        Lion lion3 = new Lion("lion3");
        System.out.println(animalArray.isLegalAddition(lion3));
        animalArray.insert(lion3);

        Liger liger = new Liger("liger1");
        System.out.println(animalArray.isLegalAddition(liger));
        //animalArray.isLegalAddition(Lion.class, lion);

//        Horse horse = new Horse("horse1");
//        System.out.println(animalArray.isLegalAddition(horse));
//        animalArray.insert(horse);

        animalArray.print();


        AnimalArray<Donkey> arr2 = new AnimalArray<Donkey>(Donkey.class, 10);

        Donkey donkey = new Donkey("donkey1");
        arr2.insert(donkey);

        Mule mule = new Mule("mule1");
        arr2.insert(mule);

        Zebra zebra = new Zebra("zebra1");
        arr2.insert(zebra);

        arr2.print();

        AnimalArray<Horse> arr3 = new AnimalArray<Horse>(Horse.class, 10);

        Horse horse = new Horse("horse3");
        arr3.insert(horse);

        Mule mule2 = new Mule("mule3");
        arr3.insert(mule2);


        arr3.Delete(0);
        arr3.print();


//
//        Liger liger = new Liger("liger1");
//        animalArray.isLegalAddition(Lion.class, lion);
//
//        //animalArray.add(new Tiger("tiger1"));
//
//        ILionSpecies x1 = new Lion("lion1");
//        ILionSpecies x2 = new Liger("liger2");
//
//        System.out.println(x1.getClass().getSimpleName());
//        System.out.println(x2.getClass().getSimpleName());
//
//        IAnimal[] arr2 = new ILionSpecies[2];
//        arr2[0] = x1;
//        arr2[1] = x2;
//
//        System.out.println(arr2[0].getClass().getSimpleName());
//        System.out.println(arr2[1].getClass().getSimpleName());






    }
}