package _s07_abstractaaaa.bai_tap.bt1;

public class Rectangle extends Geometric {
    private double height;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, String filled, double width, double height) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
}
