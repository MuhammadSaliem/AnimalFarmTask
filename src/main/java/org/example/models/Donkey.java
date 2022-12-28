package org.example.models;

import org.example.farm.DonkeyArray;
import org.example.interfaces.IDonkey;
import org.example.interfaces.IZebra;

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

    public Donkey[] mate(Donkey animal) {
        Donkey[] lst = new Donkey[new Random().nextInt(1, 10)];

        for(int i = 0; i < lst.length; i ++)
        {
            lst[i] = new Donkey(String.format("Donkey%d",i), new Random().nextInt(15), new Random().nextFloat(10, 100));
        }
        if(this.getArray() != null)
            ((DonkeyArray)this.getArray()).add(lst);

        return lst;
    }

    public Mule[] mate(Horse animal) {
        Mule[] lst = new Mule[new Random().nextInt(1, 10)];

        for(int i = 0; i < lst.length; i ++)
        {
            lst[i] = new Mule(String.format("Mule%d",i), new Random().nextInt(15), new Random().nextFloat(10, 100));
        }
        if(this.getArray() != null)
            ((DonkeyArray)this.getArray()).add(lst);
        return lst;
    }

}

