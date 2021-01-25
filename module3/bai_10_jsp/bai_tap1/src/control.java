import java.util.Scanner;

public class control {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int chosse;
        showMenu();
        System.out.println("you choose?");
        chosse=Integer.parseInt(input.nextLine());
        switch (chosse){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        }


    }
    static void showMenu(){
        System.out.println("1.Hiển thị danh sách khách hàng");
        System.out.println("2Thêm một khách hàng mới");
        System.out.println("3.Sửa đổi thông tin của khách hàng");
        System.out.println("4.Xoá một khách hàng");
        System.out.println("5.Xem thông tin chi tiết của khách hàng");
    }
}
