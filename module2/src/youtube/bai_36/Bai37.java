package youtube.bai_36;

import model.Student;

public class Bai37 {
    public static void main(String[] args) {
        Student studentA= new Student();
        studentA.setStudentID("b123dsad");
        String Aid= studentA.getStudentID();
        System.out.println(Aid);
        Student studentB= new Student();
        studentB.setStudentID("123456");
        String Bid= studentB.getStudentID();

    }
}
