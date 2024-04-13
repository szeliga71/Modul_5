import Zad2.FileOperations;
import Zad5.TextFileComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextFileComparatorTest {

    TextFileComparator txC=new TextFileComparator();
    FileOperations fo3=new FileOperations();

    @Test
    public void textFileComparatorPath1AndPath2NullTest(){

        Assertions.assertFalse(txC.areTextFilesEqual(null,null));
    }
    @Test
    public void textFileComparatorPath1NullTest(){

        Assertions.assertFalse(txC.areTextFilesEqual(null,"files/file1.txt"));
    }
    @Test
    public void textFileComparatorPath2NullTest(){

        Assertions.assertFalse(txC.areTextFilesEqual("files/file1.txt",null));
    }
    @Test
    public void textFileComparatorEmptyPath1Test(){

        Assertions.assertFalse(txC.areTextFilesEqual("","files/file1.txt"));
    }
    @Test
    public void textFileComparatorEmptyPath2Test(){

        Assertions.assertFalse(txC.areTextFilesEqual("files/file1.txt",""));
    }
    @Test
    public void textFileComparatorEmptyPath1AndPath2Test(){

        Assertions.assertFalse(txC.areTextFilesEqual("",""));
    }
    @Test
    public void textFileComparatorIllegalPath1AndPath2Test(){

        Assertions.assertFalse(txC.areTextFilesEqual("Kacza/Dziwaczka.txt","Kaczor/Donald+15"));
    }
    @Test
    public void textFileComparatorIllegalPath1Test(){

        Assertions.assertFalse(txC.areTextFilesEqual("Kacza/Dziwaczka.txt","files/file1.txt"));
    }
    @Test
    public void textFileComparatorIllegalPath2Test(){

        Assertions.assertFalse(txC.areTextFilesEqual("files/file1.txt","Kacza/Dziwaczka.txt"));
    }
    @Test
    public void textFileComparatorDirectoryPath1AndPath2Test(){

        Assertions.assertFalse(txC.areTextFilesEqual("files","out"));
    }
    @Test
    public void textFileComparatorDirectoryPath1Test(){

        Assertions.assertFalse(txC.areTextFilesEqual("files","files/file2.txt"));
    }
    @Test
    public void textFileComparatorDirectoryPath2Test(){

        Assertions.assertFalse(txC.areTextFilesEqual("files/file3.txt","files"));
    }
    @Test
    public void textFileComparatorOkArgumentsTest(){
        String text=fo3.readFromFileAndReturnString("file3.txt");
        fo3.writeTextToFile(text,"files/file8.txt");
        Assertions.assertTrue(txC.areTextFilesEqual("files/file8.txt","files/file3.txt"));
    }
    @Test
    public void textFileComparatorDifrentTextsInFilesTest(){
        Assertions.assertFalse(txC.areTextFilesEqual("files/emptyFile.txt","files/file3.txt"));
    }
    @Test
    public void textFileComparatorTwoEmptyFileTest(){
        Assertions.assertTrue(txC.areTextFilesEqual("files/emptyFile.txt","files/emptyFile.txt"));
    }

}
