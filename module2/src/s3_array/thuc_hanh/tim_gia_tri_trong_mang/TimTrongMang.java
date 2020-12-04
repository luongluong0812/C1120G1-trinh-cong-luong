package s3_array.thuc_hanh.tim_gia_tri_trong_mang;

import java.util.Scanner;

public class TimTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input= new Scanner(System.in);
        System.out.println("nhap ten can tim!");
        String ten=input.nextLine();
        boolean check=false;
        for(int i =0;i<students.length;i++){
            if(students[i].equals(ten)){
                System.out.println("o vi tri"+(i+1));
                check=true;
                break;
            }

        }if(!check){
            System.out.println("ko thay ten ban nay!");
        }
    }
}
