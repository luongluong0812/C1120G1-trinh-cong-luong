package _case_study.models;

public class Room extends Services{
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
    }

    @Override
    public String showInfor() {
        String str= "id: "+getId()+" tenDichVu: "+getTenDichVu()+" dienTichSudung: "+getDienTichSudung()+
                " chiPhiThue: "+getChiPhiThue()+" soNguoiToiDa: "+getSoNguoiToiDa()+" kieuThue: "+getKieuThue()+
                "";
        return str;
    }

    public Room(String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }


}
