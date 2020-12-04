package s2_loop.bai_tap.nguyen_to_be_hon_100;

public class NguyenToBeHon100 {
    public static void main(String[] args) {
        int temp=2;
        boolean check=true;
        while (temp<100){
            for(int i=2;i<temp;i++){
                if(temp%i==0){
                    check=false;
                    break;
                }

            }
            if(check){
                System.out.println(temp+"day la so nguyen to");
            }
            check=true;
            temp++;
        }
    }
}
