package Zad1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileListingFromDirectory {

    private String text;


    public void writeUserInputTextToFile() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" What do You want save in file ?");
        String text = scan.nextLine();
        System.out.println("Give name of file");
        String fileName = scan.nextLine();
        File file = new File("files/" + fileName + ".txt");

        try (FileWriter writer = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(writer);) {
            file.createNewFile();

            bufferedWriter.write(text);
            bufferedWriter.flush();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    public void printDirectory(String directoryPath) {

        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] filesInDirectory = directory.listFiles();

            if (filesInDirectory != null) {
                for (File file : filesInDirectory) {

                    System.out.println(file.getName());
                }
            }
        }


    }
    public void writeTextToFile(String pathName) {

        File file = new File(pathName);

        try (FileWriter writer = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(writer);) {
            file.createNewFile();

            bufferedWriter.write(text);
            bufferedWriter.flush();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
