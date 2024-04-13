import Zad2.FileOperations;
import Zad6.ReversingTextFromFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ReversingTextFromFileTest {

    private ReversingTextFromFile rtff1 = new ReversingTextFromFile();
    private FileOperations fo1 = new FileOperations();

    private StringBuilder textBuilder = new StringBuilder();


    @Test
    public void reverseMethodTest() {
        String text1 = "Test pliku testowego w nowym katalogu o nazwie testFiles.";
        textBuilder.append(text1);
        Assertions.assertEquals(textBuilder.toString(), text1);

    }

    @Test
    public void invertFileSimpleNullArgument() {
        Assertions.assertFalse(rtff1.invertFileSimple(null));
    }

    @Test
    public void invertFileSimpleEmptyArgument() {
        Assertions.assertFalse(rtff1.invertFileSimple(""));
    }

    @Test
    public void invertFileSimpleIllegalArgument() {
        Assertions.assertFalse(rtff1.invertFileSimple("MickejMouse"));
    }

    @Test
    public void invertFileSimpleOkArgument() {
        Assertions.assertTrue(rtff1.invertFileSimple("files/file5.txt"));
    }
    @Test
    public void invertFileSimpleDirectoryNameArgument() {
        Assertions.assertFalse(rtff1.invertFileSimple("files"));
    }

    @Test
    public void checkTextWithTextInReversingFile() {

        String text = "Ala ma bialego kota Filemona.";
        String[] tabWithReversedText = text.split("\\b");
        StringBuilder textBuilder = new StringBuilder();
        for (int i = tabWithReversedText.length - 1; i >= 0; i--) {
            textBuilder.append(tabWithReversedText[i]).append(" ");
        }
        String reverseText = textBuilder.toString().trim();

        fo1.writeTextToFile(reverseText, "files/file8.txt");

        Assertions.assertEquals(reverseText, fo1.readFromFileAndReturnString("file8.txt"));

    }

    @Test
    public void checkTextWithIllegalTextInReversingFile() {

        String text = "Ala ma bialego kota Filemona.";
        String[] tabWithReversedText = text.split("\\b");
        StringBuilder textBuilder = new StringBuilder();
        for (int i = tabWithReversedText.length - 1; i >= 0; i--) {
            textBuilder.append(tabWithReversedText[i]).append(" ");
        }
        String reverseText = textBuilder.toString().trim();
        String illegalText = "Mis Uszatek";

        fo1.writeTextToFile(reverseText, "files/file8.txt");

        Assertions.assertNotEquals(illegalText, fo1.readFromFileAndReturnString("file8.txt"));

    }

    @Test
    public void checkTextWithEmptyTextInReversingFile() {

        String text = "";
        String[] tabWithReversedText = text.split("\\b");
        StringBuilder textBuilder = new StringBuilder();
        for (int i = tabWithReversedText.length - 1; i >= 0; i--) {
            textBuilder.append(tabWithReversedText[i]).append(" ");
        }
        String reverseText = textBuilder.toString().trim();
        String illegalText = "Mis Uszatek";

        fo1.writeTextToFile(reverseText, "files/file8.txt");

        Assertions.assertNotEquals(illegalText, fo1.readFromFileAndReturnString("file8.txt"));

    }

    @Test
    public void checkTextWithNullTextInReversingFile() {

        String text = null;
        StringBuilder textBuilder = new StringBuilder();
        try {
            String[] tabWithReversedText = text.split("\\b");
            for (int i = tabWithReversedText.length - 1; i >= 0; i--) {
                textBuilder.append(tabWithReversedText[i]).append(" ");
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println("text nie isnieje poniewaz jest nullem");
        }
        String reverseText = textBuilder.toString().trim();
        String illegalText = "Mis Uszatek";

        fo1.writeTextToFile(reverseText, "files/file8.txt");

        Assertions.assertNotEquals(illegalText, fo1.readFromFileAndReturnString("file8.txt"));

    }
    @Test
    public void checkTextWithEmptyFileInReversingFile() {
        Assertions.assertEquals("",fo1.readFromFileAndReturnString("emptyFile.txt"));
    }
}
