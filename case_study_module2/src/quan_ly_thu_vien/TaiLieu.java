package quan_ly_thu_vien;

public class TaiLieu {
    String maTaiLieu;
    String nhaXuatBan;
    String soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(String soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return
                maTaiLieu  + "," + nhaXuatBan  + ","+ soBanPhatHanh ;
    }
}
