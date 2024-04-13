import Zad2.FileOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileOperationsTest {

    private FileOperations fo2=new FileOperations();

    @Test
    public void readFromFileAndReturnStringNullArgumentTest(){
        Assertions.assertNull(fo2.readFromFileAndReturnString(null));
            }
    @Test
    public void readFromFileAndReturnStringEmptyArgumentTest(){
        Assertions.assertNull(fo2.readFromFileAndReturnString(""));
    }
    @Test
    public void readFromFileAndReturnStringIllegalArgumentTest(){
        Assertions.assertNull(fo2.readFromFileAndReturnString("Marsjanska stacja KOSMICZNA"));
    }
    @Test
    public void readFromFileAndReturnStringDirectoryNameArgumentTest(){
        Assertions.assertNull(fo2.readFromFileAndReturnString("files"));
    }
    @Test
    public void readFromFileAndReturnStringEmptyFileArgumentTest(){
        Assertions.assertEquals("",fo2.readFromFileAndReturnString("emptyFile.txt"));
    }
    @Test
    public void readFromFileCompareTexts(){

        String sourceText= "Alicja w Krainie Czarow";

        fo2.writeTextToFile(sourceText,"files/sourceFile.txt");

        Assertions.assertEquals(sourceText,fo2.readFromFileAndReturnString("sourceFile.txt"));

    }
    @Test
    public void readFromFileCompareDifrentTexts(){

        String sourceText= "Alicja w Krainie Czarow";

        fo2.writeTextToFile(sourceText,"files/sourceFile.txt");

        Assertions.assertNotEquals("Maly Ksiaze",fo2.readFromFileAndReturnString("sourceFile.txt"));

    }
    @Test
    public void readFromFileCompareNullWithText(){

        String sourceText= "Alicja w Krainie Czarow";

        fo2.writeTextToFile(sourceText,"files/sourceFile.txt");

        Assertions.assertNotEquals(null,fo2.readFromFileAndReturnString("sourceFile.txt"));

    }
    @Test
    public void writeTextToFilePathNameNullTest(){
        Assertions.assertFalse(fo2.writeTextToFile("jakis text",null));
    }@Test
    public void writeTextToFileTextNullTest(){
        Assertions.assertFalse(fo2.writeTextToFile(null,"files/file8.txt"));
    }
    @Test
    public void writeTextToFileTextNullPathNameNullTest(){
    Assertions.assertFalse(fo2.writeTextToFile(null,null));
    }
    @Test
    public void writeTextToFileEmptyPathNameTest(){
        Assertions.assertFalse(fo2.writeTextToFile("jakis text",""));
    }@Test
    public void writeTextToFileEmptyTextTest(){
        Assertions.assertTrue(fo2.writeTextToFile("","files/file8.txt"));
    }  @Test
    public void writeTextToFileEmptyTextEmptyPathNameTest(){
        Assertions.assertFalse(fo2.writeTextToFile("",""));
    }
    @Test
    public void writeTextToFileArgumentsOKTest(){
        Assertions.assertTrue(fo2.writeTextToFile("jakis text","files/file8.txt"));
    }




}
