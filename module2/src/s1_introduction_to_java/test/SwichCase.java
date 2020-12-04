package s1_introduction_to_java.test;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("ban chon so may? \n an 0 de thoat");
        int choose= input.nextInt();

          switch (choose){
              case 1:
                  System.out.println("ban chon so 1");
                  break;
              case 2:
                  System.out.println("ban chon so 2");
                  break;
              case 3:
                  System.out.println("ban chon so 3");
                  break;
              default:
                  System.out.println("ban chon sai");
          }


    }
}
