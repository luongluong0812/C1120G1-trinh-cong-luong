package youtube.sv;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

public class Student {
    Scanner input=new Scanner(System.in);
    private String id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
    public void showInfo(){
        System.out.println(toString());
    }
    public  void input(){
        System.out.println("nhap id");
        id=input.nextLine();
        System.out.println("nhap ten");
        name=input.nextLine();
        System.out.println("nhap tuoi");
        age=input.nextInt();
        System.out.println("nhap dia chi");
        address=input.nextLine();
        System.out.println("nhap diem");
        gpa=input.nextDouble();

    }
    public void edit(List<Student> studentList){
        System.out.println("nhap id can sua");
        String idEdit=input.nextLine();
        boolean check=false;
        for (int i = 0; i <studentList.size() ; i++) {
            if (studentList.get(i).getId().contains(idEdit)){
                System.out.println("nhap id moi");
                studentList.get(i).setId(input.nextLine());
                System.out.println("nhap ten");
                studentList.get(i).setName(input.nextLine());
                System.out.println("nhap tuoi moi");
                studentList.get(i).setAge(input.nextInt());
                System.out.println("nhap dia chi moi");
                studentList.get(i).setAddress(input.nextLine());
                System.out.println("nhap diem tb moi");
                studentList.get(i).setGpa(input.nextDouble());
                check=true;
            }

        } if(!check){
            System.out.println("ko co trong dnahs ach");
        }



    }

}
