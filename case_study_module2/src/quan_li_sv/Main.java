package quan_li_sv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose;
        Scanner input=new Scanner(System.in);
        do {
            showMenu();
            System.out.println("you choose?");
            choose=Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
            }
        }while (choose!=6);

    }
    public static void showMenu(){
        System.out.println("1. Add student");
        System.out.println("2. Edit student by id");
        System.out.println("3. Delete student by id");
        System.out.println("4. Sort student by gpa");
        System.out.println("5. Sort student by name");
        System.out.println("5. Show student");
        System.out.println("6.exit");
    }
    public void add(){
        Student student=new Student();
    }
}
