package s5_modifier.bai_tap;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ban kinh");
        double radius = input.nextDouble();
        System.out.println("nhap color");
        String color1 = input.next();
        Circle circle = new Circle(radius, color1);

        System.out.println(circle.getArea());
//        System.out.println(circle.getColor());
        circle.setColor("blue");
        System.out.println(circle.getColor());


    }
}
