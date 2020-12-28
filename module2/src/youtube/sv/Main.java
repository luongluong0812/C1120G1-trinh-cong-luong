package youtube.sv;

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
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("nhap so sv cn them");
                    int n = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.input();
                        studentList.add(student);
                    }

                    break;
                case 2:
                    Student student1 = new Student();
                    student1.edit(studentList);
                    break;

                case 3:
                    String value = input.nextLine();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getId().contains(value)) {
                            System.out.println(studentList.get(i));
                            System.out.println("ban muon delete phai khong");
                            System.out.println("1.dong y");
                            System.out.println("2.huy");
                            int chooseDelete = input.nextInt();
                            switch (chooseDelete) {
                                case 1:
                                    studentList.remove(studentList.get(i));
                                    System.out.println("da xoa");
                                    break;
                                case 2:
                                    showMenu();
                                default:
                                    System.out.println("lua chon khong hop le");
                            }
                        }


                    }
                case 6:
                    for (Student s : studentList) {
                        s.showInfo();
                        break;
                    }

            }
        } while (choose != 7);
    }


    static void showMenu() {
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("7.good bye!");
    }
}