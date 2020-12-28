package _case_study.models;

import java.util.Objects;
import java.util.Scanner;

public class Villa extends Services{
    Scanner input=new Scanner(System.in);
    public   String tieuChuanPhong;
    public   String moTaTienNghi;
    public   int soTang;
    public double dienTichHoBoi;

    public Villa() {
    }

    public Villa(int id, String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
    }

    public Villa(int id, String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghi, int soTang, double dienTichHoBoi) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.soTang = soTang;
        this.dienTichHoBoi = dienTichHoBoi;
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

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    @Override
    public String toString() {
        return "Villa{" +
                ":tenDichVu='" + tenDichVu + '\'' +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghi='" + moTaTienNghi + '\'' +
                ", soTang='" + soTang + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
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
    public void inputVilla(){
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
        System.out.println("nhap dien tich ho boi");
        dienTichHoBoi=input.nextDouble();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Villa villa = (Villa) o;
        return Double.compare(villa.dienTichHoBoi, dienTichHoBoi) == 0 &&
                Objects.equals(input, villa.input) &&
                Objects.equals(tieuChuanPhong, villa.tieuChuanPhong) &&
                Objects.equals(moTaTienNghi, villa.moTaTienNghi) &&
                Objects.equals(soTang, villa.soTang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), input, tieuChuanPhong, moTaTienNghi, soTang, dienTichHoBoi);
    }
}
