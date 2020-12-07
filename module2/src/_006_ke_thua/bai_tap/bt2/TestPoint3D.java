package _006_ke_thua.bai_tap.bt2;

public class TestPoint3D {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        point2D.setX(2.0f);
        point2D.setY(5f);
        System.out.println(point2D.toString());
        Point3D point3D=new Point3D(5.0f,2.0f,3.2f);
        System.out.println(point3D.toString());

    }
}
