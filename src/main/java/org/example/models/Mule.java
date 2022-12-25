package org.example.models;

import org.example.interfaces.IAnimal;
import org.example.interfaces.IDonkeySpecies;
import org.example.interfaces.IHorseSpecies;
import org.example.interfaces.IMuleSpecies;

public class Mule implements IMuleSpecies {

    private String name;

    public Mule(){}
    public Mule(String name)
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
        System.out.println("Make Mule sound!");
    }
}
