package org.example.models;

import org.example.interfaces.IDonkeySpecies;

public class Zebra implements IDonkeySpecies {
    private String name;

    public Zebra(){}
    public Zebra(String name) {
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
        System.out.println("Make Zebra sound!");
    }
}
