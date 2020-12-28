package youtube.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("D:\\C0920G1_TRINHCONGLUONG\\module2\\src\\youtube\\io\\listst.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            while (objectInputStream!=null){
                Student student= (Student) objectInputStream.readObject();
                System.out.println(student);
            }
            objectInputStream.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
