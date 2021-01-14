package quan_ly_thu_vien;

import java.util.Scanner;

public class Sach extends TaiLieu {
    String tenTacGia;
    int soTrang;

    public Sach() {
    }

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    public void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("ma tai lieu");
        maTaiLieu=input.nextLine();
        System.out.println("nha xuat ban");
        nhaXuatBan=input.nextLine();
        System.out.println("so phat hanh");
        soBanPhatHanh=input.nextLine();
        System.out.println("ten tac gia");
        tenTacGia=input.nextLine();
        System.out.println("so trang");
        soTrang=Integer.parseInt(input.nextLine());

    }

    @Override
    public String toString() {
        return super.toString() +","+tenTacGia+","+soTrang;
    }
}
