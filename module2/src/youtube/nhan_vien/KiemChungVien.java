package youtube.nhan_vien;

import java.util.Scanner;

public class KiemChungVien extends NhanVien {
    private int soLoi;

    public KiemChungVien() {
    }

    public KiemChungVien(int soLoi) {
        this.soLoi = soLoi;
    }

    public KiemChungVien(Scanner input, String maNhanVien, String ten, String tuoi, String SDT, String email, int luong, int soLoi) {
        super(input, maNhanVien, ten, tuoi, SDT, email, luong);
        this.soLoi = soLoi;
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    @Override
    public int tinhLuong() {
       int tienLuong=getLuong()+soLoi*2000;
       return tienLuong;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("so loi phat hien?");
        soLoi=Integer.parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return super.toString()+"so loi phat hien: "+soLoi;
    }
}
