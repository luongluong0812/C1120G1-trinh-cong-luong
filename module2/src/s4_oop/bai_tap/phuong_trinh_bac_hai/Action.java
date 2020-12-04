package s4_oop.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class Action {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap he so a");
        a=scanner.nextDouble();
        System.out.println("nhap he so b");
        b=scanner.nextDouble();
        System.out.println("nhap he so c");
        c=scanner.nextDouble();
        Equation ptb2=new Equation(a,b,c);
        System.out.println(ptb2.getDiscriminant());
        System.out.println("phuong trinh co nghiem la: "+ptb2.getRoot1()+"va  "+ptb2.getRoot2());

    }
}
