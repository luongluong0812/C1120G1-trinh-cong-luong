package _case_study.models;

public class Massage extends DichVuDiKem {
    public Massage() {
    }

    public Massage(String tenDichVu, double donGia, double giaTien) {
        super(tenDichVu, donGia, giaTien);
    }


    public String showInfor() {
        return "Massage{+ "+getDonGia()+"gia tien: "+getGiaTien()+"}";
    }
}
