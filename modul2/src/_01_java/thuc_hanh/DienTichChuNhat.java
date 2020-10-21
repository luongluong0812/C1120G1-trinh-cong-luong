package _01_java.thuc_hanh;

import java.util.Scanner;

public class DienTichChuNhat {
    public static void main(String[] args) {
        float chieuDai,chieuRong;
        Scanner scanner= new Scanner(System.in);

        System.out.println("nhap chieu dai canh");
        chieuDai=scanner.nextFloat();
        System.out.println("nhap chieu rong canh");
        chieuRong=scanner.nextFloat();
        float dienTich=chieuDai*chieuRong;
        System.out.println("dien tich hinh chu nhat la:"+dienTich);
    }

}
