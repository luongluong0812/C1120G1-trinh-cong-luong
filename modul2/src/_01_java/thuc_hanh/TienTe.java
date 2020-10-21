package _01_java.thuc_hanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        int USD,VND;
        Scanner input=new Scanner(System.in);
        System.out.println("nhap so tien can doi(USD):");
        USD=input.nextInt();
        VND=USD*23000;
        System.out.println("so tien doi qua VNd la: "+VND);


    }

}
