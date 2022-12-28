package org.example.models;

import org.example.factory.AnimalFactory;
import org.example.farm.AnimalArray;
import org.example.farm.DonkeyArray;
import org.example.farm.HorseArray;
import org.example.farm.LionArray;
import org.example.interfaces.IAnimal;

import java.lang.reflect.Array;
import java.util.Random;

public abstract class Animal implements IAnimal {

    private String name;
    private int age;
    private float weight;
    private AnimalArray array;

    public Animal(){}
    public Animal(String name, int age, float weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    public Animal(Animal animal) {
        setName(animal.getName());
        setAge(animal.getAge());
        setWeight(animal.getWeight());
        setArray(animal.getArray());
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
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public AnimalArray getArray() {
        return array;
    }

    @Override
    public void setArray(AnimalArray array) {
        this.array = array;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void moveTo(AnimalArray animalArray) {

    }

    private static IAnimal[] _mate(IAnimal childAnimal) throws InstantiationException, IllegalAccessException {

        IAnimal[] arr = AnimalFactory.getAnimalArray(childAnimal, new Random().nextInt(1, 10));


        for(int i = 0; i < arr.length; i ++)
        {
            IAnimal animal = childAnimal.getClass().newInstance();
            Random random = new Random(System.currentTimeMillis());
            animal.setName(animal.getClass().getSimpleName()+" "+i);
            animal.setAge(random.nextInt(1, 15));
            animal.setWeight( random.nextFloat(10, 100));

            arr[i] = animal;
        }
        return arr;
    }


    public static IAnimal[] mating(IAnimal firstAnimal, IAnimal secondAnimal) throws InstantiationException, IllegalAccessException {

        if(firstAnimal.getClass().equals(secondAnimal.getClass()))
        {
            return _mate(firstAnimal);
        }

        else
        {
            Class<?> cls1 = firstAnimal.getClass();
            Class<?> cls2 = secondAnimal.getClass();

            // return liger children if the parents are a Lion and a Tiger
            if((cls1 == Lion.class && cls2 == Tiger.class)
                    || (cls1 == Tiger.class && cls2 == Lion.class))
                return _mate(new Liger());

            // return Mule children if the parents are a Horse and a Donkey
            if((cls1 == Donkey.class && cls2 == Horse.class )
                    || (cls1 == Horse.class && cls2 == Donkey.class ))
                return _mate(new Mule());
        }
        return null;
    }
}
