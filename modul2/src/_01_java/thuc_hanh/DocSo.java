package _01_java.thuc_hanh;


import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so vao day!");
        int number = input.nextInt();
        if (number >= 0 && number < 10) {
            DonVi(number);
        } else if (number >= 10 && number < 20) {
            String mess;
            switch (number) {
                case 10:
                    mess = "ten";
                    System.out.println(mess);
                    break;
                case 11:
                    mess = "eleven";
                    System.out.println(mess);
                    break;
                case 12:
                    mess = "Twelve";
                    System.out.println(mess);
                    break;
                case 13:
                    mess = "Thirteen";
                    System.out.println(mess);
                    break;
                case 14:
                    mess = "Fourteen";
                    System.out.println(mess);
                    break;
                case 15:
                    mess = "Fifteen ";
                    System.out.println(mess);
                    break;
                case 16:
                    mess = "Sixteen ";
                    System.out.println(mess);
                    break;
                case 17:
                    mess = "Seventeen ";
                    System.out.println(mess);
                    break;

                case 18:
                    mess = "Eighteen ";
                    System.out.println(mess);
                    break;

                case 19:
                    mess = "Nineteen ";
                    System.out.println(mess);
                    break;
                case 20:
                    mess = "Twenty ";
                    System.out.println(mess);
                    break;


            }

        } else if (number > 20 && number < 100) {
            HangChuc(number);
        } else if (number >= 100 && number < 999) {
            HangTram(number);
        } else System.out.println("toi chua hoc");
    }


    public static void DonVi(int number) {
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("for");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;

        }

    }

    public static void HangChuc(int number) {

        int hc = number / 10;
        int dv = number % 10;
        switch (hc) {

            case 2:
                System.out.println("Twenty ");
                break;
            case 3:
                System.out.println("thirty ");
                break;
            case 4:
                System.out.println("forty ");
                break;
            case 5:
                System.out.println("fifty ");
                break;
            case 6:
                System.out.println("sixty  ");
                break;
            case 7:
                System.out.println("seventy ");
                break;
            case 8:
                System.out.println("eighty ");
                break;

            case 9:
                System.out.println("ninety ");
                break;

        }
        DonVi(dv);

    }


    public static void HangTram(int number) {
        int ht = number / 100;
        int hc = (number - ht * 100) / 10;
        int dv = (number - ht * 100 - hc * 10);
        switch (ht) {
            case 1:
                System.out.println("one hunderred and");
                break;
            case 2:
                System.out.println("tow hunderred and");
                break;
            case 3:
                System.out.println("three hunderred and");
                break;
            case 4:
                System.out.println("four hunderred and");
                break;
            case 5:
                System.out.println("five hunderred and");
                break;
            case 6:
                System.out.println("six hunderred and");
                break;
            case 7:
                System.out.println("seven hunderred and");
                break;
            case 8:
                System.out.println("eight hunderred and");
                break;
            case 9:
                System.out.println("nine hunderred and");
                break;
        }
        HangChuc(hc);
        DonVi(dv);


    }


}

