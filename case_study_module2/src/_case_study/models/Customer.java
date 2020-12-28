package _case_study.models;

import java.util.Scanner;

public class Customer {
    Scanner input =new Scanner(System.in);
    private String hoVaTen;
    private String ngaySinh;
    private String gioiTinh;
    private String CMND;
    private String soDT;
    private String email;
    private String loaiKH;
    private String diaChi;

    public Customer() {
    }

    public Customer(String hoVaTen, String ngaySinh, String gioiTinh, String CMND, String soDT, String email, String loaiKH, String diaChi) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.CMND = CMND;
        this.soDT = soDT;
        this.email = email;
        this.loaiKH = loaiKH;
        this.diaChi = diaChi;
    }
    public void inputCustomer(){
        System.out.println("nhap ho va ten");
        hoVaTen=input.nextLine();
        System.out.println("nhap ngay sinh");
        ngaySinh=input.nextLine();
        System.out.println("gioi tinh");
        gioiTinh=input.nextLine();
        System.out.println("nham cmnd");
        CMND=input.nextLine();
        System.out.println("nhap sdt");
        soDT=input.nextLine();
        System.out.println("nhap email:");
        email=input.nextLine();
        System.out.println("nhap loai kh");
        loaiKH=input.nextLine();
        System.out.println("nhap dia chi");
        diaChi=input.nextLine();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", CMND='" + CMND + '\'' +
                ", soDT='" + soDT + '\'' +
                ", email='" + email + '\'' +
                ", loaiKH='" + loaiKH + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
    public void showInfo(){
        System.out.println(toString());
    }
   public void showInformationCustomers(){

   }
}
