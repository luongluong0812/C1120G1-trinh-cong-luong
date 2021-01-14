package quan_ly_thu_vien;

import java.util.Scanner;

public class Bao extends TaiLieu{
    String ngayPhatHanh;

    public Bao() {
    }

    public Bao(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("ma tai lieu");
        maTaiLieu=input.nextLine();
        System.out.println("nha xuat ban");
        nhaXuatBan=input.nextLine();
        System.out.println("so phat hanh");
        soBanPhatHanh=input.nextLine();
        System.out.println("ngay phat hanh");
        ngayPhatHanh=input.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+ ","+ngayPhatHanh;
    }
}
