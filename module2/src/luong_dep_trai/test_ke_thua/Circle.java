package luong_dep_trai.test_ke_thua;

public class Circle extends Geometric {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, String filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return getRadius()*getRadius()*3.14;
    }
    public double getPerimeter(){
        return 2*getRadius()*3.14;
    }
    public double getDiameter(){
        return 2*getRadius();
    }
    public void printCircle(){
        System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
    }
}
