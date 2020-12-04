package s4_oop.bai_tap.ptb2;

import java.util.Scanner;

public class Bt_1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("nhap a");
        double a=input.nextDouble();
        System.out.println("nhap b");
        double b=input.nextDouble();
        System.out.println("nhap c");
        double c=input.nextDouble();
        PTB2 ptb2= new PTB2(a,b,c);
        if(ptb2.delta()<0){
            System.out.println("ptvn");
        } else {
            System.out.println("nghiem 1"+ptb2.getRoot1());
            System.out.println("nghiem 2"+ptb2.getRoot2());
        }

    }
}
