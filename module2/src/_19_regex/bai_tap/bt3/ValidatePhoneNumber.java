package _19_regex.bai_tap.bt3;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regex="[0-9]{2,2}\\-[0]+[0-9]{9,9}";
        Scanner input=new Scanner(System.in);
        System.out.println("nhap sdt");
        String number=input.nextLine();
        boolean res=number.matches(regex);
        if(res==true){
            System.out.println("dung");
        }
        else System.out.println("sai");

    }
}
