package _case_study.models;

import java.util.Scanner;

public class Room extends Services{
    Scanner input=new Scanner(System.in);
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
    }



    public Room(String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
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
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +
                ", id='" + id + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
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
        id=input.nextLine();
        System.out.println("nhap ten dich vu");
        tenDichVu=input.nextLine();
        System.out.println("nhap dien tich su dung");
        dienTichSudung=input.nextLine();
        System.out.println("nhap chi phi thue");
        chiPhiThue=input.nextLine();
        System.out.println("nhap so nguoi toi da");
        soNguoiToiDa=input.nextLine();
        System.out.println("nhap kei thue");
        kieuThue=input.nextLine();
        System.out.println("dich vu mien phi di kem");
        dichVuMienPhiDiKem=input.nextLine();
    }
}
