import Zad1.FileListingFromDirectory;
import Zad2.FileOperations;
import Zad3Zad4.Hexagon;
import Zad3Zad4.Rectangle;
import Zad3Zad4.Square;
import Zad3Zad4.Triangle;
import Zad5.TextFileComparator;
import Zad6.ReversingTextFromFile;

public class Main {
    public static void main(String[] args) {

        //Zad1
        FileListingFromDirectory fl1=new FileListingFromDirectory();
        fl1.printDirectory("files");

        //Zad2
        FileOperations foper1=new FileOperations();
        //foper1.writeUserInputToFile();

        foper1.readFromFile("files/file6.txt");



        //Zad3 Zad4

        Hexagon hx1=new Hexagon(5);
        System.out.println(hx1.calculateArea());

        Rectangle rc1=new Rectangle(9,12);
        System.out.println(rc1.calculateArea());

        Triangle tr1=new Triangle(16,8.5);
        System.out.println(tr1.calculateArea());

        Square sq1=new Square(9.5);
        System.out.println(sq1.calculateDiameter());
        System.out.println(sq1.calculateArea());

        //Zad5
        System.out.println();

        TextFileComparator textFileComparator=new TextFileComparator();
        System.out.println(textFileComparator.areTextFilesEqual("files/file1.txt","files/file7.txt"));
        //Zad6


        ReversingTextFromFile rtff=new ReversingTextFromFile();
        rtff.invertFile("files/file5.txt");
    }
}
/*
Napisz program, która wylistuje wszystkie pliki w danym folderze:
public void printDirectory(String directoryPath);

Napisz metodę, która stworzy nowy plik, o nazwie nadanej przez użytkownika i zapisze do niego treść tekstu, który wprowadzi użytkownik. Jeśli operacja zakończy się sukcesem, zwróć true, jeśli nie, zwróć false.
 Następnie dodaj metodę, która przyjmie w argumencie nazwę pliku (nie musi być podana przez użytkownika) i wydrukuje jego zawartość. Metody:
public boolean writeUserInputToFile();
public void readFromFile(String fileName);
Bonus: Przy zapisaniu co 4 słowo wstawiaj znak nowej linii do zapisywanego pliku.
Stwórz interfejs o nazwie Zad3.GeometricFigure, który będzie zawierał nastepującą metodę:
public double calculateArea();
Następnie, stwórz następujące implementacje, które będą zawierać pola wymagane do wyliczenia pola figury:
Zad3.Rectangle;
Zad3.Triangle;
Zad3.Hexagon.
Dopisz testy sprawdzające Twoje wyliczenia.
Korzystając z klasy Zad3.Rectangle z poprzedniego ćwiczenia, napisz klasę Zad3.Square, która odziedziczy po tej klasie i dodaj metodę odpowiedzialną za wyliczenie obwodu:
public int calculateDiameter();
Napisz program, który sprawdzi, czy 2 pliki tekstowe mają taką samą zawartość:
public boolean areTextFilesEqual(String filePath1, String filePath2);
Napisz program, który przyjmie ścieżkę do pliku, a następnie wczyta jego zawartość i zapisze do nowego pliku jego zawartość w odwróconej kolejności (np. plik 1 ma zawartość “Ala ma kota.”, wynikiem metody będzie powstanie pliku, który zawiera w sobie “.kota ma Ala”). W przypadku sukcesu zwróć true, w przypadku niepowodzenia zwróć false:
public boolean invertFile(String filepath)
[BONUS] Napisz test do ćwiczenia 6 tworząc pliki w strukturze projektu (czyli w plikach projektu, np. tworząc nowy folder). Przetestuj, czy jeśli operacja zakończy się powodzeniem, zawartość wytworzonego pliku jest zgodna z oczekiwaniami.

 */