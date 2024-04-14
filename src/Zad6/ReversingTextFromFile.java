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
