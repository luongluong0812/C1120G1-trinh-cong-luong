package youtube.doc_ghi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Student> list=new ArrayList<>();
//
//        Student s1=new Student("luong",15,2);
//        Student s2=new Student("an",15,2);
//        Student s3=new Student("hung",15,2);
//
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        writeFile(list);
        readFile();
//

    }
    public static void writeFile(List<Student> list){
        try {
            FileWriter fileWriter=new FileWriter("src/youtube/doc_ghi/test.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (Student s:list
            ) {
                bufferedWriter.write(s.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }






    public static List<Student> readFile(){
        List<Student> list=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader("src/youtube/doc_ghi/test.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while(true){
                line=bufferedReader.readLine();
                if(line==null){
                    break;
                }
                String [] txt =line.split(";");
                String name=txt[0];
                int age=Integer.parseInt(txt[1]);
                int mark=Integer.parseInt(txt[2]);
                Student st=new Student(name,age,mark);
                list.add(st);


                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }
}
