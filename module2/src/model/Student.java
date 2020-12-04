package model;

public class Student {
    private String StudentID;
    private int studentYear;
    private float studentAVGMark;
    private String faculty;
    public Student(){

    }
    public Student(String studentID){
        this.StudentID = studentID;
    }

    public Student(String studentID, int studentYear, float studentAVGMark, String faculty) {
       this.StudentID = studentID;
        this.studentYear = studentYear;
        this.studentAVGMark = studentAVGMark;
        this.faculty = faculty;
    }

    public Student(int studentYear){



    }
    public void goToSchool(){

    }
    public  void study(){

    }
    public void doExample(){

    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public float getStudentAVGMark() {
        return studentAVGMark;
    }

    public void setStudentAVGMark(float studentAVGMark) {
        this.studentAVGMark = studentAVGMark;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public  void seeExample(){

    }

}
