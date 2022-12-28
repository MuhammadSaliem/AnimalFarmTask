package org.example.models;

import org.example.interfaces.*;

public class Liger extends Animal implements ILion, ITiger, ICat {

    private String name;

    public Liger(){}

    public Liger(String name)
    {
        setName(name);
    }

    public Liger(String name, int age, float weight)
    {
        super(name, age, weight);
    }
    @Override
    public void makeSound() {
        System.out.println("Make Liger sound!");
    }
    
}
