package quan_ly_thu_vien;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("you choose?");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("nhap thong tin tai lieu");
                    System.out.println("1.sach");
                    System.out.println("2.tap chi");
                    System.out.println("3.bao");
                    System.out.println("4.exit");
                    int choose1 = Integer.parseInt(input.nextLine());
                    switch (choose1) {
                        case 1:
                            List<Sach> sachList = new ArrayList<>();
                            Sach sach = new Sach();
                            sach.input();
                            sachList.add(sach);
                            try {
                                FileWriter fileWriter = new FileWriter("src/quan_ly_thu_vien/sach.csv");
                                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                for (Sach a : sachList) {
                                    bufferedWriter.write(String.valueOf(a));
                                    bufferedWriter.newLine();

                                }
                                bufferedWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 2:
                            List<TapChi> tapChiList = new ArrayList<>();
                            TapChi tapChi = new TapChi();
                            tapChi.input();
                            tapChiList.add(tapChi);
                            try {
                                FileWriter fileWriter = new FileWriter("src/quan_ly_thu_vien/tapchi.csv");
                                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                for (TapChi tc : tapChiList) {
                                    bufferedWriter.write(String.valueOf(tc));
                                    bufferedWriter.newLine();

                                }
                                bufferedWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 3:
                            List<Bao> baoList = new ArrayList<>();
                            Bao bao = new Bao();
                            bao.input();
                            baoList.add(bao);
                            try {
                                FileWriter fileWriter = new FileWriter("src/quan_ly_thu_vien/bao.csv");
                                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                for (Bao b : baoList) {
                                    bufferedWriter.write(String.valueOf(b));
                                    bufferedWriter.newLine();

                                }
                                bufferedWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 4:
                            System.out.println("good bye!");
                            break;
                    }
                case 2:
                    System.out.println("hien thi thong tin tai lieu");
                    System.out.println("1.sach");
                    System.out.println("2.tap chi");
                    System.out.println("3.bao");
                    System.out.println("4.exit");
                    System.out.println("nhap lua chon");
                    int choose2 = Integer.parseInt(input.nextLine());
                    switch (choose2) {
                        case 1:
                            List<Sach> sachList = new ArrayList<>();
                            try {
                                FileReader fileReader = new FileReader("src/quan_ly_thu_vien/sach.csv");
                                BufferedReader bufferedReader = new BufferedReader(fileReader);
                                String line = "";
                                while (true) {
                                    line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    String txt[] = line.split(",");
                                    //    public Sach(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh, String tenTacGia, int soTrang) {
                                    String maTaiLieu = txt[0];
                                    String nhaXuatBan = txt[1];
                                    String soBanPhatHanh = txt[2];
                                    String tenTacGia = txt[3];
                                    int soTrang = Integer.parseInt(txt[4]);
                                    sachList.add(new Sach(maTaiLieu, nhaXuatBan, soBanPhatHanh, tenTacGia, soTrang));
                                }
                                for (Sach sach : sachList) {
                                    System.out.println( sach.toString());
                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 2:
                            List<TapChi> tapChiList = new ArrayList<>();
                            try {
                                FileReader fileReader = new FileReader("src/quan_ly_thu_vien/tapchi.csv");
                                BufferedReader bufferedReader = new BufferedReader(fileReader);
                                String line = "";
                                while (true) {
                                    line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    String txt[] = line.split(",");
                                    //  public TapChi(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh, String soPhatHanh, String thangPhatHanh) {
                                    String maTaiLieu = txt[0];
                                    String nhaXuatBan = txt[1];
                                    String soBanPhatHanh = txt[2];
                                    String soPhatHanh = txt[3];
                                    String thangPhatHanh = txt[4];
                                    tapChiList.add(new TapChi(maTaiLieu, nhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh));
                                }
                                System.out.println("wtf");
                                for (TapChi tc : tapChiList) {
                                    System.out.println(tc.toString());
                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 3: List<Bao> baoList = new ArrayList<>();
                            try {
                                FileReader fileReader = new FileReader("src/quan_ly_thu_vien/bao.csv");
                                BufferedReader bufferedReader = new BufferedReader(fileReader);
                                String line = "";
                                while (true) {
                                    line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    String txt[] = line.split(",");
  //  public Bao(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh, String ngayPhatHanh) {
                                    String maTaiLieu = txt[0];
                                    String nhaXuatBan = txt[1];
                                    String soBanPhatHanh = txt[2];
                                    String ngayPhatHanh = txt[3];

                                    baoList.add(new Bao(maTaiLieu, nhaXuatBan, soBanPhatHanh, ngayPhatHanh));
                                }
                                System.out.println("wtf");
                                for (Bao bao : baoList) {
                                    System.out.println(bao.toString());
                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                    }

                case 3:
                case 4:
            }
        } while (choose != 4);

    }

    static void showMenu() {
        System.out.println("1.nhap thong tin tai lieu");
        System.out.println("2.hien thi thong tin tai lieu");
        System.out.println("3.tim kiem tai lieu");
        System.out.println("4.thoat");

    }
}
