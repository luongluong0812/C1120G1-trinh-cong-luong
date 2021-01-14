package quan_li_sv1;

import java.awt.*;
import java.util.Scanner;

public class Student {
    int id;
    String name;
    int age;
    String address;
    double gpa;

    public Student() {
    }

    public Student(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id +
                "," + name +
                "," + age +
                "," + address +
                "," + gpa ;
    }

    public void showInfo(){
        System.out.println(toString());    }
    public void input(){
        Scanner input=new Scanner(System.in);
        Boolean check=false;
        do {
            System.out.println("name?");
            name=input.nextLine();
            String regexName="[A-Z]{1,1}[a-z]+";
            check=name.matches(regexName);
            if(check==false){
                System.out.println("ten phai viet hoa");
            }
        }while (!check);
        check=false;
        do {
            System.out.println("nhap tuoi");
            age=Integer.parseInt(input.nextLine());
            if(age>100||age<10){
                check=false;
                System.out.println("tuoi co van de");

            }

        }while (age>100||age<10);
        System.out.println("dia chi");
        address=input.nextLine();
        System.out.println("diem?");
        gpa=Double.parseDouble(input.nextLine());


    }
}
