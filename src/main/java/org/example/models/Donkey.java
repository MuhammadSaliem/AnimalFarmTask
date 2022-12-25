package org.example.models;

import org.example.interfaces.IDonkeySpecies;
import org.example.interfaces.IMuleSpecies;

public class Donkey implements IDonkeySpecies, IMuleSpecies {
    private String name;

    public Donkey(){}
    public Donkey(String name)
    {
        this.setName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Make Donkey sound!");
    }
}

