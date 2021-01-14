package read_write;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUntils {
    public void writeFile(String patchFile,String line){
        try {
            FileWriter fileWriter=new FileWriter(patchFile);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
