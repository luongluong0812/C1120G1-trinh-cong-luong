package _quan_li_sach;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String createdAt;
    private String nickName;

    public Book() {
    }

    public Book(String bookName, String createdAt, String nickName) {
        this.bookName = bookName;
        this.createdAt = createdAt;
        this.nickName = nickName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public  void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("nhap ten sach");
        bookName=input.nextLine();
        System.out.println("nhap ngay xuat ban");
        createdAt=input.nextLine();
        System.out.println("nhap ten tac gia");
        nickName=input.nextLine();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
    public  void disPlay(){
        System.out.println(toString());
    }
}
