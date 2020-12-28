package youtube.test2;

public class SanPham {
    private int stt;
    private String ten;
    private double gia;

    public SanPham() {
    }

    public SanPham(int stt, String ten, double gia) {
        this.stt = stt;
        this.ten = ten;
        this.gia = gia;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
