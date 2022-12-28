package org.example.farm;

import org.example.interfaces.ILion;

public class LionArray extends AnimalArray {
    public LionArray(int capacity) {
        arr = new ILion[capacity];
    }

    @Override
    public void display() {
        print("ILion");
    }

    public void add(ILion animal) {
        this.insert(animal);
    }

    public void add(ILion[] animals) {
        this.insertArray(animals);
    }

    public void moveTo(ILion animal)
    {
        _moveTo(animal);
    }

    public ILion find(String name)
    {
        return (ILion) _find(name);
    }
}
