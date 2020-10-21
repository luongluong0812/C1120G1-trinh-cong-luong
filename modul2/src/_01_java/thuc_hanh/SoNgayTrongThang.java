package _01_java.thuc_hanh;

import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        String day;
        Scanner input=new Scanner(System.in);
        System.out.println("nhap thang ban muon kiem tra!");
        int month=input.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day="31";
                break;
            case 2:
                day="28-29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day="30";
                break;
            default:
                day="";

        }
        if (day!=""){
            System.out.printf("so ngay trong thang: "+month+"la: "+day);
        } else System.out.println("khong hop le");
    }
}

