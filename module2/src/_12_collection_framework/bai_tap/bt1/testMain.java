package _12_collection_framework.bai_tap.bt1;

import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner input = new Scanner(System.in);
        productManager.next();

        int value = input.nextInt();
        boolean check = false;
        do {
            switch (value) {
                case 1:
                    productManager.creatProduct();
                    productManager.next();
                    value = input.nextInt();
                    break;
                case 2:
                    productManager.delete();
                    productManager.next();
                    value = input.nextInt();
                    break;
                case 3:
                    productManager.disPlay();
                    productManager.next();
                    value = input.nextInt();
                    break;
                case 4:
                    System.out.println("ban muon tim theo?");
                    System.out.println("1.theo ten:");
                    System.out.println("2:theo gia:");
                    int chose = input.nextInt();
                    switch (chose) {
                        case 1:
                            System.out.println("nhap ten");
                            productManager.seach();
                            productManager.next();
                            value = input.nextInt();
                            break;
                        case 2:
                            System.out.println("nhap gia");
                            productManager.searchPrice();
                            productManager.next();
                            value = input.nextInt();
                            break;

                    }

                case 5:
                    productManager.edit();
                    productManager.next();
                    value = input.nextInt();
                    break;
                case 6:
                    System.out.println("ban muon sap xep theo??");
                    System.out.println("1:theo ten san pham");
                    System.out.println("2:theo gia san pham");
                    int chose6 = input.nextInt();
                    if (chose6 == 1) {
                        productManager.sortByName();
                        productManager.next();
                        value = input.nextInt();
                        break;
                    }
                    if (chose6 == 2) {
                        productManager.sortByPrice();
                        productManager.next();
                        value = input.nextInt();
                        break;
                    }


                case 0:
                    check = true;
                    break;
            }
        } while (!check);

    }
}
