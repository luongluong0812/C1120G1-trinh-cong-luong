package s3_array.thuc_hanh.tim_gia_tri_lon_nhat_mang;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("nhap so phan tu mang nho hon 20");
            size=scanner.nextInt();
            if(size>20){
                System.out.println("so phan tu phai nho hon 20");
            }
        }while (size>20);
        array=new int[size];
        for (int i=0;i<array.length;i++){
            System.out.println("nhap phan tu thu: "+(i+1)+" cua mang");
            array[i]=scanner.nextInt();
        }
        //in ra dnah sach mang
        for(int i:array){
            System.out.println(i);
        }
        //tim max
        int max =array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("gia tri max la :"+max);

    }


}
