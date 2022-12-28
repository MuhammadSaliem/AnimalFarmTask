package org.example.farm;

import org.example.interfaces.IHorse;

public  class HorseArray extends AnimalArray {
    public HorseArray(int capacity) {
        arr = new IHorse[capacity];
    }

    @Override
    public void display() {
        print("IMule");
    }

    public void add(IHorse animal) {
        this.insert(animal);
    }
    public void add(IHorse[] animals) {
        this.insertArray(animals);
    }


    public void moveTo(IHorse animal)
    {
        _moveTo(animal);
    }

    public IHorse find(String name)
    {
        return (IHorse) _find(name);
    }

}
