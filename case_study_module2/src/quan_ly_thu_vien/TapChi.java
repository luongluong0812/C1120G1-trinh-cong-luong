package quan_ly_thu_vien;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    String soPhatHanh;
    String thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String soPhatHanh, String thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh, String soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    public void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("ma tai lieu");
        maTaiLieu=input.nextLine();
        System.out.println("nha xuat ban");
        nhaXuatBan=input.nextLine();
        System.out.println("so phat hanh");
        soBanPhatHanh=input.nextLine();
        System.out.println("so phat hanh");
        soPhatHanh=input.nextLine();
        System.out.println("thang phat hanh");
        thangPhatHanh=input.nextLine();

    }

    @Override
    public String toString() {
        return super.toString()+ ","+soPhatHanh+ ","+thangPhatHanh;
    }
}
