package org.example.models;

import org.example.interfaces.IDonkey;
import org.example.interfaces.IHorse;

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

}
