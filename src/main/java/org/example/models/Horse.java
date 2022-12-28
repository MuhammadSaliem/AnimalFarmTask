package org.example.models;

import org.example.farm.DonkeyArray;
import org.example.farm.HorseArray;
import org.example.interfaces.*;
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


    public IHorse[] mate(IEquus animal) throws InstantiationException, IllegalAccessException {

        IHorse[] arr = (IHorse[]) mating(this.getClass().newInstance(), animal);

        if(this.getArray() != null)
            ((HorseArray)this.getArray()).add(arr);

        return arr;
    }

}
