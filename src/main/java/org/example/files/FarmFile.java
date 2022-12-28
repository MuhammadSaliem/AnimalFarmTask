package org.example.files;

import org.example.farm.AnimalArray;
import org.example.farm.AnimalFarm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.MessageFormat;

public class FarmFile {

    private File file;
    private FileWriter fileWriter;
    private AnimalFarm farm;

    public FarmFile(AnimalFarm farm) {
        this.farm = farm;
        createFile();
    }

    private void createFile() {
        String fileName = "farm-summary-" + new Timestamp(System.currentTimeMillis()).getTime() + ".txt";
        try {
            file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private File writeFile() {
        try {
            fileWriter = new FileWriter(file.getName());
            fileWriter.write(farm.getSummary());
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return file;
    }

//    private String createSummary() {
//        StringBuilder summary =
//                new StringBuilder()
//                        .append("\t\t\t\t\t *Animal Farm* \t\t\t\t\t\n\n")
//                        .append(MessageFormat.format("lions: {0} \t tigers: {1} \t zebras: {2} \t donkeys: {3} \t horses: {4}\n\n\n\n", farm.lionList.getLength(), farm.tigerList.getLength(), farm.zebraList.getLength(), farm.donkeyList.getLength(), farm.horseList.getLength()));
//
//        summary.append("\t\t\t lions den \t\t\t\n\n");
//        for(int i = 0; i < farm.lionList.getLength(); i++)
//        {
//            summary.append(MessageFormat.format("{0}- name: {1} \t age: {2} \t weight: {3} kg\n",i, farm.lionList.find(i).getName(), farm.lionList.find(i).getAge(), farm.lionList.find(i).getWeight()));
//        }
//
//        summary.append("\n\n\t\t\t tigers den \t\t\t\n\n");
//        for(int i = 0; i < farm.tigerList.getLength(); i++)
//        {
//            summary.append(MessageFormat.format("{0}- name: {1} \t age: {2} \t weight: {3} kg\n",i, farm.tigerList.find(i).getName(), farm.tigerList.find(i).getAge(), farm.tigerList.find(i).getWeight()));
//        }
//
//        summary.append("\n\n\t\t\t zebra stable \t\t\t\n\n");
//        for(int i = 0; i < farm.zebraList.getLength(); i++)
//        {
//            summary.append(MessageFormat.format("{0}- name: {1} \t age: {2} \t weight: {3} kg\n",i, farm.zebraList.find(i).getName(), farm.zebraList.find(i).getAge(), farm.zebraList.find(i).getWeight()));
//        }
//
//        summary.append("\n\n\t\t\t donkeys stable \t\t\t\n\n");
//        for(int i = 0; i < farm.donkeyList.getLength(); i++)
//        {
//            summary.append(MessageFormat.format("{0}- name: {1} \t age: {2} \t weight: {3} kg\n",i, farm.donkeyList.find(i).getName(), farm.donkeyList.find(i).getAge(), farm.donkeyList.find(i).getWeight()));
//        }
//
//        summary.append("\n\n\t\t\t horses stable \t\t\t\n\n");
//        for(int i = 0; i < farm.horseList.getLength(); i++)
//        {
//            summary.append(MessageFormat.format("{0}- name: {1} \t age: {2} \t weight: {3} kg\n",i, farm.horseList.find(i).getName(), farm.horseList.find(i).getAge(), farm.horseList.find(i).getWeight()));
//        }
//        return summary.toString();
//    }

    public File createSummaryFile() {
        return writeFile();
    }

    public AnimalFarm getAnimalFarm() {
        return farm;
    }

    public void setAnimalFarm(AnimalFarm farm) {
        this.farm = farm;
    }
}
