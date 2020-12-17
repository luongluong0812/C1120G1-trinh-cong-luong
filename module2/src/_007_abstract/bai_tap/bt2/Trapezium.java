package _007_abstract.bai_tap.bt2;

public class Trapezium extends Shape implements InterfaceOfTrapezium{
    private double length1;
    private double length2;
    public double height;

    public Trapezium() {
    }

    public Trapezium(double length1, double length2, double height) {
        this.length1 = length1;
        this.length2 = length2;
        this.height = height;
    }

    public Trapezium(String color, boolean filled, double length1, double length2, double height) {
        super(color, filled);
        this.length1 = length1;
        this.length2 = length2;
        this.height = height;
    }

    public double getLength1() {
        return length1;
    }

    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public double getLength2() {
        return length2;
    }

    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return getHeight()*(getLength1()+getLength2())/2;
    }

    @Override
    public String toString() {
        return " A Trapezium{" +
                "length1=" + length1 +
                ", length2=" + length2 +
                ", height=" + height +
                '}'+"have color:"+getColor()+" and area : "+ getArea();
    }

    @Override
    public void doMassage() {
        System.out.println("day ro rang la hinh thang!");
    }
}
