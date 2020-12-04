package s3_array.bai_tap.test_xoa_phan_tu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Xoa {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 4, 5};
        Scanner input = new Scanner(System.in);
        System.out.println("nhap k?");
        int k = input.nextInt();
        boolean check = true;
        int index = 0;
        int[] b=new int[5];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                for(int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                a[a.length-1]=0;
                i--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
