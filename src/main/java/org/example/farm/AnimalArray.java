package org.example.farm;

import org.example.interfaces.IAnimal;

public abstract class AnimalArray {

    protected IAnimal[] arr;

    //private T[] arr2;

//    private T obj;
    private int count;

    public AnimalArray(){}
    public AnimalArray(int capacity){
        //arr2 = (T[]) Array.newInstance(clazz, capacity);
        arr = new IAnimal[capacity];
//        obj = clazz.newInstance();
    }

    protected void _moveTo(IAnimal animal)
    {
        if(animal.getArray() != null)
            animal.getArray().delete(animal.getName());

        this.insert(animal);
    }

    protected void insertArray(IAnimal[] arr)
    {
        for(int i = 0; i< arr.length; i++)
        {
            insert(arr[i]);
        }
    }

    protected void insert(IAnimal animal) {
//        if (!isLegalAddition(animal))
//            throw new RuntimeException("Animal type is not allowed");

        if (arr.length == count) {
            IAnimal[] tempArr = new IAnimal[count * 2];

            for (int i = 0; i < arr.length; i++) {
                tempArr[i] = arr[i];
            }
            arr = tempArr;
        }
        arr[count++] = animal;
        animal.setArray(this);
    }


    public IAnimal delete(String name) {
        int index = findIndex(name);

        if (index >= 0) {
            IAnimal animal = arr[index];
            delete(index);
            return animal;
        }
        System.out.println("Error deleting this object called " + name);
        return null;
    }

    public IAnimal find(int index)
    {
        if (index > count || index < 0)
            throw new ArrayIndexOutOfBoundsException();

        return arr[index];
    }
    protected IAnimal _find(String name) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getName().equals(name))
                return arr[i];
        }
        return null;
    }

    private int findIndex(String name) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getName().equals(name))
                return i;
        }
        return -1;
    }

    private void delete(int index) {
        if (index >= count || index < 0)
            throw new ArrayIndexOutOfBoundsException();

        IAnimal[] tempArr = new IAnimal[arr.length];
        int newCount = 0;

        for (int i = 0; i < count; i++) {
            if (i == index)
                continue;

            tempArr[newCount++] = arr[i];
        }
        this.arr = tempArr;
        this.count = newCount;
    }

//    public boolean isLegalAddition(IAnimal animal) {
//
//        var arrayInterfaces = obj.getClass().getInterfaces();
//        var objectInterfaces = animal.getClass().getInterfaces();
//
//        for (var arrayInterface : arrayInterfaces) {
//            for (var objectInterface : objectInterfaces)
//                if (arrayInterface == objectInterface) //Main animals implement only one interface
//                    return true;
//        }
//        return false;
//    }

     abstract void display();

    protected void print(String animalName) {
        System.out.println("We have " + getLength() + " " + animalName + "(s)");
        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i].getName() +" " + arr[i].getAge() + " " + String.format("%.2f kg " , arr[i].getWeight()) + ", ");
            //arr[i].makeSound();
        }
        System.out.println(" ]\n");
    }

    public int getLength() {
        return count;
    }

}
