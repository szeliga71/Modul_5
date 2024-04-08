package Zad2;

import java.io.*;
import java.util.Scanner;

public class FileOperations {

    public boolean writeUserInputToFile(){
        Scanner scan=new Scanner(System.in);
        System.out.println(" What do You want save in file ?");
        String userText= scan.nextLine();
        //Bonus
        StringBuilder textBuilder=new StringBuilder();
        String[]wordsOfText=userText.split("[^a-zA-Z0-9']+");

        for(int i=0;i<wordsOfText.length;i++){

            textBuilder.append(wordsOfText[i]);
            if((i+1)%4==0){
                textBuilder.append("\n");
            }else{
                textBuilder.append(" ");
            }

        }

        String text=textBuilder.toString();

        System.out.println("Give name of file");
        String fileName= scan.nextLine();
        File file=new File("files/"+fileName+".txt");

        try{
            file.createNewFile();
            FileWriter writer=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write(text);
            bufferedWriter.flush();

            bufferedWriter.close();
            writer.close();
            return true;
        }catch(IOException ioException){
            ioException.printStackTrace();
            return false;
        }

    }
    public void readFromFile(String fileName){


        String readingText="";
        StringBuilder stringBuilder=new StringBuilder();
        File file=new File(fileName);

        try{
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        readingText=bufferedReader.readLine();
        while(readingText!=null) {
            stringBuilder.append(readingText);
            stringBuilder.append("\n");
            readingText = bufferedReader.readLine();
        }
        fileReader.close();
        bufferedReader.close();


    }catch( IOException ioException){
            ioException.printStackTrace();
        }

        System.out.println(stringBuilder);
    }
}
