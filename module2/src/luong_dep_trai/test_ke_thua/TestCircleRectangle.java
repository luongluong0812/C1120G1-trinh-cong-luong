package luong_dep_trai.test_ke_thua;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.setFilled("black");
        circle.setRadius(2);
        circle.setColor("red");
        System.out.println(circle.getArea());
        System.out.println(circle.toString());
        Rectangle rectangle=new Rectangle(2,3);
        rectangle.setColor("blu");
        System.out.println(rectangle.toString());
    }
}
