package org.example;
import org.example.farm.AnimalFarm;
import org.example.files.FarmFile;
import org.example.interfaces.IHorse;
import org.example.models.Donkey;
import org.example.models.Horse;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        AnimalFarm farm = new AnimalFarm();

        Horse horse1 = (Horse) farm.findHorse("horse01");
        Donkey donkey1 = (Donkey) farm.findDonkey("donkey01");
        IHorse[] arr = horse1.mate(donkey1);
        System.out.println(MessageFormat.format("Mating result -> {0} - {1}",arr, arr.length));

        new FarmFile(farm).createSummaryFile();
        farm.display();
    }
}
