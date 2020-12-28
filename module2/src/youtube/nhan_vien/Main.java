package youtube.nhan_vien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list=new ArrayList();
        Scanner input=new Scanner(System.in);
        int choose;
        int luongTB=0;
        int tongLuong=0;
        do {
            showMenu();
            choose=Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:LapTrinhVien lapTrinhVien=new LapTrinhVien();
                lapTrinhVien.nhap();
                lapTrinhVien.tinhLuong();
                list.add(lapTrinhVien);
                break;
                case 2:KiemChungVien kiemChungVien=new KiemChungVien();
                kiemChungVien.nhap();
                kiemChungVien.tinhLuong();

                list.add(kiemChungVien);
                break;
                case 4 :
                    for (Object e:list) {
                        if(e instanceof LapTrinhVien){
                        System.out.println(e.toString());
                    }if(e instanceof KiemChungVien){
                            System.out.println(e.toString());
                        }}
//                    for (int i = 0; i <list.size() ; i++) {
////                        tongLuong +=Integer.parseInt(list.get(i).t)
////                    }
                    break;
                case 3:
                    System.out.println("good bye!");
                    break;
                case 5:
//                    for (int i = 0; i <list.size() ; i++) {
//                        int a=list[i]
//                    }
                    break;
            }

        } while (choose!=3);

    }
    static void showMenu(){
        System.out.println("nhap thong tin nhan vien");
        System.out.println("1.lap trinh vien");
        System.out.println("2.kiem chung vien");
        System.out.println("4.thong tinn nhan vien");
        System.out.println("5.nhan vien thap tien nhat");
    }
}
