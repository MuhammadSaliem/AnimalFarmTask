package org.example.interfaces;

import org.example.farm.AnimalArray;

public interface IAnimal {

    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
    float getWeight();
    void setWeight(float weight);
    AnimalArray getArray();
    void setArray(AnimalArray array);

    void makeSound();
    void moveTo(AnimalArray animalArray);
    //public IAnimal[] mating(IAnimal firstAnimal, IAnimal secondAnimal) throws InstantiationException, IllegalAccessException;



}
