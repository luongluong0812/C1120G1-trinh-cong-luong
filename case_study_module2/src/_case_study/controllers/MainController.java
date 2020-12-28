package _case_study.controllers;

import _case_study.models.Customer;
import _case_study.models.House;
import _case_study.models.Room;
import _case_study.models.Villa;

import java.io.*;
import java.util.*;

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
            System.out.println("4.Show Information of Customer");
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
                case 4:showInfoCustomer();
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

//    public String inputId() {
//        System.out.println("nhap id:");
//        return scanner.nextLine();
//
//
//    }
//
//    public String inputTenDichVu() {
//        System.out.println("nhap ten dich vu:");
//        return scanner.nextLine();
//    }
//
//    public String inputDienTichSudung() {
//        System.out.println("dien tich su dung:");
//        return scanner.nextLine();
//    }
//
//    public String inputChiPhiThue() {
//        System.out.println("chi phi thue");
//        return scanner.nextLine();
//
//    }
//
//    public String inputSoNguoiToiDa() {
//        System.out.println("so nguoi toi da");
//        return scanner.nextLine();
//    }
//
//    public String inputKieuThue() {
//        System.out.println("kieuThue");
//        return scanner.nextLine();
//    }
//
//    public String inputDichVuMienPhiDiKem() {
//        System.out.println("nhap dich vi mien phi di kem");
//        return scanner.nextLine();
//    }
//
//    public String inputTieuChuanPhong() {
//        System.out.println("nhap tieu chuan phong");
//        return scanner.nextLine();
//    }
//
//    public String inputMoTaTienNghi() {
//        System.out.println("nhap mo ta tien nghi");
//        return scanner.nextLine();
//    }
//
//    public String inputSoTang() {
//        System.out.println("nhap so tang");
//        return scanner.nextLine();
//    }
//
//    public double inputDienTichHoBoi() {
//        System.out.println("nhap dien ticgh ho boi");
//        return scanner.nextDouble();
//    }

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
                    try {
                        FileWriter fileWriter=new FileWriter("src/_case_study/data/Villa.csv",true);
                        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                        for (Villa v:villaList) {
                            bufferedWriter.write(String.valueOf(v));
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.close();
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    House h = new House();
                    h.inputHouse();
                    houseList.add(h);
                    try {
                        FileWriter fileWriter=new FileWriter("src/_case_study/data/House.csv",true);
                        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                        for (House house:houseList) {
                            bufferedWriter.write(String.valueOf(house));
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.close();
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    Room r = new Room();
                    r.inputRoom();
                    roomList.add(r);
                    try {
                        FileWriter fileWriter=new FileWriter("src/_case_study/data/Room.csv",true);
                        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                        for (Room room:roomList) {
                            bufferedWriter.write(String.valueOf(room));
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.close();
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
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
                    try {
                        FileReader fileReader=new FileReader("src/_case_study/data/Villa.csv");
                        BufferedReader bufferedReade=new BufferedReader(fileReader);

                       String line=null;
                       while (true){
                           line= bufferedReade.readLine();
                           if(line==null){
                               break;
                           }
//                          String [] villa=line.split(";");
//                           String id=villa[0];
//                           String tenDichVu=villa[1];
//                           String dienTichSudung=villa[2];
//                           String chiPhiThue=villa[3];
//                           String soNguoiToiDa=villa[4];
//                           String kieuThue=villa[5];
//                           String tieuChuanPhong=villa[6];
//                           String moTaTienNghi=villa[7];
//                           String soTang=villa[8];
//                           String dienTichHoBoi=villa[9];
                           System.out.println(line);



                       }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
//                String [] txt =line.split(";");
//                String name=txt[0];
//                int age=Integer.parseInt(txt[1]);
//                int mark=Integer.parseInt(txt[2]);
//                Student st=new Student(name,age,mark);
//                list.add(st);
//    public Villa(String id, String tenDichVu, String dienTichSudung, String chiPhiThue, String soNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghi, String soTang, double dienTichHoBoi) {
//
//                System.out.println(line);
                case 2:
                    try {
                        FileReader fileReader=new FileReader("src/_case_study/data/House.csv");
                        BufferedReader bufferedReade=new BufferedReader(fileReader);

                        String line="";
                        while (true){
                            line= bufferedReade.readLine();
                            if(line==null){
                                break;
                            }
                            System.out.println(line);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        FileReader fileReader=new FileReader("src/_case_study/data/Room.csv");
                        BufferedReader bufferedReade=new BufferedReader(fileReader);

                        String line="";
                        while (true){
                            line= bufferedReade.readLine();
                            if(line==null){
                                break;
                            }
                            System.out.println(line);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    List<Villa> arr=new ArrayList<>();
                    for (int i=0;i<villaList.size();i++){
                        if(!arr.contains(villaList.get(i).getTenDichVu())){
                            arr.add(villaList.get(i));
                        }
                    }
                    for (Villa v:arr
                         ) {
                        v.showInfo();
                    }

//                    HashSet<Villa> villaHashSet = new HashSet<>(villaList);
//                    for (int i=0;i<villaList.size();i++){
//
//                    }
//                    for (Villa v:villaHashSet){
//                        v.showInfo();
//                    }
//                      List<String> listWithoutDuplicateElements = new ArrayList<String>();
//        for (String element : listWithDuplicateElements) {
//            // Check if element not exist in list, perform add element to list
//            if (!listWithoutDuplicateElements.contains(element)) {
//                listWithoutDuplicateElements.add(element);
//            }
//        }
//
//                    // xóa các phần tử của arrListNumber
//                    arrListNumber.clear();
//
//                    // thêm tất cả các phần tử của arrTemp vào arrListNumber
//                    // lúc này ta sẽ có 1 ArrayList arrListNumber
//                    // không chứa các phần tử trùng nhau
//                    arrListNumber.addAll(arrTemp);

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
    public  void showInfoCustomer(){
        for (Customer cus:customerList
             ) { cus.showInfo();

        }
    }
    public  void addNewBooking(){

    }
}
