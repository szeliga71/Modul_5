package Zad6;

import Zad2.FileOperations;


public class ReversingTextFromFile {
    public boolean invertFileSimple(String filePath) {

        FileOperations fileOperations = new FileOperations();
        String fileName="";
        try {
            fileName = filePath.substring(filePath.lastIndexOf("/") + 1);
        }catch(NullPointerException nullPointerException){
            System.out.println(" argument nie moze byc nullem");
            return false;
        }
        String text = "";
        try {
            text = fileOperations.readFromFileAndReturnString(fileName).trim();
        } catch (NullPointerException nullPointerException) {
            System.out.println(" plik zrodlowy nie istnieje , badz podano nieprawidlowa sciezke do pliku ");
            return false;
        }
        StringBuilder textFromFile = new StringBuilder();
        if (!text.isEmpty()) {
            String[] wordsFromFile = text.split("\\b");
            for (int i = wordsFromFile.length - 1; i >= 0; i--) {
                textFromFile.append(wordsFromFile[i]);
            }
        } else {
            return false;
        }
        return fileOperations.writeTextToFile(textFromFile.toString(),"files/reverseFile.txt");
    }
}
/*
    public boolean invertFile(String filePath) {
        String textfromFile = "";
        StringBuilder textBuilder = new StringBuilder();


        File file = new File(filePath);

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            textfromFile = bufferedReader.readLine();


            //bufferedReader.lines().

            while (textfromFile != null) {

                textBuilder.append(textfromFile);
                textBuilder.append("\n");
                textfromFile = bufferedReader.readLine();
            }


            textfromFile = textBuilder.toString().trim();


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

        try (FileWriter fileWriter = new FileWriter(outputFile);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(textBuilder.toString());
            bufferedWriter.flush();

            fileWriter.close();
            bufferedWriter.close();

            return true;


        } catch (IOException ioException) {
            ioException.printStackTrace();

            return false;
        }



}*/