package _s07_abstractaaaa.bai_tap.bt1;

import test_ke_thua.Geometric;

public class Circle extends Geometric implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;

        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
    }

    @Override
    public void resize(double percent) {
        double n = (double) Math.floor(Math.random() * percent);
        setRadius(getRadius() + (getRadius() * (n / 100)));
        System.out.println("With resize is " + n + "%");
    }
}
