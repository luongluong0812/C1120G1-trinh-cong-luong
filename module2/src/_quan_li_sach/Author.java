package _quan_li_sach;

import java.util.ArrayList;
import java.util.Scanner;

public class Author {

    private String name;
    private int old;
    private String nickName;
    private String birthDay;
    private String address;

    public Author() {
    }

    public Author(String name, int old, String nickName, String birthDay, String address) {
        this.name = name;
        this.old = old;
        this.nickName = nickName;
        this.birthDay = birthDay;
        this.address = address;
    }

    public void disPlay() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", nickName='" + nickName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getNickName() {
        return nickName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void input(ArrayList<Author> authorList) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ten tac gia");
        name = input.nextLine();
        System.out.println("nhap tuoi");
        old =Integer.parseInt(input.nextLine());
        System.out.println("nhap ngay sinh");
        birthDay = input.nextLine();
        System.out.println("nhap dia chi");
        address = input.nextLine();
        System.out.println("nhap but dnah");
        while (true) {
            boolean check = false;

            nickName = input.nextLine();
            for (int i = 0; i < authorList.size(); i++) {
                if (authorList.get(i).getNickName().contains(nickName)) {
                    check = true;
                }
            }
            if (check) {
                System.out.println("da cos tren he thong");
            } else break;
        }



    }
}
