package _case_study.controllers;

import _case_study.models.*;

import java.awt.*;
import java.io.*;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
import java.util.List;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    private static List<Villa> villaList = new ArrayList();
    private static List<House> houseList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();
    private static List<Customer> customerList = new ArrayList<>();
    public static int countId;

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
                case 4:
                    showInfoCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:

                    List<Employee> employeeList = new ArrayList<>();
                    try {
                        FileReader fileReader = new FileReader("src/_case_study/data/Employee.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        Map<Integer, Employee> map = null;
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] arrEmployee = line.split(",");
                            String hoTen = arrEmployee[0];
                            String ngaySinh = arrEmployee[1];
                            String CMND = arrEmployee[2];
                            int sDT = Integer.parseInt(arrEmployee[3]);
                            String email = arrEmployee[4];
                            String trinhDo = arrEmployee[5];
                            String viTri = arrEmployee[6];
                            double luong = Double.parseDouble(arrEmployee[7]);
                            employeeList.add(new Employee(hoTen, ngaySinh, CMND, sDT, email, trinhDo, viTri, luong));

                        }
                        map = new TreeMap<>();
                        for (Employee e : employeeList) {
                            map.put(++countId, e);

                        }
                        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
                            System.out.println(entry.getKey() + ":" + entry.getValue());
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    check = true;
                    break;
            }
        } while (!check);

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
                    try {
                        FileWriter fileWriter = new FileWriter("src/_case_study/data/Villa.csv");
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        for (Villa v : villaList) {
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
                        FileWriter fileWriter = new FileWriter("src/_case_study/data/House.csv");
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        for (House house : houseList) {
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
                        FileWriter fileWriter = new FileWriter("src/_case_study/data/Room.csv");
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        for (Room room : roomList) {
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
                        FileReader fileReader = new FileReader("src/_case_study/data/Villa.csv");
                        BufferedReader bufferedReade = new BufferedReader(fileReader);

                        String line = null;
                        while (true) {
                            line = bufferedReade.readLine();
                            if (line == null) {
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

                case 2:
                    try {
                        FileReader fileReader = new FileReader("src/_case_study/data/House.csv");
                        BufferedReader bufferedReade = new BufferedReader(fileReader);

                        String line = "";
                        while (true) {
                            line = bufferedReade.readLine();
                            if (line == null) {
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
                        FileReader fileReader = new FileReader("src/_case_study/data/Room.csv");
                        BufferedReader bufferedReade = new BufferedReader(fileReader);

                        String line = "";
                        while (true) {
                            line = bufferedReade.readLine();
                            if (line == null) {
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
                    List<Villa> list = new ArrayList<>();
                    try {
                        FileReader fileReader = new FileReader("src/_case_study/data/Villa.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] txt = line.split(",");
                            int id = Integer.parseInt(txt[0]);
                            String tenDichvu = txt[1];
                            double dienTichSuDung = Double.parseDouble(txt[2]);
                            double chiPhiThue = Double.parseDouble(txt[3]);
                            int soNguoiToiDa = Integer.parseInt(txt[4]);
                            String kieuThue = txt[5];
                            String tieuChuanPhong = txt[6];
                            String moTaTienNghi = txt[7];
                            int soTang = Integer.parseInt(txt[8]);
                            double dienTichHoBoi = Double.parseDouble(txt[9]);
                            list.add(new Villa(id, tenDichvu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, moTaTienNghi, soTang, dienTichHoBoi));
                        }
                        TreeSet<Villa> villaTreeSet = new TreeSet<>(list);
                        villaTreeSet.addAll(list);
                        for (Villa v : villaTreeSet) {
                            v.showInfo();
                        }


                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    List<House> houseList = new ArrayList<>();
                    try {
                        FileReader fileReader = new FileReader("src/_case_study/data/House.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] arrRoom = line.split(",");
                            //    public House(int id, String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghi, int soTang) {
                            int id = Integer.parseInt(arrRoom[0]);
                            String tenDichVu = arrRoom[1];
                            double dienTichSudung = Double.parseDouble(arrRoom[2]);
                            double chiPhiThue = Double.parseDouble(arrRoom[3]);
                            int soNguoiToiDa = Integer.parseInt(arrRoom[4]);
                            String kieuThue = arrRoom[5];
                            String tieuChuanPhong = arrRoom[6];
                            String moTaTienNghi = arrRoom[7];
                            int soTang = Integer.parseInt(arrRoom[8]);
                            houseList.add(new House(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, moTaTienNghi, soTang));
                        }
                        TreeSet<House> houseTreeSet = new TreeSet<>(houseList);
                        houseTreeSet.addAll(houseList);
                        for (House house : houseTreeSet) {
                            house.showInfo();
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 6:
                    List<Room> listRoom = new ArrayList<>();
                    FileReader fileReader = null;
                    try {
                        fileReader = new FileReader("src/_case_study/data/Room.csv");
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line = "";

                    while (true) {
                        try {
                            line = bufferedReader.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (line == null) {
                            break;
                        }
                        String[] txt = line.split(",");
                        int id = Integer.parseInt(txt[0]);
                        String tenDichVu = txt[1];
                        double dienTichSudung = Double.parseDouble(txt[2]);
                        double chiPhiThue = Double.parseDouble(txt[3]);
                        int soNguoiToiDa = Integer.parseInt(txt[4]);
                        String kieuThue = txt[5];
                        String dichVuMienPhiDiKem = txt[6];
                        listRoom.add(new Room(id, tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue, dichVuMienPhiDiKem));
                    }
                    TreeSet<Room> roomTreeSet = new TreeSet<>(listRoom);
                    roomTreeSet.addAll(listRoom);
                    for (Room room : roomTreeSet) {
                        room.showInfo();
                    }
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
        try {
            FileWriter fileWriter = new FileWriter("src/_case_study/data/Customer.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer c : customerList) {
                bufferedWriter.write(String.valueOf(c));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showInfoCustomer() {
         List<Customer> customerList=new ArrayList<>();//tao list tam

        try {
            FileReader fileReader = new FileReader("src/_case_study/data/Customer.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split(",");
                String hoVaTen = txt[0];
                String ngaySinh=txt[1];
                String gioiTinh=txt[2];
                String CMND=txt[3];
                String soDT=txt[4];
                String email=txt[5];
                String loaiKH=txt[6];
                String diaChi=txt[7];
                //    public Customer(String hoVaTen, String ngaySinh, String gioiTinh, String CMND, String soDT, String email, String loaiKH, String diaChi) {
                customerList.add(new Customer(hoVaTen,ngaySinh,gioiTinh,CMND,soDT,email,loaiKH,diaChi));

            }
            Collections.sort(customerList, new Comparator<Customer>() {
                @Override
                public int compare(Customer c, Customer c1) {
                    int ten=c.getHoVaTen().compareTo(c1.getHoVaTen());
                    if(ten>0) return 1;
                    if(ten<0) return -1;
                   else  return 0;

                }
            });
            for (Customer c: customerList) {
                c.showInfo();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addNewBooking() {
        List<Customer> customerList=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader("src/_case_study/data/Customer.csv");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line="";
            while (true){
                line=bufferedReader.readLine();
                if(line==null){
                    break;
                }
                String txt[]=line.split(",");
                //(String hoVaTen, String ngaySinh, String gioiTinh, , , , ,) {
                String hoVaTen=txt[0];
                String ngaySinh=txt[1];
                String gioiTinh=txt[2];
                String CMND=txt[3];
                String soDT=txt[4];
                String email=txt[5];
                String loaiKH=txt[6];
                String diaChi=txt[7];
                customerList.add(new Customer(hoVaTen,ngaySinh,gioiTinh,CMND,soDT,email,loaiKH,diaChi));
            }
            Collections.sort(customerList, new Comparator<Customer>() {
                @Override
                public int compare(Customer c1, Customer c2) {
                    return c1.getHoVaTen().compareTo(c2.getHoVaTen());
                }
            });
            Scanner input=new Scanner(System.in);

            int temp=1;
            for (Customer c: customerList) {
                System.out.println(temp+"."+ c.toString());
                temp++;
            }
            System.out.println("you choose");
            int choose=Integer.parseInt(input.nextLine());
            Customer customerBooking=customerList.get(choose-1);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            choose = Integer.parseInt(input.nextLine());
            System.out.println("1.\tBooking Villa");
            System.out.println("2.\tBooking House");
            System.out.println("3.\tBooking Room");
            System.out.println("4.thoat");
            switch (choose) {
                case 1:
                    try {
                        FileReader fileReader = new FileReader("src/_case_study/data/Villa.csv");
                        BufferedReader bufferedReade = new BufferedReader(fileReader);

                        String line = "";
                        while (true) {
                            line = bufferedReade.readLine();
                            if (line == null) {
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

                case 2:
                    try {
                        FileReader fileReader = new FileReader("src/_case_study/data/House.csv");
                        BufferedReader bufferedReade = new BufferedReader(fileReader);

                        String line = "";
                        while (true) {
                            line = bufferedReade.readLine();
                            if (line == null) {
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
                        FileReader fileReader = new FileReader("src/_case_study/data/Room.csv");
                        BufferedReader bufferedReade = new BufferedReader(fileReader);

                        String line = "";
                        while (true) {
                            line = bufferedReade.readLine();
                            if (line == null) {
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
                    System.out.println("good bye!");
                    break;
            }
        } while (choose != 4);

    }


}
