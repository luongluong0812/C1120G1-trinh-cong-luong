package _007_abstract.bai_tap.bt1;

public class TestCicler {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        circle.resize(50);
        System.out.println(circle.getArea());
        System.out.println("***********");

    }
}
