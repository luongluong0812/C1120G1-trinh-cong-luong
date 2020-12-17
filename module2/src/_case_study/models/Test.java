package _case_study.models;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Massage m=new Massage();
        m.setDonGia(200);
        m.setGiaTien(150);
        System.out.println(m.showInfor());
        House h=new House();
        h.setId("123456");
        h.setTieuChuanPhong("vip");
        System.out.println(h.showInfor());
        Room r=new Room();
        r.setId("1231");
        r.setTenDichVu("villa");
        System.out.println(r.showInfor());

        //String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghi, String soTang

    }
}
