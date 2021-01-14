package quan_li_san_pham;

import java.util.Scanner;

public abstract class SanPham {
    int id;
    String maSanPham;
    String tenSanPham;
    double giaBan;
    int soLuong;
    String nhaSanXuat;
    String regex = "^[1-9]+";

    public SanPham() {
    }

    public SanPham(int id, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("ma san pham");
        maSanPham = input.nextLine();
        System.out.println("ten san pham");
        tenSanPham = input.nextLine();
        Boolean check = false;
//        do {
//            System.out.println("gia ban");
//           giaBan=Double.parseDouble(input.nextLine());
//           giaBan.matches(regex);
//
//        }
        do {

            System.out.println("gia ban");
            giaBan = Double.parseDouble(input.nextLine());
            if (giaBan <= 0) {
                System.out.println("nhap lai>0");
            }
        } while (giaBan <= 0);
        System.out.println("so luong");
        soLuong = Integer.parseInt(input.nextLine());
        System.out.println("nha san xuat");
        nhaSanXuat = input.nextLine();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return id + "," + maSanPham + "," + tenSanPham + "," + giaBan + "," + soLuong + "," + nhaSanXuat;
    }
}
