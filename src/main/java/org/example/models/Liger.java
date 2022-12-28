package org.example.models;

import org.example.farm.LionArray;
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

    public ILion[] mate(ICat animal) throws InstantiationException, IllegalAccessException {

//        ILion[] arr  = (ILion[]) mating(this.getClass().newInstance(), animal);
//
//        if(this.getArray() != null)
//            ((LionArray)this.getArray()).add(arr);
//
//        return arr;

        return new ILion[0];
    }
}
