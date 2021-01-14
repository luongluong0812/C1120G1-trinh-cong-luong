package quan_li_san_pham;

import java.util.Scanner;

public class SanPhamXuatKhau extends SanPham {
    private double giaXuatKhau;
    private String quocGiaNhapSanPham;

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSanPham() {
        return quocGiaNhapSanPham;
    }

    public void setQuocGiaNhapSanPham(String quocGiaNhapSanPham) {
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public SanPhamXuatKhau() {
    }

    public SanPhamXuatKhau(int id, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat, double giaXuatKhau, String quocGiaNhapSanPham) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public void inputXK() {
        Scanner input = new Scanner(System.in);
        System.out.println("ma san pham");
        maSanPham = input.nextLine();
        System.out.println("ten san pham");
        tenSanPham = input.nextLine();
        System.out.println("gia ban");
        giaBan = Double.parseDouble(input.nextLine());
        System.out.println("so luong");
        soLuong = Integer.parseInt(input.nextLine());
        System.out.println("nha san xuat");
        nhaSanXuat = input.nextLine();
        System.out.println("gia xuat khau");
        giaXuatKhau = Double.parseDouble(input.nextLine());
        System.out.println("quoc gia nhap khau");
        quocGiaNhapSanPham = input.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "," + giaXuatKhau + "," + quocGiaNhapSanPham;
    }
}
