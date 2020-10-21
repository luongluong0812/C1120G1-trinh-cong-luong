package bai_tap;

import java.util.Scanner;

public class SoLuongNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ban can bao nhieu so nguyen to??");
        int number = input.nextInt();
        int temp = 2, count = 0;
        boolean check = true;
        while (count <number) {
            for (int i = 2; i < temp; i++) {
                if (temp % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println(temp + "la so nguyen to");
            }
            check = true;
            temp++;
        }

    }

}


