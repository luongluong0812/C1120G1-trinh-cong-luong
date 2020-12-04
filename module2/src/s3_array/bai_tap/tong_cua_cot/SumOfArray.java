package s3_array.bai_tap.tong_cua_cot;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int [][] array= {
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6}

        };
        Scanner scanner=new Scanner(System.in);
        System.out.println("muon tinh cot nao");
        int k=scanner.nextInt();
        int sum=0;
        int sum1=0;


        for(int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                sum+=array[k][j+1];

            }
        }
        System.out.println(sum);
    }

}
