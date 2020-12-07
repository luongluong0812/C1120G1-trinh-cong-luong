package s5_accsess_modifier.bai_tap;

public class Circle {
    private double radius=1;
    private String color="red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    protected double getArea(){
        double s=getRadius()*getRadius()*3.14;
        return s;
    }
}
