package s4_oop.thuc_hanh.hinh_tron;

public class HinhTron {
    public final double PI=3.141592;
    public double banKinh;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    public double dienTich(double banKinh){
        return banKinh*banKinh*PI;
    }
    public double chuVi(double banKinh){
        return 2*banKinh*PI;
    }
    public void hienThi(){
        System.out.println("hinh tron co ban kinh vua nhap co:");
    }
}
