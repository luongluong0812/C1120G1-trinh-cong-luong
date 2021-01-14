package _case_study.models;

public class Employee {
    private String hoTen;
    private String ngaySinh;
    private String CMND;
    private int sDT;
    private String email;
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {
    }

    public Employee(String hoTen, String ngaySinh, String CMND, int sDT, String email, String trinhDo, String viTri, double luong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.CMND = CMND;
        this.sDT = sDT;
        this.email = email;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public int getsDT() {
        return sDT;
    }

    public void setsDT(int sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return  hoTen +
                "," + ngaySinh +
                "," + CMND  +
                "," + sDT +
                "," + email +
                "," + trinhDo +
                "," + viTri +
                "," + luong ;
    }
}
