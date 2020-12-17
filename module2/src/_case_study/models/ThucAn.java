package _case_study.models;

public class ThucAn extends DichVuDiKem {
    public ThucAn() {
    }

    public ThucAn(String tenDichVu, double donGia, double giaTien) {
        super(tenDichVu, donGia, giaTien);
    }

    @Override
    public String toString() {
        return "ThucAn{}";
    }
}
