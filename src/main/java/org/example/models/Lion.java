package org.example.models;


import org.example.farm.LionArray;
import org.example.interfaces.IAnimal;
import org.example.interfaces.ICat;
import org.example.interfaces.ILion;

import java.util.Random;

public class Lion extends Animal implements ILion {
    public Lion() {}

    public Lion(String name)
    {
        this.setName(name);
    }

    public Lion(String name, int age, float weight)
    {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Make Lion sound!");
    }



    public ILion[] mate(ICat animal) throws InstantiationException, IllegalAccessException {

        ILion[] arr = (ILion[]) mating(this.getClass().newInstance(), animal);

        if(this.getArray() != null)
            ((LionArray)this.getArray()).add(arr);

        return arr;
    }

}
