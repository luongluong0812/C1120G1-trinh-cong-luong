package youtube.bai_36.test;

public class LearnMethor {
    public static void main(String[] args) {
        int res=add(7,5);
        int [] numbers ={1,2,3,4,5,6};
//        System.out.println(res);
//
//        float res2=average(numbers);
//        System.out.println(res2);
//        int res3=max(1,5,9);
//        System.out.println(res3);
//         findMax(1,5,8);




    }
    public  static int add(int a,int b){
        int sum=a+b;
        return sum;

    }
    public static float average(int [] arr){
        int sum=0;
        for (int i:arr) {
            sum+=i;

        }
        return (float)sum/arr.length;
    }
    public static int max(int a,int b,int c){
        int max=a;
        if(max<b){
            max=b;
        }
        if (max<c){
            max=c;
        }
        return max;
    }
    public static void findMax(int a,int b,int c){
        int max=a;
        if(max<b){
            max=b;
        }
        if (max<c){
            max=c;
        }
        System.out.println("max la"+max);
    }


}
