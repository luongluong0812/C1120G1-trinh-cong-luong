package model.test1;

public class Check {
    public static void main(String[] args) {
        HinhHoc [] hinhHocs=new HinhHoc[3];
        hinhHocs[0]=new HinhChuNhat("red",true,7,7);
        hinhHocs[1]=new HinhTron("BLE",false,5);
        hinhHocs[2]=new HinhVuong("back",false,8);
        for (HinhHoc hinhHoc:hinhHocs){
            System.out.println(hinhHoc);
            System.out.println("************************************************************************************");
            if(hinhHoc instanceof HinhTron){
                Massge massge=(HinhTron)hinhHoc;
                massge.doSomeThing();
            }
        }

    }
}
