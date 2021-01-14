package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Boolean check=false;
        String regex="^[1-9]+";
        do {
            System.out.println("gia ban");
            String giaBan=input.nextLine();
             check=giaBan.matches(regex);

        } while (!check);
    }
}
