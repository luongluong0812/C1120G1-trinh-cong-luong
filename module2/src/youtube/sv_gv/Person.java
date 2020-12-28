package youtube.sv_gv;

import java.util.Scanner;

public class Person {
    Scanner input=new Scanner(System.in);
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public Person() {
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void inputInfo(){
        System.out.println("nhap ten");
        ten=input.nextLine();
        System.out.println("nhap gio tinh");
        gioiTinh=input.nextLine();
        System.out.println("ngay sinh");
        ngaySinh=input.nextLine();
        System.out.println("dia chi");
        diaChi=input.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "input=" + input +
                ", ten='" + ten + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
    public void showInfo(){
        System.out.println(toString());
    }
}
