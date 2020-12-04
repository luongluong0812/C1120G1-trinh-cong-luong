package s4_oop.thuc_hanh.hinh_tron;

import java.util.Scanner;

public class Ex15_1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap ban kinh");
        double bk=scanner.nextDouble();
        HinhTron hinhtron=new HinhTron();
        hinhtron.hienThi();
        System.out.println("chu vi la: "+hinhtron.chuVi(bk));

    }
}
