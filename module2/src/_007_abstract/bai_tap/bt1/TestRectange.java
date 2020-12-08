package _007_abstract.bai_tap.bt1;

public class TestRectange {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        rectangle=new Rectangle(3.0,4.0,"red",true);
        rectangle.resize(50);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);
    }
}
