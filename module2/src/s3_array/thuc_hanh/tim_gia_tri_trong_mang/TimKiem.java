package s3_array.thuc_hanh.tim_gia_tri_trong_mang;

import java.util.Scanner;

public class TimKiem {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten can tim");
        String input=scanner.nextLine();
        boolean check=true;
        for (int i=0;i<students.length;i++){
            if((students[i].equals(input))){
                System.out.println("hoc sinh can tim:"+students[i]+"o vi tri:"+(i+1));
                check=false;
                break;

            }
        }
        if (check){
            System.out.println("hs nay ko co trong dnah sach");
        }
    }
}
