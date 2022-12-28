package org.example.models;

import org.example.farm.ZebraArray;
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

    public Zebra[] mate(Zebra animal) {
        Zebra[] lst = new Zebra[new Random().nextInt(1, 10)];

        for(int i = 0; i < lst.length; i ++)
        {
            lst[i] = new Zebra(String.format("Zebra%d",i), new Random().nextInt(15), new Random().nextFloat(10, 100));
        }
        if(this.getArray() != null)
            ((ZebraArray)this.getArray()).add(lst);
        return lst;
    }

}
