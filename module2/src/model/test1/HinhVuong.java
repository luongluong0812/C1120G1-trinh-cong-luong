package model.test1;

public class HinhVuong extends HinhHoc {
    private double doDai;

    public HinhVuong(double doDai) {
        this.doDai = doDai;
    }

    public HinhVuong(String mau, boolean trong, double doDai) {
        super(mau, trong);
        this.doDai = doDai;
    }

    public double getDoDai() {
        return doDai;
    }

    public void setDoDai(double doDai) {
        this.doDai = doDai;
    }

    @Override
    public double getDienTich() {
        return getDoDai()*getDoDai();
    }

    @Override
    public double getChuVi() {
        return getDoDai()*4;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "doDai=" + doDai +
                '}'+"cos dien tich la: "+getDienTich();
    }
}
