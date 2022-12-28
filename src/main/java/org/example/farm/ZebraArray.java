package org.example.farm;

import org.example.interfaces.IZebra;

public class ZebraArray extends AnimalArray {
    public ZebraArray(int capacity) {
        arr = new IZebra[capacity];
    }

    @Override
    public void display() {
        print("IZebra");
    }

    public void add(IZebra animal) {
        this.insert(animal);
    }

    public void add(IZebra[] animals) {
        this.insertArray(animals);
    }


    public void moveTo(IZebra animal)
    {
        _moveTo(animal);
    }

    public IZebra find(String name)
    {
        return (IZebra) _find(name);
    }


}
