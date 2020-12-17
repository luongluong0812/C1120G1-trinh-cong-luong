package _12_collection_framework.bai_tap.bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager extends Product {
    private static int countId;
    private static List<Product> productList = new ArrayList<>();

    public ProductManager() {
    }

    public ProductManager(int id, String name, int price) {
        super(id, name, price);
    }

    public void disPlay() {
        for (Product p : productList) {

            System.out.println("id san pham: " + p.getId());
            System.out.println("name san pham: " + p.getName());
            System.out.println("gia san pham: " + p.getPrice());
            System.out.println("****************");
        }
    }

    private Scanner getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void creatProduct() {
        Product product = new Product();
        product.setId(++countId);
        System.out.println("nhap ten san pham: ");
        product.setName(getScanner().nextLine());
        System.out.println("nhap gia cho san pham: ");
        product.setPrice(getScanner().nextInt());
        productList.add(product);
    }

    public void delete() {
        System.out.println("nhap id can xoa: ");
        int idDelete = getScanner().nextInt();
        boolean check = false;
        for (Product p : productList) {
            if (idDelete == p.getId()) {
                check = true;
                System.out.println("ban co  muon xoa: " + p.getName() + " " + p.getPrice());
                System.out.println("an 1 de xoa\nan 2 de huy");
                int chose = getScanner().nextInt();
                if (chose == 1) {
                    productList.remove(p);
                    System.out.println("da xoa!");

                }
                if (chose == 2) {
                    disPlay();
                }
            }
        }
        if (!check) {
            System.out.println("san pham khong co trong danh sach");
        }
    }

    public void edit() {
        System.out.println("nhap id can sua");
        int idDelete = getScanner().nextInt();
        for (Product p : productList) {
            if (idDelete == p.getId()) {
                System.out.println("nhap ten sp update");
                String name = getScanner().nextLine();
                p.setName(name);
                System.out.println("nhap gia update");
                int gia = getScanner().nextInt();
                p.setPrice(gia);
            }
        }

    }

    public void seach() {
        boolean check = false;
        System.out.println("nhap ten can tim: ");
        String name = getScanner().nextLine();
        for (Product p : productList) {
            if (p.getName().contains(name)) {

                System.out.println("san pham co trong danh sach: ");
                System.out.println("id: " +"  "+ p.getId() + "ten: " + p.getName() +"  "+ "gia: " + p.getPrice());
                check = true;
            } else {
                check = false;
            }

        }
        if (check = false) {
            System.out.println("ko co trong danh sach");
        }
    }

    public void next() {
        System.out.println("0:thoat\n1:them\n2:xoa\n3:hien thi\n4:tim kiem\n5:sua\n6:sap xep");


    }

    public void sortByName() {
        Collections.sort(productList, new NameComparator());
        for (Product p : productList) {
            System.out.println("****************");
            System.out.println("id:" + p.getId());
            System.out.println("name" + p.getName());
            System.out.println("gia" + p.getPrice());

        }

    }
    public void sortByPrice(){
        Collections.sort(productList,new PriceComparator());
        for (Product p : productList) {
            System.out.println("****************");
            System.out.println("id san pham: " + p.getId());
            System.out.println("ten san pham: " + p.getName());
            System.out.println("gia san pham:" + p.getPrice());

        }
    }
}
