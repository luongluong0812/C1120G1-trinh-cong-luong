package youtube.sv_basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("nhap lua chon");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    Student student = new Student();
                    System.out.println("nhap id");
                    student.setId(input.nextLine());
                    System.out.println("nhap ten");
                    String name=input.nextLine();
                    student.setName(name);
                    System.out.println("nhap dia chi");
                    student.setAddress(input.nextLine());
                    System.out.println("nhap sdt");
                    student.setPhoneNumber(input.nextLine());
                    studentList.add(student);
                    break;
                case 2:
                    for (Student s : studentList) {
                        System.out.println(s.toString());
                    }
                    break;
                case 3:
                    break;
            }


        } while (choose != 3);
    }

    public static void showMenu() {
        System.out.println("1.them sv");
        System.out.println("2.danh sach");
        System.out.println("3.thaot");
    }


}
