package model.test1;

public class HinhTron extends HinhHoc implements Massge{
    private double banKinh;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    public HinhTron(String mau, boolean trong) {
        super(mau, trong);
    }

    public HinhTron(String mau, boolean trong, double banKinh) {
        super(mau, trong);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double getDienTich() {
        return getBanKinh()*getBanKinh()*3.14;
    }

    @Override
    public double getChuVi() {
        return (getBanKinh()+getBanKinh())*3.14;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}'+"co dien tich la: "+getDienTich()+"chu vi la: "+getChuVi();
    }

    @Override
    public void doSomeThing() {
        System.out.println("day la hinh tron");
    }
}
