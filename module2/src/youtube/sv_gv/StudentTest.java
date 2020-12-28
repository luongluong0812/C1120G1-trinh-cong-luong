package youtube.sv_gv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("nhap lua chon");
            choose=Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
                    System.out.println("nhap so sv can them");
                    int n=Integer.parseInt(input.nextLine());
                    for (int i = 0; i <n ; i++) {
                        Student student=new Student();
                        student.inputInfo();
                        studentList.add(student);
                    }
                    break;
                case 2:
                    for (Student student:studentList) {
                        student.showInfo();
                    }
                    break;
                case 3:
                    double min=studentList.get(0).getDiem();
                    double max=  studentList.get(0).getDiem();
                    for (int i = 0; i <studentList.size() ; i++) {
                        if(studentList.get(i).getDiem()>max){
                            max=studentList.get(i).getDiem();
                        } else if(studentList.get(i).getDiem()<max){
                            min=studentList.get(i).getDiem();
                        }
                    }
                    System.out.println("diem ca nhat"+max+"  thap nhat "+min);
                    break;
                case 5:
                    Collections.sort(studentList,new NameComparator());
                    for (Student s:studentList) {
                        s.showInfo();
                    }
                    break;



            }
        }while (choose!=7);

    }
    public static void showMenu(){
        System.out.println("Chọn 1: Nhập vào n sinh viên n là số lượng sinh viên, được nhập từ bàn phím");
        System.out.println("Chọn 2: Hiển thị thông tin tất cả các sinh viên ra màn hình");
        System.out.println("Chọn 3: Hiển thị sinh viên có điểm trung bình cao nhất và sinh viên có điểm trung bình thấp nhất");
        System.out.println("Chọn 4: Tìm kiếm sinh viên theo mã sinh viên. Nhập vào mã sinh viên. Nếu tồn tại sinh viên");
        System.out.println("Chọn 5: Hiển thị tất cả các sinh viên theo thứ tự tên trong bảng chữ cái (A->Z)" );
        System.out.println("Chọn 6: Hiển thị tất cả các sinh viên được học bổng, và sắp xếp theo thứ tự điểm cao xuống thấp" );
        System.out.println("Chọn 7: Thoát");
    }
}
