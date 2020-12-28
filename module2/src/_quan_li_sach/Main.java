package _quan_li_sach;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chose;
        Scanner input = new Scanner(System.in);
        //quan li danh sach tac gia
        ArrayList<Author> authorList = new ArrayList<>();
        //quan lis danh sach book
        ArrayList<Book> bookList = new ArrayList<>();
        do {
            showMenu();
            chose=input.nextInt();
            switch (chose){
                case 1:Book book=new Book();
                book.input();
                bookList.add(book);
                    break;
                case 2:for (Book b:bookList){
                    b.disPlay();
                }
                    break;
                case 3:
                    System.out.println("nhap so tac gia can them");
                    int n=input.nextInt();
                    for (int i=0;i<n;i++){
                        Author author=new Author();
                        author.input(authorList);
                        authorList.add(author);
                    }
                    break;
                case 4:
                    System.out.println("nhap but dnah");
                    String key=input.nextLine();
                    for (int i = 0; i <bookList.size() ; i++) {
                        if(bookList.get(i).getNickName().equalsIgnoreCase(key)){
                            System.out.println(bookList.get(i).toString());
                        }
                    }
                    break;
                case 5:break;
            }
        }while (chose!=5);




    }

    static void showMenu() {
        System.out.println("1.nhap thong tin sach");
        System.out.println("2.hien tat ca sach ra man hinh");
        System.out.println("3.nhap thong tin tac gia");
        System.out.println("4.tim kiem sach thao but dnah");
        System.out.println("5.thoat");
    }
}
