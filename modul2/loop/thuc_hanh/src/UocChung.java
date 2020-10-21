import java.util.Scanner;

public class UocChung {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("nhap so a!");
        a=input.nextInt();
        System.out.println("nhap so b!");
        b=input.nextInt();
        int uC=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                uC=i;
            }

        }
        System.out.println(uC);

    }
}
