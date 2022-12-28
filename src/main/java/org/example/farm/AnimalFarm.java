package org.example.farm;

import org.example.interfaces.*;
import org.example.models.*;

import java.text.MessageFormat;
import java.util.Random;

public class AnimalFarm {
    private LionArray lionList;
    private TigerArray tigerList;
    private ZebraArray zebraList;
    private DonkeyArray donkeyList;
    private HorseArray horseList;

    private AnimalArray[] arr;

    public AnimalFarm() {
        initializeFarm();
    }

    public void display(){
        System.out.println(getSummary());
    }

    public ILion findLion(String name)
    {
        return lionList.find(name);
    }

    public ITiger findTiger(String name)
    {
        return tigerList.find(name);
    }

    public IZebra findZebra(String name)
    {
        return zebraList.find(name);
    }

    public IDonkey findDonkey(String name)
    {
        return donkeyList.find(name);
    }

    public IHorse findHorse(String name)
    {
        return horseList.find(name);
    }


    public void insert(ILion animal)
    {
        lionList.insert(animal);
    }

    public void insert(ITiger animal)
    {
        tigerList.insert(animal);
    }

    public void insert(IDonkey animal)
    {
        donkeyList.insert(animal);
    }

    public void insert(IZebra animal)
    {
        zebraList.insert(animal);
    }

    public void insert(IHorse animal)
    {
        horseList.insert(animal);
    }


    public void Delete(IAnimal animal)
    {
        if(animal.getArray() != null)
            animal.getArray().delete(animal.getName());
    }

    public void moveTo(ILion animal)
    {
        lionList.moveTo(animal);
    }

    public void moveTo(ITiger animal)
    {
        tigerList.moveTo(animal);
    }

    public void moveTo(IZebra animal)
    {
        zebraList.moveTo(animal);
    }

    public void moveTo(IDonkey animal)
    {
        donkeyList.moveTo(animal);
    }

    public void moveTo(IHorse animal)
    {
        horseList.moveTo(animal);
    }


    public String getSummary() {
        StringBuilder summary =
                new StringBuilder()
                        .append("\t\t\t\t\t *Animal Farm* \t\t\t\t\t\n\n")
                        .append(MessageFormat.format(
                                "lions: {0} ({1} liger(s)) \t tigers: {2} ({3} liger(s)) \t zebras: {4} ({5} donkey(s)) \t donkeys: {6} ({7} mule(s)) \t horses: {8} ({9} mule(s))\n\n\n\n"
                                , getLionList().getLength()
                                , getLionList().getAnimalCount(Liger.class)
                                , getTigerList().getLength()
                                , getTigerList().getAnimalCount(Liger.class)
                                , getZebraList().getLength()
                                , getZebraList().getAnimalCount(Donkey.class)
                                , getDonkeyList().getLength()
                                , getDonkeyList().getAnimalCount(Mule.class)
                                , getHorseList().getLength()
                                , getHorseList().getAnimalCount(Mule.class)));

        for(int i = 0; i < getArr().length; i++)
        {
            summary.append(arraySummary(getArr()[i]));
        }

        return summary.toString();
    }

    private String arraySummary(AnimalArray arr)
    {
        StringBuilder summary = new StringBuilder();

        summary.append(String.format("\t\t\t %s \t\t\t\n\n", arr.getClass().getSimpleName()));
        for(int i = 0; i < arr.getLength(); i++)
        {
            summary.append(MessageFormat.format("{0}-  name: {1} \t age: {2} \t weight: {3} kg\n",i, arr.find(i).getName(), arr.find(i).getAge(), arr.find(i).getWeight()));
        }

        return summary.append("\n\n").toString();
    }


    private void initializeFarm(){

        lionList = new LionArray(5);
        tigerList = new TigerArray(5);
        zebraList = new ZebraArray(5);
        donkeyList = new DonkeyArray(5);
        horseList = new HorseArray(5);

        arr = new AnimalArray[5];
        arr[0] = lionList;
        arr[1] = tigerList;
        arr[2] = zebraList;
        arr[3] = donkeyList;
        arr[4] = horseList;


        for(int i = 0; i < 4; i++)
        {
            lionList.add(new Lion("lion"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
        lionList.add(new Liger("liger5", new Random().nextInt(15), new Random().nextFloat(10, 100)));

        for(int i = 0; i < 4; i++)
        {
            tigerList.add(new Tiger("tiger"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
        tigerList.add(new Liger("liger5", new Random().nextInt(15), new Random().nextFloat(10, 100)));

        for(int i = 0; i < 9; i++)
        {
            zebraList.add(new Zebra("zebra"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
        zebraList.add(new Donkey("donkey10", new Random().nextInt(15), new Random().nextFloat(10, 100)));

        for(int i = 0; i < 7; i++)
        {
            donkeyList.add(new Donkey("donkey"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
        for(int i = 0; i < 17; i++)
        {
            horseList.add(new Horse("horse"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
        for(int i = 0; i < 3; i++)
        {
            horseList.add(new Mule("Mule"+i+1, new Random().nextInt(15), new Random().nextFloat(10, 100)));
        }
    }



    public LionArray getLionList() {
        return lionList;
    }

    public void setLionList(LionArray lionList) {
        this.lionList = lionList;
    }

    public TigerArray getTigerList() {
        return tigerList;
    }

    public void setTigerList(TigerArray tigerList) {
        this.tigerList = tigerList;
    }

    public ZebraArray getZebraList() {
        return zebraList;
    }

    public void setZebraList(ZebraArray zebraList) {
        this.zebraList = zebraList;
    }

    public DonkeyArray getDonkeyList() {
        return donkeyList;
    }

    public void setDonkeyList(DonkeyArray donkeyList) {
        this.donkeyList = donkeyList;
    }

    public HorseArray getHorseList() {
        return horseList;
    }

    public void setHorseList(HorseArray horseList) {
        this.horseList = horseList;
    }

    public AnimalArray[] getArr() {
        return arr;
    }

    public void setArr(AnimalArray[] arr) {
        this.arr = arr;
    }
}
