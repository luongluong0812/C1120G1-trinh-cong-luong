package youtube.doc;

import java.io.*;

public class Read {
    public static void main(String[] args) {
       // Object obj=null;
        try {
            FileInputStream fileInputStream=new FileInputStream("D:\\C0920G1_TRINHCONGLUONG\\module2\\src\\youtube\\doc\\test.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Student student=null;
           do {
               student=(Student)objectInputStream.readObject();
               System.out.println(student);
           }while (student!=null);
            objectInputStream.close();
            fileInputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("Da het file roi");
        }  catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
