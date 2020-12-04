package s3_array.bai_tap.tim_gia_tri_min;

import java.util.Arrays;
import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap do dai mang(<20)");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("nhap lai(<20)");
            }
        } while (size > 20);
        array = new int[size];
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap pha tu" + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("mang vua nhap" + Arrays.toString(array));
        min(array);


    }

    public static void min(int[] a) {

//        System.out.println("mang vua nhap" + Arrays.toString(array));

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("min la:" + min);
    }


}
