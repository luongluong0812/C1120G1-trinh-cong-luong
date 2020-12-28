package youtube.doc;

import java.io.*;

public class Doc {
    public static void main(String[] args) throws IOException {
        Student s=new Student("luong",12,"@.com");
        Student s1=new Student("hung",12,"@.com");
//        File file=new File("D:\\C0920G1_TRINHCONGLUONG\\test.txt");
//        if(file.exists()){
//            file.createNewFile();
//        }
//        FileInputStream fileInputStream=new FileInputStream(file);
//        int c=fileInputStream.read();
//        while (c!=-1){
//            System.out.print((char)c);
//            c=fileInputStream.read();
//        }
//        fileInputStream.close();
//        FileOutputStream fileOutputStream=new FileOutputStream(file);
//       String s="hello";
//       fileOutputStream.write(s.getBytes());
//       fileOutputStream.close();
FileOutputStream fileOutputStream=new FileOutputStream("D:\\C0920G1_TRINHCONGLUONG\\module2\\src\\youtube\\doc\\test.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(s);
        objectOutputStream.writeObject(s1);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
