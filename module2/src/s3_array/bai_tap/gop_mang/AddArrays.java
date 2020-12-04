package s3_array.bai_tap.gop_mang;

import java.util.Arrays;
import java.util.Scanner;

public class AddArrays {
    public static void main(String[] args) {
        int size;
        int size2;
        int[] array;
        int[] array2;
        int[] res;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("nhap do dai mang(<20)");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("nhap lai(<20)");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu" + (i + 1));
            array[i] = scanner.nextInt();
        }
        do {
            System.out.println("nhap do dai mang thu 2(<20)");
            size2 = scanner.nextInt();
            if (size2 > 20) {
                System.out.println("nhap lai(<20)");
            }
        } while (size2 > 20);
        array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("nhap phan tu thu" + (i + 1));
            array2[i] = scanner.nextInt();
        }
        //in mang 1
        System.out.println("mang 1" + Arrays.toString(array));
        //in mang 2
        System.out.println("mang2" + Arrays.toString(array));
        //tao mang ket qua
        res = new int[size + size2];
        //them gia tri mang1 sang mang ket qua
        for (int i = 0; i < array.length; i++) {
            res[i] = array[i];
        }
        int i = 0;
        for (int k = array.length; k < res.length; k++) {
            res[k] = array2[i];
            i++;
        }
        System.out.println(Arrays.toString(res));


    }

}
