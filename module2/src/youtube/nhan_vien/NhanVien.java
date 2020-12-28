package youtube.nhan_vien;

import java.util.Scanner;

public class NhanVien {
    Scanner input=new Scanner(System.in);
    private String maNhanVien;
    private String ten;
    private String tuoi;
    private String SDT;
    private String email;
    private int luong;

    public NhanVien() {
    }

    public NhanVien(Scanner input, String maNhanVien, String ten, String tuoi, String SDT, String email, int luong) {
        this.input = input;
        this.maNhanVien = maNhanVien;
        this.ten = ten;
        this.tuoi = tuoi;
        this.SDT = SDT;
        this.email = email;
        this.luong = luong;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void nhap(){
        System.out.println("ma nhan vien");
        maNhanVien=input.nextLine();
        System.out.println("ten nv");
        ten=input.nextLine();
        System.out.println("tuoi");
        tuoi=input.nextLine();
        System.out.println("sdt?");
        SDT=input.nextLine();
        System.out.println("email?");
        email=input.nextLine();
        System.out.println("luong co ban?");
        luong=Integer.parseInt(input.nextLine());
    }
    public  int tinhLuong(){
        return 0;
    }


    @Override
    public String toString() {
        return "NhanVien{" +
                "input=" + input +
                ", maNhanVien='" + maNhanVien + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", SDT='" + SDT + '\'' +
                ", email='" + email + '\'' +
                ", luong=" + luong +
                '}';
    }
}
