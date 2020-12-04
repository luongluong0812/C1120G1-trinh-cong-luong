package s1_introduction_to_java.test;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("nhap diemn hs vao day");
        double diem= input.nextDouble();
        if(diem>8.0){
            System.out.println("hs gioi");
        } else if(diem>7.5){
            System.out.println("hs kha");
        } else if(diem>5.0){
            System.out.println("tb");
        } else System.out.println("kem");

    }


}
