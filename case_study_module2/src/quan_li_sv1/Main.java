package quan_li_sv1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int countId = 0;

        Scanner input = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    List<Student> list = new ArrayList<>();
                    Student student = new Student();
                    student.setId(++countId);
                    student.input();
                    list.add(student);
                    try {
                        FileWriter fileWriter = new FileWriter("src/quan_li_sv1/data.csv", true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        for (Student student1 : list) {
                            bufferedWriter.write(String.valueOf(student1));
                            bufferedWriter.newLine();

                        }
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.println("nhap id can sua");
                    int idEdit = Integer.parseInt(input.nextLine());
                    List<Student> list1 = new ArrayList<>();
                    try {
                        FileReader fileReader = new FileReader("src/quan_li_sv1/data.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String txt[] = line.split(",");
                            int id = Integer.parseInt(txt[0]);
                            String name = txt[1];
                            int age = Integer.parseInt(txt[2]);
                            String address = txt[3];
                            double gpa = Double.parseDouble(txt[4]);
                            list1.add(new Student(id, name, age, address, gpa));
                        }
                        for (int i = 0; i < list1.size(); i++) {
                            if (list1.get(i).getId() == idEdit) {
                                System.out.println("id moi");
                                int id = Integer.parseInt(input.nextLine());
                                list1.get(i).setId(id);
                                System.out.println("name moi");
                                list1.get(i).setName(input.nextLine());
                                System.out.println("tuoi moi");
                                list1.get(i).setAge(Integer.parseInt(input.nextLine()));
                                System.out.println("dia chi moi");
                                list1.get(i).setAddress(input.nextLine());
                                System.out.println("diem moi");
                                list1.get(i).setGpa(Double.parseDouble(input.nextLine()));
                            }
                        }
                        FileWriter fileWriter = new FileWriter("src/quan_li_sv1/data.csv");
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        for (Student student1 : list1) {
                            bufferedWriter.write(String.valueOf(student1));
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.close();
                        break;


                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case 3:
                    List<Student> list2 = new ArrayList<>();
                    System.out.println("nhap id can xoa");
                    int idDelete = Integer.parseInt(input.nextLine());
                    try {
                        FileReader fileReader = new FileReader("src/quan_li_sv1/data.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String txt[] = line.split(",");
                            int id = Integer.parseInt(txt[0]);
                            String name = txt[1];
                            int age = Integer.parseInt(txt[2]);
                            String address = txt[3];
                            double gpa = Double.parseDouble(txt[4]);
                            list2.add(new Student(id, name, age, address, gpa));

                        }
                        for (int i = 0; i < list2.size(); i++) {
                            if (list2.get(i).getId() == idDelete) {
                                list2.remove(list2.get(i));
                            }
                        }
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/quan_li_sv1/data.csv"));
                        for (Student st : list2) {
                            bufferedWriter.write(String.valueOf(st));
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    List<Student> list3 = new ArrayList<>();

                    try {
                        FileReader fileReader = new FileReader("src/quan_li_sv1/data.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String txt[] = line.split(",");
                            int id = Integer.parseInt(txt[0]);
                            String name = txt[1];
                            int age = Integer.parseInt(txt[2]);
                            String address = txt[3];
                            double gpa = Double.parseDouble(txt[4]);
                            list3.add(new Student(id, name, age, address, gpa));

                        }
                        Collections.sort(list3, new Comparator<Student>() {
                            @Override
                            public int compare(Student student, Student student1) {
                                Double value = student.getGpa() - student1.getGpa();
                                if (value > 0) return 1;
                                else if (value < 0) return -1;
                                else return 0;

                            }
                        });
                        for (Student st :
                                list3) {
                            st.showInfo();
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    List<Student> list4 = new ArrayList<>();

                    try {
                        FileReader fileReader = new FileReader("src/quan_li_sv1/data.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String txt[] = line.split(",");
                            int id = Integer.parseInt(txt[0]);
                            String name = txt[1];
                            int age = Integer.parseInt(txt[2]);
                            String address = txt[3];
                            double gpa = Double.parseDouble(txt[4]);
                            list4.add(new Student(id, name, age, address, gpa));

                        }
                        Collections.sort(list4, new Comparator<Student>() {
                            @Override
                            public int compare(Student student, Student student1) {
                                return student.getName().compareTo(student1.getName());

                            }
                        });
                        for (Student st :
                                list4) {
                            st.showInfo();
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    System.out.println("id,name,age,address,gpa");
                    try {
                        FileReader fileReader = new FileReader("src/quan_li_sv1/data.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            System.out.println(line);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    List<Student> list8 = new ArrayList<>();
                    System.out.println("****");
                    System.out.println("search by id");
                    System.out.println("nhap id can tim");
                    int idSearch = Integer.parseInt(input.nextLine());
                    try {
                        FileReader fileReader = new FileReader("src/quan_li_sv1/data.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String txt[] = line.split(",");
                            int id = Integer.parseInt(txt[0]);
                            String name = txt[1];
                            int age = Integer.parseInt(txt[2]);
                            String address = txt[3];
                            double gpa = Double.parseDouble(txt[4]);
                            list8.add(new Student(id, name, age, address, gpa));
                        }
                        Boolean check = false;
                        int i = 0;
                        for (i = 0; i < list8.size(); i++) {
                            if (list8.get(i).getId() == idSearch) {
                                System.out.println(list8.get(i));
                                check = true;
                                break;
                            } else check = false;

                        }
                        if (check == false) {
                            System.out.println("ko co");
                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;


            }

        } while (choose != 8);

    }

    public static void showMenu() {
        System.out.println("1.add new student");
        System.out.println("2.edit student by id");
        System.out.println("3.delete student by id");
        System.out.println("4.sort student bu gpa");
        System.out.println("5.sort student by name");
        System.out.println("6.show student");
        System.out.println("7.Search by id");
        System.out.println("you choose?");

    }
}
