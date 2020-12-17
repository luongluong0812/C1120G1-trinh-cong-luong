package model.test1;

public class HinhChuNhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(String mau, boolean trong) {
        super(mau, trong);
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat(String mau, boolean trong, double chieuDai, double chieuRong) {
        super(mau, trong);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double getDienTich() {
        return getChieuDai()*getChieuRong();
    }

    @Override
    public double getChuVi() {
        return (getChieuDai()+getChieuRong())*2;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}'+"co dien tich la: "+getDienTich();
    }
}
