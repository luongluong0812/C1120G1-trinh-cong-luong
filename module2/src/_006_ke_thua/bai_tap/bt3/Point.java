package _006_ke_thua.bai_tap.bt3;

import java.util.Arrays;

public class Point {
    private double x;
    private double y;
    private double [] arr=new double[2];

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXy(){
        this.x=x;
        this.y=y;
    }
    public double[] getXyz(){
        arr[0]=getX();
        arr[1]=getY();
        return arr;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", arr=" + Arrays.toString(getXyz()) +
                '}';
    }
}
