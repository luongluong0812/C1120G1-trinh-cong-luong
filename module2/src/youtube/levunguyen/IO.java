package youtube.levunguyen;

import model.test1.List;

import java.io.*;
import java.util.ArrayList;

public class IO {
    public void writeFile(String patchFile, String line){
        try {
            FileWriter fileWriter=new FileWriter(patchFile,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
