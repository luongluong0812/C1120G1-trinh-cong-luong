package _02_loop_array.bai_tap;

import java.util.Scanner;

public class VeCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose = 1;

        do {
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("____choose please___");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    hinhChuNhat();
                    break;
                case 2:
                    tamGiac();
                    break;
                case 3:
                    tamGiacNguoc();
                    break;
            }
        } while (choose != 4);

    }

    public static void hinhChuNhat() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }

    public static void tamGiac() {

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }

    public static void tamGiacNguoc() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }

}
