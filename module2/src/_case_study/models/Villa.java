package _case_study.models;

public class Villa extends Services{
    private  String tieuChuanPhong;
    private  String moTaTienNghi;
    private  String soTang;
    private double dienTichHoBoi;

    public Villa() {
    }

    public Villa(String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
    }

    public Villa(String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghi, String soTang, double dienTichHoBoi) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.soTang = soTang;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghi() {
        return moTaTienNghi;
    }

    public void setMoTaTienNghi(String moTaTienNghi) {
        this.moTaTienNghi = moTaTienNghi;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    @Override
    public String showInfor() {
        String str= "id: "+getId()+" tenDichVu: "+getTenDichVu()+" dienTichSudung: "+getDienTichSudung()+
                " chiPhiThue: "+getChiPhiThue()+" soNguoiToiDa: "+getSoNguoiToiDa()+" kieuThue: "+getKieuThue()+
                "dien tich h boi"+getDienTichHoBoi();
        return str;
    }



}
