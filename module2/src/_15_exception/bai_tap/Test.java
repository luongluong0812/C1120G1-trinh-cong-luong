package _15_exception.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input=new Scanner(System.in);
        System.out.println("nhap 3 canh tam giac");
        System.out.println("canh 1");
        double a=input.nextDouble();
        System.out.println("nhap canh 2");
        double b=input.nextDouble();
        System.out.println("nhap canh 3");
        double c=input.nextDouble();
        Triangle triangle=new Triangle(a,b,c);

    }
}
