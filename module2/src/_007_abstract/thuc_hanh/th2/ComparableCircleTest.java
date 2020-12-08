package _007_abstract.thuc_hanh.th2;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle [] comparableCircle=new ComparableCircle[3];
        comparableCircle[0]=new ComparableCircle(2);
        comparableCircle[1]=new ComparableCircle();
        comparableCircle[2]=new ComparableCircle("red",true,3.6);
        for (ComparableCircle a:comparableCircle){
            System.out.println(a);
        }
        Arrays.sort(comparableCircle);
        System.out.println("sau khi sap xep: ");
        for (ComparableCircle a:comparableCircle){
            System.out.println(a);
        }

    }
}
