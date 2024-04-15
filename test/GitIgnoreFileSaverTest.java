import GitIgnoreFileSaver.GitIgnoreFileSaver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GitIgnoreFileSaverTest {

    GitIgnoreFileSaver gitSaverTest=new GitIgnoreFileSaver();

    @Test
    public void gitIgnoreFileGitIgnoreFileExistSaver(){

        File gitIgnoreFile = new File(".gitignore");
        Assertions.assertTrue(gitIgnoreFile.exists());
    }

    @Test
    public void gitIgnoreFileCheckContentOKSaver(){

        String nameFileToTest="specialFileToTest.txt";

        gitSaverTest.saveFileInGitIgnore(nameFileToTest);

        File gitIgnoreFile=new File(".gitignore");

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(gitIgnoreFile)))
        {
            String line=bufferedReader.readLine();
            boolean nameFileToTesFound=false;
            while(line!=null)
            {
                if(line.equals(nameFileToTest)){
                    nameFileToTesFound=true;
                    break;
                }else{
                    line= bufferedReader.readLine();
                }
            }
            Assertions.assertTrue(nameFileToTesFound);

        }catch(IOException ioException){
            ioException.printStackTrace();
        }
    }
}
