package s3_array.thuc_hanh.tim_gia_tri_lon_nhat_mang;

import java.util.Arrays;
import java.util.Scanner;

public class LonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("nhap do dai cua mang");
            size=input.nextInt();
            if(size>20){
                System.out.println("ko qua 20");
            }
        }while (size>20);
        array=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("nha phan tu array"+i);
            array[i]=input.nextInt();
        }
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }

        }
        System.out.println("gia tri lon nhat trong mang: "+max);
    }
}
