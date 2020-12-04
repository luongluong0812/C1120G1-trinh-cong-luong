package s3_array.bai_tap.them_vao_mang;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        int k;
        int value;
        System.out.println("ban muon them gia tri nao");
        value = scanner.nextInt();

        do {

            System.out.println("ban muon them vao vi tri thu may");
            k = scanner.nextInt();
            if (k > array.length + 1) {
                System.out.println("ko chen dc");
            }

        } while (k > array.length + 1);

        int[] array2 = new int[array.length + 1];
        System.out.println("mang moi bay gio dai : " + array2.length);

        for (int i = 0; i < array2.length; i++) {
            if(i<k){
                array2[i]=array[i];

            }else if(i==k) {
                array2[i]=value;
            }else if (i>k){
                array2[i]=array[i-1];
            }

        }
        System.out.println(Arrays.toString(array2));
    }
}
