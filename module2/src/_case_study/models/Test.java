package _case_study.models;

import _case_study.controllers.MainController;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        boolean check = false;

        displayMenu(mainController, check);

    }

    private static void displayMenu(MainController mainController, boolean check) {
        do {
            Scanner scanner = new Scanner(System.in);


            System.out.println("lua chon");
            System.out.println("1.them");
            System.out.println("2.hien thi");
            System.out.println("3:thoat");
            System.out.println("nhap lua chon");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    mainController.addNewServices();
                    break;
                case 2:
                    mainController.showServices();
                    break;
                case 3:
                    check = true;
                    break;
            }
        } while (!check);
    }
}
