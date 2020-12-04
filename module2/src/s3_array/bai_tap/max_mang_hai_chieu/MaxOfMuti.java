package s3_array.bai_tap.max_mang_hai_chieu;

import java.util.Scanner;

public class MaxOfMuti {
    public static void main(String[] args) {

        int[][] array = {
                {16, 80, 3, 4, 5},
                {6, 7, 8, 9, 1,10,5,8}
        };
        min(array);
    }
    public static void min(int [][] arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

        }
        System.out.println(min);
    }
}
