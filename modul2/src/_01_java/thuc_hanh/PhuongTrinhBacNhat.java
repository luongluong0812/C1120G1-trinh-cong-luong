package _01_java.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("phuong trinh co dang ax+b=0,moi ban nhap so");
        Scanner input=new Scanner(System.in);
        System.out.println("nhap a:");
        double a=input.nextDouble();
        System.out.println("nhap b:");
        double b=input.nextDouble();
        if(a!=0){
            double answer=-b/a;
            System.out.println("anser:"+answer);
        } else if(b==0){
            System.out.println("pt vo so nghiem");
        }else {
            System.out.println("pt vo nghiem");
        }
    }
}
