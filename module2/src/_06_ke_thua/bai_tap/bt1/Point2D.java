package _06_ke_thua.bai_tap.bt1;

import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    float[] arr=new float[2];
    public Point2D(){

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
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;

    }
    public float[] getXY(){
        arr[0]=getX();
        arr[1]=getY();
        return arr;
    }
    public String toString(){
        return "point2D{"+"x="+x+",y="+y+
                ",arr="+ Arrays.toString(getXY())+"}";
    }
}
