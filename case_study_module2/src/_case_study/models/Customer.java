package _case_study.models;

import java.util.Comparator;
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

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputCustomer(){
        boolean check=false;
       do {
           System.out.println("nhap ho va ten");
           hoVaTen=input.nextLine();
           String regexNae="^([A-Z]+[a-z]{1,7}+\\s[A-Z][a-z]{1,7}+\\s[A-Z][a-z]{1,7})|([A-Z]+[a-z]{1,7}+\\s[A-Z][a-z]{1,7})$|[A-Z][a-z]?";
           check=hoVaTen.matches(regexNae);
           if(check==false){
               System.out.println("ten phai viet hoa chu cai dau");
           }

       }while (!check);

       check=false;
        do {  System.out.println("nhap ngay sinh");
              ngaySinh=input.nextLine();
            String regexDate="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
            check=ngaySinh.matches(regexDate);
            if(check==false){
                System.out.println("co van de gi do trong luc ban nhap,kiem tra lai");
          }
        }while (!check);
        check=false;
      do {
          System.out.println("gioi tinh");
          gioiTinh=input.nextLine();
          String regexGander="(male|female)?";
          String str="";
          check=gioiTinh.toLowerCase().matches(regexGander);
          if(check==false){
              System.out.println("male|female?");
          }
      }while (!check);
        System.out.println("nham cmnd");
        CMND=input.nextLine();
        System.out.println("nhap sdt");
        soDT=input.nextLine();
        check=false;
       do {
           System.out.println("nhap email:");
           email=input.nextLine();
           String regexEmail="^[\\w]+@[a-z]{3,5}(\\.[a-z]{3,5})+$";
           check=email.matches(regexEmail);
           if(check==false){
               System.out.println("Email phải đúng định dạng abc@abc.abc”.Email phải đúng định dạng abc@abc.abc");
           }
       }while (!check);
        System.out.println("nhap loai kh");
        loaiKH=input.nextLine();
        System.out.println("nhap dia chi");
        diaChi=input.nextLine();
    }

    @Override
    public String toString() {
        return hoVaTen + "," + ngaySinh + "," + gioiTinh + "," + CMND + "," + soDT + "," + email + "," + loaiKH + "," + diaChi;
    }
    public void showInfo(){
        System.out.println(toString());
    }
   public void showInformationCustomers(){

   }


}
