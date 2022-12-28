package org.example.models;

import org.example.farm.DonkeyArray;
import org.example.farm.TigerArray;
import org.example.interfaces.*;
import org.example.interfaces.IDonkey;

public class Mule extends Animal implements IDonkey, IHorse {

    public Mule(){}
    public Mule(String name)
    {
        this.setName(name);
    }

    public Mule(String name, int age, float weight)
    {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Make Mule sound!");
    }

    public IDonkey[] mate(IEquus animal) throws InstantiationException, IllegalAccessException {

//        IDonkey[] arr = (IDonkey[]) mating(this.getClass().newInstance(), animal);
//
//        if(this.getArray() != null)
//            ((DonkeyArray)this.getArray()).add(arr);
//
//        return arr;

        return new IDonkey[0];
    }

}
