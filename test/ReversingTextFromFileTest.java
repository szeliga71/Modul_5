import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class ReversingTextFromFileTest {


    @Test

    public void reverseMethodTest() {
        String directoryPath = "testFiles";

        File directory = new File(directoryPath);

        if(!directory.exists()){

            boolean created=directory.mkdir();

        if(created){
            System.out.println(" utworzno katalog");}
        else{
            System.out.println(" nie udalo sie utworzyc katalogu ");

        }
        }else{
            System.out.println(" katalog juz istnieje ");
        }

        File testFile1=new File("testFiles/testFile1");

        String text1="Test pliku testowego w nowym katalogu o nazwie testFiles.";

        try(FileWriter fileWriter=new FileWriter(testFile1);BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);){

            bufferedWriter.write(text1);
            bufferedWriter.flush();

        }catch(IOException ioException){
            ioException.printStackTrace();
        }


        String textFromFile="";
        StringBuilder textBuilder=new StringBuilder();



        try (FileReader fileReader = new FileReader(testFile1);BufferedReader bufferedReader = new BufferedReader(fileReader);){

            textFromFile=bufferedReader.readLine();
            while(textFromFile!=null){
                textBuilder.append(textFromFile);
                textFromFile=bufferedReader.readLine();
            }


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        Assertions.assertEquals(textBuilder.toString(),text1);



    }
}
