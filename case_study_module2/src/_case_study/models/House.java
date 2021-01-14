package _case_study.models;

import java.util.Scanner;

public class House extends Services implements Comparable<House> {
    Scanner input=new Scanner(System.in);
    private  String tieuChuanPhong;
    private  String moTaTienNghi;
    private  int soTang;

    public House() {
    }

    public House(int id, String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
    }

    public House(int id, String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghi, int soTang) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghi() {
        return moTaTienNghi;
    }

    public void setMoTaTienNghi(String moTaTienNghi) {
        this.moTaTienNghi = moTaTienNghi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return id +  ","+ tenDichVu + "," + dienTichSudung + "," + chiPhiThue + "," + soNguoiToiDa + "," + kieuThue +
                "," + tieuChuanPhong + "," + moTaTienNghi + "," + soTang ;




    }
    public void showInfo(){
        System.out.println(toString());
    }
    public void inputHouse(){
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
        // String regexName="[A-Z]+[a-z]*";
        check=false;

        do {
            System.out.println("nhap kieu thue");
            kieuThue=input.nextLine();
            String regexKieuThue="[A-Z]+[a-z]*";
            check=kieuThue.matches(regexKieuThue);
            if(check==false){
                System.out.println("kieu thue dung dinh dang A+abc");
            }

        }while (!check);
        check=false;
        do {
            System.out.println("tieu chuan phong");
            tieuChuanPhong=input.nextLine();
            String regexTieuChuanPhong="[A-Z]+[a-z]*";
            check=tieuChuanPhong.matches(regexTieuChuanPhong);
            if(check==false){
                System.out.println("dung dinh dang A+abc");
            }
        }while (!check);
        System.out.println("mo ta tien nghi");
        moTaTienNghi=input.nextLine();
        check=false;
       do {
           System.out.println("so tang");
           soTang=Integer.parseInt(input.nextLine());
           if (soTang<0){
               System.out.println("so tang phai lon hon 0!");
           } else {
               check=true;
           }
       }while (!check);
    }

    @Override
    public int compareTo(House house) {
        return this.getTenDichVu().compareTo(house.getTenDichVu());
    }
}
