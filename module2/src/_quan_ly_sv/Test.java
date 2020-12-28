package _quan_ly_sv;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> studentList=new ArrayList<>();
        int chose;
        Scanner input=new Scanner(System.in);
        do {
            showMenu();
            System.out.println("chose");
            chose=input.nextInt();
            switch (chose){
                case 1:
                    int n;
                    n=input.nextInt();
                    for (int i=0;i<=n;i++){
                       Student std=new Student();
                       std.inputInfo();
                       studentList.add(std);
                    }
                    break;
                case 2:
                    for (int i=0;i<studentList.size();i++){
                  studentList.get(i).showInfo();
                    }
                    break;
                case 3:
                    for (int i=0;i<studentList.size();i++){
                        if(studentList.get(i).getMark()>8);{
                            System.out.println(studentList.get(i).getName());
                        }
                    }
            }
        }while (chose!=7);

    }
    static  void showMenu(){
        System.out.println("1.nhap vao n sv");
        System.out.println("2.hien thi thong tin sv");
        System.out.println("3.hien thi diem max");
        System.out.println("4.tim hiem");
        System.out.println("5.hien thi sv a-z");
        System.out.println("6.hien thi sv dc hcx bong,theo thu tu giam dan");
        System.out.println("7,thaot");
    }
}
