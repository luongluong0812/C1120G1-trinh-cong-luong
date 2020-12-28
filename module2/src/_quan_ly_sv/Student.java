package _quan_ly_sv;

import java.util.Scanner;

public class Student extends Person {
    String rollNo;
    Float mark;
    String email;

    public Student() {
    }

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if(rollNo!=null && rollNo.length()==8){
            this.rollNo = rollNo;
            return true;

        }
        else {
            System.err.println("nhap lai ma sinh vien(8k tu)");
            return false;
        }

    }

    public Float getMark() {
        return mark;
    }

    public boolean setMark(Float mark) {
        if(mark>=0&&mark<10){
            this.mark = mark;
            return true;
        }else {
            System.out.println("nhap sai diem");
            return false;
        }

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email!=null&& email.contains("@")&& !email.contains(" ")){
            this.email = email;
            return true;
        } else {
            System.out.println("nhap lai email");
            return false;
        }

    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input=new Scanner(System.in);
        System.out.println("nhap rollno");
        while (true){
            String rollNoInput=input.nextLine();
            boolean check=setRollNo(rollNoInput);
            if(check){
                break;
            }
        }
        System.out.println("nhap diem sv");
        while (true){
            float markInput=input.nextFloat();
            boolean check=setMark(markInput);
            if(check){
                break;
            }
        }
        System.out.println("nhap email");
        while (true){
            String emailInput=input.nextLine();
            boolean check=setEmail(emailInput);
            if(check){
                break;
            }

        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("mack"+getMark());
        System.out.println("email"+getEmail());
    }

    public boolean checkScholarship(){
        if(mark>=8){
            return true;
        } else {
            return false;
        }
    }
}
