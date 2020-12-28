package youtube.sv_gv;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File myObj = new File("D:\\C0920G1_TRINHCONGLUONG\\test.txt");
        if(myObj.createNewFile()){
            System.out.println("da tao");
        }else System.out.println("ko tao dc");

}}

