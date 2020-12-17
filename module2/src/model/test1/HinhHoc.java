package model.test1;

public abstract  class HinhHoc {
    private String mau;
    private boolean trong;

    public HinhHoc() {
    }

    public HinhHoc(String mau, boolean trong) {
        this.mau = mau;
        this.trong = trong;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public boolean isTrong() {
        return trong;
    }

    public void setTrong(boolean trong) {
        this.trong = trong;
    }

    @Override
    public String toString() {
        return "HinhHoc{" +
                "mau='" + mau + '\'' +
                ", trong=" + trong +
                '}';
    }

    public abstract double getDienTich();
    public abstract double getChuVi();
}
