package _006_ke_thua.bai_tap.bat1;

public class testCylinder {
    public static void main(String[] args) {
        Circle circle=new Circle(1.0,"blue");
        System.out.println(circle.toString());
        Cylinder cylinder=new Cylinder(1,"red",2);
        System.out.println(cylinder.toString());
    }
}
