package _19_regex.bai_tap.bt2;

import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regex="^(A|C|P)+[0-9]{4,}(G|H|I|K|L|M)+$";
        System.out.println("nhap ma lop");
        String id= scanner.nextLine();
        boolean res=(id.matches(regex));
        if(res=false){
            System.out.println("nhap sai,nhap lai");

        }else System.out.println("ok!");

    }

}
