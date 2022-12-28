package org.example.farm;

import org.example.interfaces.IDonkey;

public class DonkeyArray extends AnimalArray {
    public DonkeyArray(int capacity) {
        arr = new IDonkey[capacity];
    }

    @Override
    public void display() {
        print("IDonkey");
    }

    public void add(IDonkey animal) {
        this.insert(animal);
    }
    public void add(IDonkey[] arr) {
        this.insertArray(arr);
    }

    public void moveTo(IDonkey animal)
    {
        _moveTo(animal);
    }

    public IDonkey find(String name)
    {
        return (IDonkey) _find(name);
    }
}
