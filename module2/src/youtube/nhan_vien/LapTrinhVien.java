package youtube.nhan_vien;

import java.util.Scanner;

public class LapTrinhVien extends NhanVien {
    private int gioThem;

    public LapTrinhVien() {
    }

    public LapTrinhVien(int gioThem) {
        this.gioThem = gioThem;
    }

    public LapTrinhVien(Scanner input, String maNhanVien, String ten, String tuoi, String SDT, String email, int luong, int gioThem) {
        super(input, maNhanVien, ten, tuoi, SDT, email, luong);
        this.gioThem = gioThem;
    }

    public int getGioThem() {
        return gioThem;
    }

    public void setGioThem(int gioThem) {
        this.gioThem = gioThem;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("so gio lam them");
        gioThem=Integer.parseInt(input.nextLine());
    }

    @Override
    public int tinhLuong() {
        int tienLuong=getLuong()+getGioThem()*20000;
        return tienLuong;
    }

    @Override
    public String toString() {
        return super.toString()+" gio lam them: "+gioThem;
    }
}
