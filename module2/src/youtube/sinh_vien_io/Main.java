package youtube.sinh_vien_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("nhap so sv can them");
                    int n = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.input();
                        studentList.add(student);
                    }

                    break;
                case 2:
                    System.out.println("nhap id can sua");
                    int id = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getId() == id) {
                            System.out.println("nhap id moi");
                            studentList.get(i).setId(Integer.parseInt(input.nextLine()));
                            System.out.println("nhap ten moi");
                            studentList.get(i).setName(input.nextLine());
                            System.out.println("nhap tuoi moi");
                            studentList.get(i).setAge(Integer.parseInt(input.nextLine()));
                            System.out.println("nhap dia chi moi");
                            studentList.get(i).setAddress(input.nextLine());
                            System.out.println("nhap diem moi");
                            studentList.get(i).setGpa(Float.parseFloat(input.nextLine()));
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("nhap id can xoa");
                    int idDelete = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getId() == idDelete) {
                            studentList.remove(i);
                            break;
                        }
                    }

                    break;
                case 4:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student student, Student t1) {
                            if (student.getGpa() > t1.getGpa()) return -1;
                            else return 1;
                        }
                    });
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).display();
                    }
                    break;
                case 5:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student student, Student t1) {
                            int a = student.getName().compareTo(t1.getName());
                            if (a > 0) {
                                return 1;
                            } else if (a == 0) return 0;
                            else return -1;
                        }
                    });
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).display();
                    }
                    break;
                case 6:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).display();
                    }
                    break;
                case 7:
                    FileOutputStream fos;
                    ObjectOutputStream oos;
                    try {
                        fos = new FileOutputStream("D:\\C0920G1_TRINHCONGLUONG\\module2\\src\\youtube\\sinh_vien_io\\list.txt");
                        oos = new ObjectOutputStream(fos);
                        oos.writeObject(studentList);
                        oos.close();
                        fos.close();

                    } catch (Exception e) {

                    } finally {

                    }
                    break;
                case 8:
                    FileInputStream fis = null;
                    ObjectInputStream ois = null;
                    try {
                        fis = new FileInputStream("D:\\C0920G1_TRINHCONGLUONG\\module2\\src\\youtube\\sinh_vien_io\\list.txt");
                        ois = new ObjectInputStream(fis);
                        studentList = (List<Student>) ois.readObject();


                    } catch (Exception e) {

                    } finally {
                        try {
                            if (fis != null) {
                                fis.close();
                            }
                            if (ois != null) {
                                ois.close();
                            }

                        } catch (Exception e) {

                        }
                    }
                    break;
                case 9:
                    System.out.println("good bye!");
                    break;
                default:
                    System.err.println("lua chon khong hop le");
            }

        } while (choose != 9);

    }

    static void showMenu() {
        System.out.println("1.add");
        System.out.println("2.edit");
        System.out.println("3.delete");
        System.out.println("4.sort by gpa");
        System.out.println("5.sort by name");
        System.out.println("6.hien thi thong tin sv");
        System.out.println("7.save");
        System.out.println("8.read");
        System.out.println("9.exit");
        System.out.println("choose");
    }
}
