package _case_study.models;

public abstract class DichVuDiKem {
    private String tenDichVu;
    private double donGia;
    private double giaTien;

    public DichVuDiKem() {
    }

    public DichVuDiKem(String tenDichVu, double donGia, double giaTien) {
        this.tenDichVu = tenDichVu;
        this.donGia = donGia;
        this.giaTien = giaTien;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }


    public String showInfor() {
        return "DichVuDiKem{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", donGia=" + donGia +
                ", giaTien=" + giaTien +
                '}';
    }
}
