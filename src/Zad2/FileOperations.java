package Zad2;

import java.io.*;
import java.util.Scanner;

public class FileOperations {

    public boolean writeUserInputToFile(){
        Scanner scan=new Scanner(System.in);
        System.out.println(" What do You want save in file ?");
        String text= scan.nextLine();
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



        File file=new File(fileName);
        try{
        FileReader fileReader=new FileReader(file);

    }catch( FileNotFoundException e){
            //System.out.println(e.printStackTrace())
        }
    }
}
