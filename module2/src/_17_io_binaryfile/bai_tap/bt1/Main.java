package _17_io_binaryfile.bai_tap.bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("nhap lua chon");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                   inputProduct();
                    break;

                case 2:
                   showList();
                    break;
                case 3:break;
                case 4:
                    System.out.println("good bye");
                    break;
            }
        } while (choose != 4);

    }
    public  static void inputProduct(){
        List<Product> list = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap id");
        String id=scanner.nextLine();
        System.out.println("nhap ten");
        String name=scanner.nextLine();
        System.out.println("hang san xuat");
        String creatAt=scanner.nextLine();
        System.out.println("nhap gia san pham");
        String  price=scanner.nextLine();
        System.out.println("thong tin san pham");
        String description=scanner.nextLine();
        Product product = new Product(id,name,creatAt,price,description);
        list.add(product);
        write(list);
    }

    private static void write(List<Product> productList) {
        File file =new File("src/_17_io_binaryfile/bai_tap/bt1/a.txt");
        if (file.length()>0){
            productList.addAll(read());
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private  static void showList(){
        List<Product> list = read();
        for (Product product: list){
            product.display();
        }
    }
    private static List<Product> read() {
        List<Product> list = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\C0920G1_TRINHCONGLUONG\\module2\\src\\_17_io_binaryfile\\bai_tap\\bt1\\a.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           list = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

        }
        return list;
    }

    static void showMenu() {
        System.out.println("1.add");
        System.out.println("2.display");
        System.out.println("3.search");
        System.out.println("4.exit");
    }
}
