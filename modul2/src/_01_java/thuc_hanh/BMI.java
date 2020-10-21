package _01_java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao chieu cao(m):");
        double height=scanner.nextDouble();
        System.out.println("nhap can nang(kg):");
        double weight=scanner.nextDouble();
        double bmi=weight/(height*height);
        if(bmi<18.5){
            System.out.println("under");
        } else if(bmi>=18.5 ||bmi<25.5){
            System.out.println("normal");
        }else System.out.println("overweight");
    }
}
