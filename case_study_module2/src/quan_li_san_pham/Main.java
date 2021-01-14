package quan_li_san_pham;

import java.io.*;
import java.util.*;

public class Main {
    static int countId = 0;

    public static void main(String[] args) throws IOException {

        Boolean check = false;
        Scanner input = new Scanner(System.in);

        do {
            showMenu();
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("1.them san pham nhap khau");
                    System.out.println("2.them san pham xuat khau");
                    System.out.println("3.quay lai");
                    System.out.println("lua chon chua ban");
                    int choose1 = Integer.parseInt(input.nextLine());
                    switch (choose1) {
                        case 1:
                            List<SanPhamNhapKhau> sanPhamNhapKhauList = new ArrayList<>();
                            SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau();
                            sanPhamNhapKhau.setId(++countId);
                            sanPhamNhapKhau.input();
                            sanPhamNhapKhauList.add(sanPhamNhapKhau);
                            try {
                                FileWriter fileWriter = new FileWriter("src/quan_li_san_pham/product.csv", true);
                                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                for (SanPhamNhapKhau spnk : sanPhamNhapKhauList) {
                                    bufferedWriter.write(String.valueOf(spnk));
                                    bufferedWriter.newLine();
                                }
                                bufferedWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 2:
                            List<SanPhamXuatKhau> sanPhamXuatKhauArrayList = new ArrayList<>();
                            SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau();
                            sanPhamXuatKhau.setId(++countId);
                            sanPhamXuatKhau.inputXK();
                            sanPhamXuatKhauArrayList.add(sanPhamXuatKhau);
                            try {
                                FileWriter fileWriter = new FileWriter("src/quan_li_san_pham/product.csv", true);
                                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                for (SanPhamXuatKhau spxk : sanPhamXuatKhauArrayList) {
                                    bufferedWriter.write(String.valueOf(spxk));
                                    bufferedWriter.newLine();
                                }
                                bufferedWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    List<SanPhamNhapKhau> sanPhamNhapKhauList = new ArrayList<>();
                    List<SanPhamXuatKhau> sanPhamXuatKhauList = new ArrayList<>();

                    System.out.println("nhap ma san pham can xoa");
                    String maCanXoa = input.nextLine();
                    try {
                        FileReader fileReader = new FileReader("src/quan_li_san_pham/product.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] txt = line.split(",");
                            if (txt.length == 8) {
                                int id = Integer.parseInt(txt[0]);
                                String maSanPham = txt[1];
                                String tenSanPham = txt[2];
                                double giaBan = Double.parseDouble(txt[3]);
                                int soLuong = Integer.parseInt(txt[4]);
                                String nhaSanXuat = txt[5];
                                double giaXuatKhau = Double.parseDouble(txt[6]);
                                String quocGiaNhapSanPham = txt[7];
                                sanPhamXuatKhauList.add(new SanPhamXuatKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaXuatKhau, quocGiaNhapSanPham));
                            }
                             if  (txt.length == 9) {
                                int id = Integer.parseInt(txt[0]);
                                String maSanPham = txt[1];
                                String tenSanPham = txt[2];
                                double giaBan = Double.parseDouble(txt[3]);
                                int soLuong = Integer.parseInt(txt[4]);
                                String nhaSanXuat = txt[5];
                                double giaNhapKhau = Double.parseDouble(txt[6]);
                                String tinhThanhNhapKhau = txt[7];
                                double thueNhapkhau = Double.parseDouble(txt[8]);
                                sanPhamNhapKhauList.add(new SanPhamNhapKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat,
                                        giaNhapKhau, tinhThanhNhapKhau, thueNhapkhau));
                            }
                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Boolean check6=false;
                    for (int i = 0; i < sanPhamNhapKhauList.size() && i < sanPhamXuatKhauList.size(); i++) {
                        if (sanPhamNhapKhauList.get(i).getMaSanPham().equalsIgnoreCase(maCanXoa)) {
                            System.out.println("1.xoa");
                            System.out.println("2.huy");
                            System.err.println("nhap lua chon");
                            int choose2 = Integer.parseInt(input.nextLine());
                            switch (choose2) {
                                case 1:
                                    sanPhamNhapKhauList.remove(sanPhamNhapKhauList.get(i));
                                    System.err.println("da xoa");
                                    break;
                                case 2:
                                    break;
                            }

                        }
                        if (sanPhamXuatKhauList.get(i).getMaSanPham().equalsIgnoreCase(maCanXoa)) {
                            System.out.println("1.xoa");
                            System.out.println("2.huy");
                            System.out.println("nhap lua chon");
                            int choose3 = Integer.parseInt(input.nextLine());

                            switch (choose3) {
                                case 1:
                                    sanPhamXuatKhauList.remove(sanPhamXuatKhauList.get(i));
                                    System.err.println("da xoa!");
                                    break;
                                case 2:
                                    break;
                            }

                        }
                    }
//                    System.out.println(sanPhamNhapKhauList.toString());
                    FileWriter fileWriter = null;
                    try {
                        fileWriter = new FileWriter("src/quan_li_san_pham/product.csv");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    for (int i = 0; i < sanPhamNhapKhauList.size() && i < sanPhamXuatKhauList.size(); i++) {
                        bufferedWriter.write(sanPhamNhapKhauList.get(i).toString());
                        bufferedWriter.newLine();
                        bufferedWriter.write(sanPhamXuatKhauList.get(i).toString());
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.close();


                    break;
                case 3:
                    System.out.println("tim kiem");
                    System.out.println("1.ten");
                    System.out.println("2.id");
                    System.out.println("3.thoat");
                    int choose4 = Integer.parseInt(input.nextLine());
                    switch (choose4) {
                        case 1:
                            List<SanPhamNhapKhau> sanPhamNhapKhauList3 = new ArrayList<>();
                            List<SanPhamXuatKhau> sanPhamXuatKhauList3 = new ArrayList<>();

                            System.out.println("nhap ma san pham can tim");
                            String maCantim = input.nextLine();
                            try {
                                FileReader fileReader = new FileReader("src/quan_li_san_pham/product.csv");
                                BufferedReader bufferedReader = new BufferedReader(fileReader);
                                String line = "";
                                while (true) {
                                    line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    String[] txt = line.split(",");
                                    if (txt.length == 8) {
                                        int id = Integer.parseInt(txt[0]);
                                        String maSanPham = txt[1];
                                        String tenSanPham = txt[2];
                                        double giaBan = Double.parseDouble(txt[3]);
                                        int soLuong = Integer.parseInt(txt[4]);
                                        String nhaSanXuat = txt[5];
                                        double giaXuatKhau = Double.parseDouble(txt[6]);
                                        String quocGiaNhapSanPham = txt[7];
                                        sanPhamXuatKhauList3.add(new SanPhamXuatKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaXuatKhau, quocGiaNhapSanPham));
                                    }
                                    if (txt.length == 9) {
                                        int id = Integer.parseInt(txt[0]);
                                        String maSanPham = txt[1];
                                        String tenSanPham = txt[2];
                                        double giaBan = Double.parseDouble(txt[3]);
                                        int soLuong = Integer.parseInt(txt[4]);
                                        String nhaSanXuat = txt[5];
                                        double giaNhapKhau = Double.parseDouble(txt[6]);
                                        String tinhThanhNhapKhau = txt[7];
                                        double thueNhapkhau = Double.parseDouble(txt[8]);
                                        sanPhamNhapKhauList3.add(new SanPhamNhapKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat,
                                                giaNhapKhau, tinhThanhNhapKhau, thueNhapkhau));
                                    }
                                }

                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            boolean check3 =false;
                            for (int i = 0; i < sanPhamNhapKhauList3.size() && i < sanPhamXuatKhauList3.size(); i++) {

                                if (sanPhamNhapKhauList3.get(i).getMaSanPham().equalsIgnoreCase(maCantim)
                                ) {
                                    System.out.println(sanPhamNhapKhauList3.get(i).toString());
                                    check3 = true;
                                }
                                if (sanPhamXuatKhauList3.get(i).getMaSanPham().equalsIgnoreCase(maCantim)) {
                                    System.out.println(sanPhamXuatKhauList3.get(i).toString());
                                    check3 = true;
                                } else check3=false;
                            }
                            if (check3 == false) {
                                System.err.println("ko co trong danh sach****");

                            }
                            break;
                        case 2:
                            List<SanPhamNhapKhau> sanPhamNhapKhauList4 = new ArrayList<>();
                            List<SanPhamXuatKhau> sanPhamXuatKhauList4 = new ArrayList<>();

                            System.out.println("nhap ma san pham can tim");
                            String tenCantim = input.nextLine();
                            try {
                                FileReader fileReader = new FileReader("src/quan_li_san_pham/product.csv");
                                BufferedReader bufferedReader = new BufferedReader(fileReader);
                                String line = "";
                                while (true) {
                                    line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    String[] txt = line.split(",");
                                    if (txt.length == 8) {
                                        int id = Integer.parseInt(txt[0]);
                                        String maSanPham = txt[1];
                                        String tenSanPham = txt[2];
                                        double giaBan = Double.parseDouble(txt[3]);
                                        int soLuong = Integer.parseInt(txt[4]);
                                        String nhaSanXuat = txt[5];
                                        double giaXuatKhau = Double.parseDouble(txt[6]);
                                        String quocGiaNhapSanPham = txt[7];
                                        sanPhamXuatKhauList4.add(new SanPhamXuatKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaXuatKhau, quocGiaNhapSanPham));
                                    }
                                    if (txt.length == 9) {
                                        int id = Integer.parseInt(txt[0]);
                                        String maSanPham = txt[1];
                                        String tenSanPham = txt[2];
                                        double giaBan = Double.parseDouble(txt[3]);
                                        int soLuong = Integer.parseInt(txt[4]);
                                        String nhaSanXuat = txt[5];
                                        double giaNhapKhau = Double.parseDouble(txt[6]);
                                        String tinhThanhNhapKhau = txt[7];
                                        double thueNhapkhau = Double.parseDouble(txt[8]);
                                        sanPhamNhapKhauList4.add(new SanPhamNhapKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat,
                                                giaNhapKhau, tinhThanhNhapKhau, thueNhapkhau));
                                    }
                                }

                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            boolean check4 = false;
                            for (int i = 0; i < sanPhamNhapKhauList4.size() && i < sanPhamXuatKhauList4.size(); i++) {
                                if (sanPhamNhapKhauList4.get(i).getTenSanPham().equalsIgnoreCase(tenCantim)
                                ) {
                                    System.out.println(sanPhamNhapKhauList4.get(i).toString());
                                    check4 = true;
                                }
                                if (sanPhamXuatKhauList4.get(i).getTenSanPham().equalsIgnoreCase(tenCantim)) {
                                    System.out.println(sanPhamXuatKhauList4.get(i).toString());
                                    check4 = true;
                                } else check4 = false;
                            }
                            if (check4 == false) {
                                System.out.println("ko co trong danh sach");
                            }

                            break;
                        case 3:
                            break;
                    }
                    break;
                case 4:List<SanPham> list=new ArrayList();
                    ReadFile readFile = new ReadFile().invoke();
                    List<SanPhamNhapKhau> sanPhamNhapKhauList4 = readFile.getSanPhamNhapKhauList4();
                    List<SanPhamXuatKhau> sanPhamXuatKhauList4 = readFile.getSanPhamXuatKhauList4();
                    System.out.println("san pham xuat khau");
//                    for (SanPhamXuatKhau spxk : sanPhamXuatKhauList4) {
//                        System.out.println(spxk.toString());
//                    }
//                    System.out.println("san pham nhap khau");
//                    for (SanPhamNhapKhau spnk : sanPhamNhapKhauList4) {
//                        System.out.println(spnk.toString());
//                    }
//                    break;
                    list.add((SanPham)sanPhamNhapKhauList4);
                    list.add((SanPham)sanPhamXuatKhauList4);
                    Collections.sort(list, new Comparator<SanPham>() {

                        @Override
                        public int compare(SanPham s, SanPham s1) {
                            return s.getId()-s1.getId();
                        }
                    });
                    for (int i = 0; i <list.size() ; i++) {
                        System.out.println(list.get(i).toString());
                    }
                    break;
                case 5:
                    check = true;
                    System.out.println("tam biet!");
                    break;
            }

        } while (!check);

    }

    public static void showMenu() {
        System.out.println("-----MENU------");
        System.out.println("1.them");
        System.out.println("2.xoa");
        System.out.println("3.tim kiem");
        System.out.println("4.xem");
        System.out.println("5.thoat");
        System.out.println("nhap lua chon cua ban??");
    }

    private static class ReadFile {
        private List<SanPhamNhapKhau> sanPhamNhapKhauList4;
        private List<SanPhamXuatKhau> sanPhamXuatKhauList4;

        public List<SanPhamNhapKhau> getSanPhamNhapKhauList4() {
            return sanPhamNhapKhauList4;
        }

        public List<SanPhamXuatKhau> getSanPhamXuatKhauList4() {
            return sanPhamXuatKhauList4;
        }

        public ReadFile invoke() {
            sanPhamNhapKhauList4 = new ArrayList<>();
            sanPhamXuatKhauList4 = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader("src/quan_li_san_pham/product.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = "";
                while (true) {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] txt = line.split(",");
                    if (txt.length == 8) {
                        int id = Integer.parseInt(txt[0]);
                        String maSanPham = txt[1];
                        String tenSanPham = txt[2];
                        double giaBan = Double.parseDouble(txt[3]);
                        int soLuong = Integer.parseInt(txt[4]);
                        String nhaSanXuat = txt[5];
                        double giaXuatKhau = Double.parseDouble(txt[6]);
                        String quocGiaNhapSanPham = txt[7];
                        sanPhamXuatKhauList4.add(new SanPhamXuatKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaXuatKhau, quocGiaNhapSanPham));
                    }
                    if (txt.length == 9) {
                        int id = Integer.parseInt(txt[0]);
                        String maSanPham = txt[1];
                        String tenSanPham = txt[2];
                        double giaBan = Double.parseDouble(txt[3]);
                        int soLuong = Integer.parseInt(txt[4]);
                        String nhaSanXuat = txt[5];
                        double giaNhapKhau = Double.parseDouble(txt[6]);
                        String tinhThanhNhapKhau = txt[7];
                        sanPhamNhapKhauList4.add(new SanPhamNhapKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat,
                                giaNhapKhau, tinhThanhNhapKhau, Double.parseDouble(txt[8])));
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return this;
        }
    }
}
