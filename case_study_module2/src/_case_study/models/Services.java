package _case_study.models;

import java.util.Objects;
import java.util.Scanner;

public abstract class Services{
    public int id;
    public String tenDichVu;
    public double dienTichSudung;
    public double chiPhiThue;
    public int soNguoiToiDa;
    public String kieuThue;

    public Services() {
    }

    public Services(int id, String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
        this.id = id;
        this.tenDichVu = tenDichVu;
        this.dienTichSudung = dienTichSudung;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSudung() {
        return dienTichSudung;
    }

    public void setDienTichSudung(double dienTichSudung) {
        this.dienTichSudung = dienTichSudung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
    public Scanner getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }


    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSudung='" + dienTichSudung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiToiDa='" + soNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
    private void showInfo(){
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Services services = (Services) o;
        return Objects.equals(tenDichVu, services.tenDichVu);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Services services = (Services) o;
//        return Objects.equals(id, services.id) &&
//                Objects.equals(tenDichVu, services.tenDichVu) &&
//                Objects.equals(dienTichSudung, services.dienTichSudung) &&
//                Objects.equals(chiPhiThue, services.chiPhiThue) &&
//                Objects.equals(soNguoiToiDa, services.soNguoiToiDa) &&
//                Objects.equals(kieuThue, services.kieuThue);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(tenDichVu);
    }

}
