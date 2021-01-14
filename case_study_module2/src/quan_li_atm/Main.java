package quan_li_atm;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String user;
        String pass;
        Boolean check=false;

        do {
            System.out.println("ten dang nhap");
            user=input.nextLine();
            System.out.println("nhap mk");
            pass=input.nextLine();

        }while (user!="luong"&& pass!="luong123");

    }
}
