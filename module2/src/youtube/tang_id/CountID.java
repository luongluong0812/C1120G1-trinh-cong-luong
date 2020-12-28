package youtube.tang_id;

import youtube.test_text.Book;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountID {


    private static int id;

    public static void main(String[] args) {
        List<Phone> list = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("lua chon cua ban?");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:

                    Phone p = new Phone();

                    p.setId(++id);


                    System.out.println("ten");
                    p.setName(input.nextLine());
                    System.out.println("gia");
                    p.setPrice(input.nextLine());
                    list.add(p);
                    try {
                        FileWriter fileWriter = new FileWriter("src/youtube/tang_id/phone.txt");
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(String.valueOf(list));
                        bufferedWriter.close();
                        fileWriter.close();

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;


                case 2:
                    try {
                        FileReader fileReader = new FileReader("src/youtube/tang_id/phone.txt");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        for (Phone phone : list) {
                            System.out.println(phone.toString());
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        FileReader fileReader = new FileReader("src/youtube/tang_id/phone.txt");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        for (Student st : studentList) {
                            System.out.println(st.toString());

                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    Student student = new Student();
                    student.setId(++id);
                    System.out.println("name");
                    student.setName(input.nextLine());
                    System.out.println("diem");
                    student.setGpa(Integer.parseInt(input.nextLine()));
                    studentList.add(student);
                    try {
                        FileWriter fileWriter = new FileWriter("src/youtube/tang_id/phone.txt");
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(String.valueOf(studentList));
                        bufferedWriter.close();
                        fileWriter.close();

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    for (Student st : studentList) {
                        System.out.println(st.toString());

                    }
                    break;

            }

        } while (choose != 7);
//        Phone p=new Phone();
//        ++Countid;
//        System.out.println("ten");
//        p.setName(input.nextLine());
//        System.out.println("gia");
//        p.setPrice(input.nextLine());


    }

    static void showMenu() {
        System.out.println("1.them");
        System.out.println("2.hien ds phone");
        System.out.println("3.hien sv");
        System.out.println("4.them sv");
        System.out.println("7.thoat");
    }
}
