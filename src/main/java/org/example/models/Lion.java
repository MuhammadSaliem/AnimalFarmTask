package org.example.models;


import org.example.interfaces.ILigerSpecies;
import org.example.interfaces.ILionSpecies;

public class Lion implements ILionSpecies, ILigerSpecies {

    private String name;
    public Lion(){}

    public Lion(String name)
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
        System.out.println("Make Lion sound!");
    }
}
