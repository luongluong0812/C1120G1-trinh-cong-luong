package youtube.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {
    public static void main(String[] args) {
        Student student1=new Student("1","lan","08-12");
        Student student2=new Student("2","hung","09-05");
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("D:\\C0920G1_TRINHCONGLUONG\\module2\\src\\youtube\\io\\listst.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
