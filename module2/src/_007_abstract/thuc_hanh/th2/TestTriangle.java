package _007_abstract.thuc_hanh.th2;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle("blu",true,1,2,3);
        System.out.println(triangle.toString());
        System.out.println("co dien tich:");
        System.out.println(triangle.getArea());
        System.out.println("chu vi");
        System.out.println(triangle.getPerimeter());
    }
}
