package _02_loop_array.bai_tap;

import java.util.Scanner;

public class NguyenToBeHon100 {
    public static void main(String[] args) {
        int temp=2;
        boolean check=true;
        for(int i=2;i<temp;i++){
            if(temp%2==0){
                check=false;
                break;
            }
        }
    }
}
