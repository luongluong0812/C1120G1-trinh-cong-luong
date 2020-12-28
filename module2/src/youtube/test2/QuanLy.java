package youtube.test2;

import java.util.ArrayList;
import java.util.List;

public class QuanLy extends SanPham {
    public static int demStt;

    public static List<SanPham> danhSach=new ArrayList<>();

    public QuanLy() {
    }

    public QuanLy(int stt, String ten, double gia) {
        super(stt, ten, gia);
    }
    public void hienThi(){
        for (SanPham p:danhSach){
            System.out.println(p.getGia()+" "+p.getStt()+p.getTen());
        }
    }


}
