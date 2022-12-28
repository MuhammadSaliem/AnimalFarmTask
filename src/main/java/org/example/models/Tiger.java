package org.example.models;

import org.example.farm.LionArray;
import org.example.farm.TigerArray;
import org.example.interfaces.IAnimal;
import org.example.interfaces.ICat;
import org.example.interfaces.ILion;
import org.example.interfaces.ITiger;

import javax.swing.*;
import java.util.Random;

public class Tiger extends Animal implements ITiger{

    public Tiger(){}

    public Tiger(String name)
    {
        this.setName(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Make Tiger sound!");
    }

    public Tiger(String name, int age, float weight)
    {
        super(name, age, weight);
    }

    public ITiger[] mate(ICat animal) throws InstantiationException, IllegalAccessException {

        ITiger[] arr = null;

        // if liger return empty array
        // liger cannot give birth
        if(animal.getClass() == Liger.class)
            return new ITiger[0];

            // if lion or tiger mate and give birth
        else if (animal.getClass() == Lion.class
                || animal.getClass() == Tiger.class)
        {
            // send new Tiger() instead of this to prevent override the parent properties
            arr = (ITiger []) mating(new Tiger(), animal);

            if(this.getArray() != null)
                ((TigerArray)this.getArray()).add(arr);
        }

        return arr;
    }
}
