package GitIgnoreFileSaver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GitIgnoreFileSaver {


    public void saveFileInGitIgnore(String contentToWrite){

        File gitIgnoreFile=new File(".gitignore");

        if(!gitIgnoreFile.exists()){
            try {
                gitIgnoreFile.createNewFile();
            }catch(IOException ioException){
                ioException.printStackTrace();
            }
            }else{

            try
                    (BufferedWriter writer=new BufferedWriter(new FileWriter(gitIgnoreFile,true)))
            {
                writer.write(contentToWrite);
                writer.newLine();

            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        }

    }

