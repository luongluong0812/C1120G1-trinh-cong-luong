package _007_abstract.thuc_hanh.th3;

import _007_abstract.thuc_hanh.th2.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle [] circles=new Circle[3];
        circles[1]=new Circle(1);
        circles[2]=new Circle("red",true,12);
        circles[0]=new Circle(4);
        for (Circle circle:circles){
            System.out.println(circle);
        }
        CircleComparator circleComparator=new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("sau khi xep");
        for (Circle circle:circles){
            System.out.println(circle);
        }

    }
}
