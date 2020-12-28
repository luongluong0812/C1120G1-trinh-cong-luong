package _case_study.models;

import java.util.Scanner;

public class House extends Services {
    Scanner input=new Scanner(System.in);
    private  String tieuChuanPhong;
    private  String moTaTienNghi;
    private  String soTang;

    public House() {
    }

    public House(String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
    }

    public House(String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghi, String soTang) {
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

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghi='" + moTaTienNghi + '\'' +
                ", soTang='" + soTang + '\'' +
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
    public void inputHouse(){
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
        System.out.println("tieu chuan phong");
        tieuChuanPhong=input.nextLine();
        System.out.println("mo ta tiien nghi");
        moTaTienNghi=input.nextLine();
        System.out.println("so tang");
        soTang=input.nextLine();
    }
}
