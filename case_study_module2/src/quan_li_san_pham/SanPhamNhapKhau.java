package quan_li_san_pham;

import java.util.Scanner;

public class SanPhamNhapKhau extends SanPham {
    double giaNhapKhau;
    String tinhThanhNhapKhau;
    double thueNhapkhau;

    public SanPhamNhapKhau() {
    }

    public SanPhamNhapKhau(int id, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
    }

    public SanPhamNhapKhau(int id, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat,
                           double giaNhapKhau, String tinhThanhNhapKhau, double thueNhapkhau) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhapKhau = tinhThanhNhapKhau;
        this.thueNhapkhau = thueNhapkhau;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("gia nhap khau");
        Scanner input = new Scanner(System.in);
        giaNhapKhau = Double.parseDouble(input.nextLine());
        System.out.println("tinh thanh nhap khau");
        tinhThanhNhapKhau = input.nextLine();
        System.out.println("thue nhap khau");
        thueNhapkhau = Double.parseDouble(input.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "," + giaNhapKhau + "," + tinhThanhNhapKhau + "," + thueNhapkhau;
    }

}
