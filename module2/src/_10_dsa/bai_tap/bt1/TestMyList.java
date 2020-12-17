package _10_dsa.bai_tap.bt1;

import java.util.Arrays;

public class TestMyList {
   public static class Student{
       private int id;
       private String name;

       public Student() {
       }

       public Student(int id, String name) {
           this.id = id;
           this.name = name;
       }

       public int getId() {
           return id;
       }

       public void setId(int id) {
           this.id = id;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }
   }

    public static void main(String[] args) throws IllegalAccessException {
        Student a=new Student(1,"luong");
        Student b=new Student(2,"hang");
        Student c=new Student(3,"tam");
        Student d=new Student(4,"long");
        MyArrayList<Student> studentMyArrayList =new MyArrayList<>();
//        try {
//            studentMyArrayList.add(a);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        System.out.println(studentMyArrayList.size());
        for (int i=0;i<studentMyArrayList.size();i++){
            Student student=(Student)studentMyArrayList.elements[i];
        }



    }


}
