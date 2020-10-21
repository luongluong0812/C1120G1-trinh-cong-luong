import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {
        double soTienGui,laiSuat,soThangGui,laiNhanDuoc=0;
        Scanner input=new Scanner(System.in);
        System.out.println("nhap so tien gui!");
        soTienGui=input.nextDouble();
        System.out.println("ti le lai suat?");
        laiSuat=input.nextDouble();
        System.out.println("so thang gui?");
        soThangGui=input.nextDouble();
        for (int i=0;i<=soThangGui;i++){
            laiNhanDuoc+=soTienGui*(laiSuat/100)/12*soThangGui;
        }
        System.out.println("lai sua nhan duoc la:"+laiNhanDuoc);

    }
}
