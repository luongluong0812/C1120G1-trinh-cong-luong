package thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("nhap size?");
            size=input.nextInt() ;
            if (size>20){
                System.out.println("ko qua 20 phan tu!");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("nhap phan tu"+(i+1));
            array[i]=input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }

}
