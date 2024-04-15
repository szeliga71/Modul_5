package Zad2;

import GitIgnoreFileSaver.GitIgnoreFileSaver;

import java.io.*;
import java.util.Scanner;

public class FileOperations {

    private StringBuilder stringBuilder = new StringBuilder();

    public boolean writeUserInputToFile() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" What do You want save in file ?");
        String userText = scan.nextLine();
        //Bonus
        String[] wordsOfText = userText.split("[^a-zA-Z0-9']+");

        for (int i = 0; i < wordsOfText.length; i++) {

            stringBuilder.append(wordsOfText[i]);
            if ((i + 1) % 4 == 0) {
                stringBuilder.append("\n");
            } else {
                stringBuilder.append(" ");
            }
        }
        String text = stringBuilder.toString();

        System.out.println("Give name of file");
        String fileName = scan.nextLine();
        File file = new File("files/" + fileName + ".txt");

        try (FileWriter writer = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(writer);) {

            bufferedWriter.write(userText);
            bufferedWriter.flush();

            writer.close();
            bufferedWriter.close();

            GitIgnoreFileSaver gis=new GitIgnoreFileSaver();
            String fileNameToSaveInGitIgnore=fileName+".txt";
            gis.saveFileInGitIgnore(fileNameToSaveInGitIgnore);

            return true;
        } catch (IOException ioException) {
            ioException.printStackTrace();
            return false;
        }
    }

    public void readFromFile(String fileName) {

        String readingText = "";
        File file = new File(fileName);

        if (!file.isFile()) {
            System.out.println(" podany argument nie jest nazwa pliku");
        } else if (file.isDirectory()) {
            System.out.println(" podany argument jest nazwa katalogu");
        } else {
            try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader);) {

                readingText = bufferedReader.readLine();
                while (readingText != null) {
                    stringBuilder.append(readingText);
                    stringBuilder.append("\n");
                    readingText = bufferedReader.readLine();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            System.out.println(stringBuilder);
        }
    }


    public String readFromFileAndReturnString(String fileName) {

        String readedText = null;
        if (fileName != null) {
            String filePath = "files/" + fileName;
            File file = new File(filePath);

            if (new File(fileName).isDirectory()) {
                System.out.println(" podany argument jest nazwa katalogu");
            } else if (!file.isFile()) {
                System.out.println(" podany argument nie jest nazwa pliku");
            } else {
                try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader);) {

                    readedText = bufferedReader.readLine();
                    while (readedText != null) {
                        stringBuilder.append(readedText);
                        readedText = bufferedReader.readLine();
                        if (readedText != null) {
                            stringBuilder.append("\n");
                        }
                    }
                    readedText = stringBuilder.toString();

                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
        }
        return readedText;
    }


    public boolean writeTextToFile(String text, String pathName) {

        if (pathName == null) {
            System.out.println("sciezka do pliku nie moze byc nulem!");
            return false;
        }
        File file = new File(pathName);
        if (file.isDirectory()) {
            System.out.println(" podany argument jest nazwa katalogu");
            return false;
        }
        if (!file.isFile()) {
            System.out.println(" podany argument nie jest nazwa pliku");
            return false;
        } else {

            try (FileWriter writer = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(writer);) {

                if (text == null) {
                    System.out.println("tekxt do zapisania musi istniec, nie moze byc nullem !");
                    return false;
                }
                bufferedWriter.write(text);
                bufferedWriter.flush();

                GitIgnoreFileSaver gis=new GitIgnoreFileSaver();
                String fileNameToSaveInGitIgnore=pathName.substring(pathName.lastIndexOf("/")+1);
                gis.saveFileInGitIgnore(fileNameToSaveInGitIgnore);
                return true;
            } catch (IOException ioException) {
                ioException.printStackTrace();
                return false;
            }
        }
    }
}

