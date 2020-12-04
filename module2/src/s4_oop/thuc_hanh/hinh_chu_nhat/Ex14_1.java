package s4_oop.thuc_hanh.hinh_chu_nhat;

import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chieu dai");
        double height=scanner.nextDouble();
        System.out.println("nhap chieu rong");
        double width=scanner.nextDouble();
       HInhChuNhat rectangle= new HInhChuNhat();
       String res= rectangle.disPlay();
        System.out.println(res);
    }
}
