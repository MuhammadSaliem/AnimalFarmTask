package org.example.models;

import org.example.interfaces.IAnimal;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class AnimalArray<T> {

    private IAnimal[] arr;
    //private T[] arr2;

    private T obj;

    private int count;


    public AnimalArray(Class<T> clazz, int capacity) throws InstantiationException, IllegalAccessException {
        //arr2 = (T[]) Array.newInstance(clazz, capacity);
        arr = new IAnimal[capacity];
        obj = clazz.newInstance();
    }


//    public void insert(Class<T> clazz, T animal)
//    {
//        if(arr.length == count) {
//            T[] tempArr = (T[]) Array.newInstance(clazz, count * 2);
//
//            for (int i = 0; i < arr.length; i++)
//            {
//                tempArr[i] = arr[i];
//            }
//            arr = tempArr;
//        }
//
//        arr[count++] = animal;
//    }

    public IAnimal get(int index)
    {
        if(index >= count || index < 0)
            throw new ArrayIndexOutOfBoundsException();

        return arr[index];
    }

    public void insert(IAnimal animal)
    {
        if(!isLegalAddition(animal))
            throw new RuntimeException("Animal object is not allowed");

        if(arr.length == count) {
            IAnimal[] tempArr = new IAnimal[count*2];

            for (int i = 0; i < arr.length; i++)
            {
                tempArr[i] = arr[i];
            }
            arr = tempArr;
        }
        arr[count++] = animal;
    }


    public void Delete(int index)
    {
        if(index >= count || index < 0)
            throw new ArrayIndexOutOfBoundsException();

        IAnimal[] tempArr = new IAnimal[arr.length];
        int newCount = 0;

        for(int i = 0; i < count; i++)
        {
            if(i == index)
                continue;

            tempArr[newCount++] = arr[i];
        }
        this.arr = tempArr;
        this.count = newCount;
    }

    public boolean isLegalAddition(IAnimal animal)
    {
        var arrayInterfaces =  obj.getClass().getInterfaces();
        var objectInterfaces = animal.getClass().getInterfaces();

        for(var objInterface : objectInterfaces)
        {
            for(var arrInterface : arrayInterfaces)
            {
                if(objInterface == arrInterface) //Main animals implement only one interface
                    return true;
            }

        }
        return false;
    }

    public void print()
    {
        for(int i = 0; i < count; i++)
        {
            System.out.print(arr[i].getName() + " ");
            arr[i].makeSound();
        }
    }

    public int getLength()
    {
        return count;
    }

}
