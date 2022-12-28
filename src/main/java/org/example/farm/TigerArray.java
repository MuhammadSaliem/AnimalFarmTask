package org.example.farm;

import org.example.interfaces.ITiger;

public class TigerArray extends AnimalArray {

    public TigerArray(int capacity) {
        arr = new ITiger[capacity];
    }

    @Override
    public void display() {
        print("ITiger");
    }

    public void add(ITiger animal) {
        this.insert(animal);
    }
    public void add(ITiger[] animals) {
        this.insertArray(animals);
    }


    public void moveTo(ITiger animal)
    {
        _moveTo(animal);
    }

    public ITiger find(String name)
    {
        return (ITiger) _find(name);
    }

}
