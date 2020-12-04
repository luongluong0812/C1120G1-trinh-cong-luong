package s2_loop.thuc_hanh.check_nguyen_to;

import java.util.Scanner;

public class CheckNguyenTo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhap vao day!");
        int number=input.nextInt();
        boolean check=true;
        for (int i=2;i<number;i++){
            if(number%i==0){
                check=false;
                break;
            } check=true;
        }if(!check){
            System.out.println(number+ "ko la so ngyen to");
        }else System.out.println(number+"la so nguyen to");

    }
}
