package org.example.models;

import org.example.interfaces.IAnimal;
import org.example.interfaces.IDonkeySpecies;
import org.example.interfaces.IHorseSpecies;
import org.example.interfaces.IMuleSpecies;

public class Horse implements IHorseSpecies, IMuleSpecies {
    private String name;

    public Horse(){}
    public Horse(String name)
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
        System.out.println("Make Horse sound!");
    }
}
