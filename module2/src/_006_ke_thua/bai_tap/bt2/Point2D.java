package _006_ke_thua.bai_tap.bt2;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;
    private float[] arr=new float[2];

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXy(){
     this.x=x;
     this.y=y;
    }

    public float[] getArr() {
        arr[0]=getX();
        arr[1]=getY();
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", arr=" + Arrays.toString(getArr()) +
                '}';
    }
}
