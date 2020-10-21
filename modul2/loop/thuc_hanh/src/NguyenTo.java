import java.util.Scanner;

public class NguyenTo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhap so vao day!");
        int number=input.nextInt();
        boolean check=true;
        for(int i=2;i<number;i++){
            if(number%2==0){
                check=false;
                break;
            }
        }if(check){
            System.out.println(number+"la so nguyen to");
        } else System.out.println(number+"ko la so nguyen to");

    }
}
