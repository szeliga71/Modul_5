package Zad6;

import java.io.*;
import java.util.Scanner;

public class ReversingTextFromFile {


    public boolean invertFile(String filePath) {

        String textfromFile = "";
        StringBuilder textBuilder = new StringBuilder();


        File file = new File(filePath);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            textfromFile = bufferedReader.readLine();

            while (textfromFile != null) {
                textBuilder.append(textfromFile);
                textBuilder.append("\n");
                textfromFile = bufferedReader.readLine();
            }


            textfromFile = textBuilder.toString().trim();


            fileReader.close();
            bufferedReader.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


        textBuilder.setLength(0);


        String[] wordsFromSourceFile = textfromFile.split("\\b");


        for (int i = wordsFromSourceFile.length - 1; i >= 0; i--) {
            textBuilder.append(wordsFromSourceFile[i]);

        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Give name of new file for reverse text ");
        String fileName = scan.nextLine();

        File outputFile = new File("files/" + fileName + ".txt");

        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(textBuilder.toString());
            bufferedWriter.flush();

            fileWriter.close();
            bufferedWriter.close();

            //return true;


        } catch (IOException ioException) {
            ioException.printStackTrace();

            return  false;
        }
        //==========================
        String textFromSavedFile = "";
        StringBuilder textSavedBuilder = new StringBuilder();

        File savedFile = new File("files/" + fileName + ".txt");

        try {
            FileReader fileReader1 = new FileReader(savedFile);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
            textFromSavedFile = bufferedReader1.readLine();

            while (textFromSavedFile != null) {
                textSavedBuilder.append(textFromSavedFile);
                textSavedBuilder.append("\n");
                textFromSavedFile = bufferedReader1.readLine();
            }


            textFromSavedFile = textSavedBuilder.toString().trim();


            fileReader1.close();
            bufferedReader1.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();

        }

        return textBuilder.toString().equals(textFromSavedFile);
    }

}