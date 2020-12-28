package youtube.sv_gv;

import java.util.List;

public class Student extends Person {
    private String id;
    private double diem;
    private String email;

    public Student() {
    }

    public Student(String id, double diem, String email) {
        this.id = id;
        this.diem = diem;
        this.email = email;
    }

    public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, String id, double diem, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.id = id;
        this.diem = diem;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void max(List<Student> studentList){
        for (int i = 0; i <studentList.size() ; i++) {
            if(studentList.get(i).getDiem()>8){
                System.out.println(studentList.get(i));
            }
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.println("nhap id");
        id=input.nextLine();
        System.out.println("nhap email");
        email=input.nextLine();
        System.out.println("nhap diem");
        diem=(double)input.nextDouble();

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", diem=" + diem +
                ", email='" + email + '\'' +
                ", input=" + input +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }
}
