package _case_study.models;

import java.util.Scanner;

public class Room extends Services{
    Scanner input=new Scanner(System.in);
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(int id, String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
    }



    public Room(int id, String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return "Room{" +
                ":tenDichVu='" + tenDichVu + '\'' +
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +
                ", id='" + id + '\'' +
                ", dienTichSudung='" + dienTichSudung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
    public void showInfo(){
        System.out.println(toString());
    }
    public void inputRoom(){
        System.out.println("nhap id");
        id=Integer.parseInt(input.nextLine());
        boolean check=false;
        do {
            System.out.println("nhap ten dich vu");
            tenDichVu=input.nextLine();
            String regexName="[A-Z]+[a-z]*";
            check=tenDichVu.matches(regexName);
            if (check==false){
                System.out.println("sai dinh dang ten A+abc");
            }

        }while (!check);
//        System.out.println("nhap ten dich vu");
//        tenDichVu=input.nextLine();
        check=false;
        do {
            System.out.println("nhap dien tich su dung");
            dienTichSudung=Double.parseDouble(input.nextLine());
            if(dienTichSudung<30){
                System.out.println("dien tich phai lo hon 30!");
            } else {
                check=true;
            }
        }while (!check);
        check=false;
        do {
            System.out.println("nhap chi phi thue");
            chiPhiThue=Double.parseDouble(input.nextLine());
            if(chiPhiThue<0){
                System.out.println("chi phi thue phai la so duong");
            } else check=true;
        }while (!check);

//        System.out.println("nhap chi phi thue");
//        chiPhiThue=Double.parseDouble(input.nextLine());
        check=false;
     do {
         System.out.println("nhap so nguoi toi da");
         soNguoiToiDa=Integer.parseInt(input.nextLine());
         if (soNguoiToiDa<0 ||soNguoiToiDa>20){
             System.out.println("so nguoi nho hon 20& lon hon 0");
         }else {
             check=true;
         }
     }while (!check);
     check=false;
        System.out.println("nhap kieu thue");
        kieuThue=input.nextLine();
        do { System.out.println("dich vu mien phi di kem");
            dichVuMienPhiDiKem=input.nextLine();
           String regexDVMPDKK="(massage|karaoke|food|drink|car){1,1}";
           check=dichVuMienPhiDiKem.matches(regexDVMPDKK);
           if(check==false){
               System.out.println("massage|karaoke|food|drink|car???)");
           }
        }while (!check);

    }
}
