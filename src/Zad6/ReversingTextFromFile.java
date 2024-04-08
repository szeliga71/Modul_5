package Zad6;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ReversingTextFromFile {



    public File reversedTextInNewFile(String filePath){


        String textfromFile="";
        StringBuilder textBuilder=new StringBuilder();

        File file=new File(filePath);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            textfromFile=bufferedReader.readLine();

            while(textfromFile!=null){
                textBuilder.append(textfromFile);
                textBuilder.append("\n");
                textfromFile= bufferedReader.readLine();
            }


            textfromFile=textBuilder.toString();

            fileReader.close();
            bufferedReader.close();

        }catch(IOException ioException){
            ioException.printStackTrace();
        }

        textBuilder.delete(0,textBuilder.length());

        String[]wordsFromSourceFile=textfromFile.split("[^a-zA-Z0-9']+");

        for(int i= wordsFromSourceFile.length-1;i>=0;i--){
            textBuilder.append(wordsFromSourceFile[i]);
            textBuilder.append(" ");
        }


        Scanner scan=new Scanner(System.in);
        System.out.println("Give name of new file for reverse text ");
        String fileName=scan.nextLine();
        File outputFile=new File("files/"+fileName+".txt");

        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(textBuilder.toString());
            bufferedWriter.flush();

            fileWriter.close();
            bufferedWriter.close();
        }catch(IOException ioException){
            ioException.printStackTrace();
        }

    return outputFile;
    }
}
