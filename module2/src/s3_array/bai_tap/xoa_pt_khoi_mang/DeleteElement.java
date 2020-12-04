package s3_array.bai_tap.xoa_pt_khoi_mang;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap vao so luong phan tu(<20)");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("ban vua nhao lon hon 20 roi,nhap lai!");
            }
        } while (size > 20);
        //them vao mang
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        //in ra mang vua nhap
        System.out.println("mang ban vua nhap:");
        System.out.println(Arrays.toString(array));
        System.out.println("ban muon xoa gia tri nao");
        int value = scanner.nextInt();
        //tao mang moi


        int[] array2 = new int[size- 1];
        System.out.println("chieu dai mang 2: " + array2.length);
        System.out.println();
        boolean check = false;

        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                for (int j = 0; j < i; j++) {
                    array2[j] = array[j];
                }
                for (int z = i; z < size - 1; z++) {
                    array2[z] = array[z + 1];
                }
                check = true;
               // break;
            }
        }
        if (!check) {
            System.out.println("phan tu nay khong co trong mang" + Arrays.toString(array));
        } else System.out.println(Arrays.toString(array2));


    }
}
