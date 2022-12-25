package org.example.models;

import org.example.interfaces.ILigerSpecies;
import org.example.interfaces.ILionSpecies;
import org.example.interfaces.ITigerSpecies;

public class Liger implements ILigerSpecies {

    private String name;

    public Liger(){}
    public Liger(String name)
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
        System.out.println("Make Liger sound!");
    }
}
