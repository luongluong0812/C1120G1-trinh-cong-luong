package test_ke_thua;

public class Rectangle extends Geometric {
    private double height;
    private double width;
    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(String color,String filled,double width,double height){
        this.width=width;
        this.height=height;
        setColor(color);
        setFilled(filled);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
