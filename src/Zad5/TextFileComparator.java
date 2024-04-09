package Zad5;

import java.io.*;

public class TextFileComparator {


    public boolean areTextFilesEqual(String filePath1, String filePath2) {

        String contentFile1 = "";
        String contentFile2 = "";
        String tempText = "";

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        try {
            FileReader fileReader = new FileReader(file1);
            FileReader fileReader1 = new FileReader(file2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
            tempText = bufferedReader.readLine();

            while (tempText != null) {
                builder1.append(tempText);
                tempText = bufferedReader.readLine();
            }
            bufferedReader.close();

            tempText = bufferedReader1.readLine();

            while (tempText != null) {
                builder2.append(tempText);
                tempText = bufferedReader1.readLine();
            }

            bufferedReader1.close();


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        contentFile1 = builder1.toString();
        contentFile2 = builder2.toString();


        System.out.println(contentFile1);
        System.out.println();
        System.out.println(contentFile2);


        if (contentFile1.equals(contentFile2)) {
            return true;
        } else {
            return false;
        }


    }
}
