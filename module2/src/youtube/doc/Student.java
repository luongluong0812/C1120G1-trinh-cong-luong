package youtube.doc;

import youtube.sv_gv.Person;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
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
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", diem=" + diem +
                ", email='" + email + '\'' +
                '}';
    }
}
