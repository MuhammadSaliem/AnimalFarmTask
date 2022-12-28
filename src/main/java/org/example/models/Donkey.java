package org.example.models;

import org.example.farm.DonkeyArray;
import org.example.farm.HorseArray;
import org.example.interfaces.*;
import org.example.interfaces.IDonkey;

import java.util.Random;

public class Donkey extends Animal implements IDonkey, IZebra {

    public Donkey() {}
    public Donkey(String name)
    {
        setName(name);
    }

    public Donkey(String name, int age, float weight)
    {
        super(name, age, weight);
    }


    @Override
    public void makeSound() {
        System.out.println("Make Donkey sound!");
    }

    public IDonkey[] mate(IEquus animal) throws InstantiationException, IllegalAccessException {

        IDonkey[] arr = (IDonkey[]) mating(this.getClass().newInstance(), animal);

        if(this.getArray() != null)
            ((DonkeyArray)this.getArray()).add(arr);

        return arr;
    }

}

