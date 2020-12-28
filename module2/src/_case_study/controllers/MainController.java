package _case_study.controllers;

import _case_study.models.Customer;
import _case_study.models.House;
import _case_study.models.Room;
import _case_study.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    private static List<Villa> villaList = new ArrayList();
    private static List<House> houseList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();
    private static List<Customer> customerList = new ArrayList<>();

    public MainController() {
    }

    public void displayMainMenu() {
        boolean check = false;
        do {
            System.out.println("1.Add New Services");
            System.out.println("2.Show Services");
            System.out.println("3.Add New Customer");
            System.out.println("5.Add New Booking");
            System.out.println("6.Show Information of Employee");
            System.out.println("7.Exit");
            Scanner input = new Scanner(System.in);
            int chose = input.nextInt();
            switch (chose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    check = true;
                    break;
            }
        } while (!check);

    }

    public String inputId() {
        System.out.println("nhap id:");
        return scanner.nextLine();


    }

    public String inputTenDichVu() {
        System.out.println("nhap ten dich vu:");
        return scanner.nextLine();
    }

    public String inputDienTichSudung() {
        System.out.println("dien tich su dung:");
        return scanner.nextLine();
    }

    public String inputChiPhiThue() {
        System.out.println("chi phi thue");
        return scanner.nextLine();

    }

    public String inputSoNguoiToiDa() {
        System.out.println("so nguoi toi da");
        return scanner.nextLine();
    }

    public String inputKieuThue() {
        System.out.println("kieuThue");
        return scanner.nextLine();
    }

    public String inputDichVuMienPhiDiKem() {
        System.out.println("nhap dich vi mien phi di kem");
        return scanner.nextLine();
    }

    public String inputTieuChuanPhong() {
        System.out.println("nhap tieu chuan phong");
        return scanner.nextLine();
    }

    public String inputMoTaTienNghi() {
        System.out.println("nhap mo ta tien nghi");
        return scanner.nextLine();
    }

    public String inputSoTang() {
        System.out.println("nhap so tang");
        return scanner.nextLine();
    }

    public double inputDienTichHoBoi() {
        System.out.println("nhap dien ticgh ho boi");
        return scanner.nextDouble();
    }

    public void addNewServices() {

        boolean check = false;
        do {
            System.out.println("1.\tAdd New Villa");
            System.out.println("2.\tAdd New House");
            System.out.println("3.\tAdd New Room");
            System.out.println("4.\tBack to menu");
            System.out.println("5.\tExit");
            Scanner input = new Scanner(System.in);
            int chose = input.nextInt();
            switch (chose) {
                case 1:
                    Villa villa = new Villa();
                    villa.inputVilla();
                    villaList.add(villa);
                    break;
                case 2:
                    House h = new House();
                    h.inputHouse();
                    houseList.add(h);
                    break;
                case 3:
                    Room r = new Room();
                    r.inputRoom();
                    roomList.add(r);
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    check = true;
                    break;
                default:
                    System.out.println("lua chon khong hop le");

            }
        } while (!check);
    }

    public void showServices() {
        boolean check = false;
        do {

            System.out.println("1.\tShow all Villa");
            System.out.println("2.\tShow all House");
            System.out.println("3.\tShow all Room");
            System.out.println("4.\tShow All Name Villa Not Duplicate");
            System.out.println("5.\tShow All Name House Not Duplicate");
            System.out.println("6.\tShow All Name Name Not Duplicate");
            System.out.println("7.\tBack to menu");
            System.out.println("8.\tExit");
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    for (Villa v : villaList) {
                        v.showInfo();
                    }
                    break;
                case 2:
                    for (House h : houseList) {
                        h.showInfo();
                    }
                    break;
                case 3:
                    for (Room r : roomList) {
                        r.showInfo();
                    }
                    break;

                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    check = true;
                    break;
            }


        } while (!check);


    }

    public void addNewCustomer() {
        Customer customer = new Customer();
        customer.inputCustomer();
        customerList.add(customer);
    }
}
