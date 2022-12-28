package org.example.models;

import org.example.farm.LionArray;
import org.example.farm.ZebraArray;
import org.example.interfaces.ICat;
import org.example.interfaces.IEquus;
import org.example.interfaces.ILion;
import org.example.interfaces.IZebra;

import java.util.Random;

public class Zebra extends Animal implements IZebra {
    public Zebra() {}

    public Zebra(String name) {
        this.setName(name);
    }

    public Zebra(String name, int age, float weight)
    {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Make Zebra sound!");
    }

    public IZebra[] mate(IZebra animal) throws InstantiationException, IllegalAccessException {

        IZebra[] arr = (IZebra[]) mating(this.getClass().newInstance(), animal);

        if(this.getArray() != null)
            ((ZebraArray)this.getArray()).add(arr);

        return arr;
    }

}
