package org.example.models;

import org.example.farm.HorseArray;
import org.example.interfaces.IAnimal;
import org.example.interfaces.IHorse;

import java.util.Random;

public class Horse extends Animal implements IHorse, IAnimal {


    public Horse(){}
    public Horse(String name)
    {
        this.setName(name);
    }

    public Horse(String name, int age, float weight)
    {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Make Horse sound!");
    }


    public Horse[] mate(Horse animal) {
        Horse[] lst = new Horse[new Random().nextInt(1, 10)];

        for(int i = 0; i < lst.length; i ++)
        {
            lst[i] = new Horse(String.format("Horse%d",i), new Random().nextInt(15), new Random().nextFloat(10, 100));
        }
        if(this.getArray() != null)
            ((HorseArray)this.getArray()).add(lst);
        return lst;
    }

    public Mule[] mate(Donkey animal) {
        Mule[] lst = new Mule[new Random().nextInt(1, 10)];

        for(int i = 0; i < lst.length; i ++)
        {
            lst[i] = new Mule(String.format("Mule%d",i), new Random().nextInt(15), new Random().nextFloat(10, 100));
        }
        if(this.getArray() != null)
            ((HorseArray)this.getArray()).add(lst);
        return lst;
    }

}
