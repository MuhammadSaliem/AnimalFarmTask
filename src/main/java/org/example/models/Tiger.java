package org.example.models;

import org.example.interfaces.ILigerSpecies;
import org.example.interfaces.ITigerSpecies;

public class Tiger implements ITigerSpecies, ILigerSpecies {

    private String name;

    public Tiger(){}

    public Tiger(String name)
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
        System.out.println("Make Tiger sound!");
    }
}
