package _case_study.controllers;

import java.util.Scanner;

public class MainController {
    public void displayMainMenu(){
        boolean check=false;
        do {
            System.out.println("1.Add New Services");
            System.out.println("2.Show Services");
            System.out.println("3.Add New Customer");
            System.out.println("5.Add New Booking");
            System.out.println("6.Show Information of Employee");
            System.out.println("7.Exit");
            Scanner input=new Scanner(System.in);
            int chose=input.nextInt();
            switch (chose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:check=true;
                    break;
            }
        } while (!check);

    }
    public  void addNewServices(){
        boolean check=false;
       do {
           System.out.println("1.\tAdd New Villa");
           System.out.println("2.\tAdd New House");
           System.out.println("3.\tAdd New Room");
           System.out.println("4.\tBack to menu");
           System.out.println("5.\tExit");
           Scanner input=new Scanner(System.in);
           int chose=input.nextInt();
           switch (chose){
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5: check=true;
                   break;

           }
       } while (!check);
    }

}
