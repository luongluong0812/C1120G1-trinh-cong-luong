package _006_ke_thua.bai_tap.bt3;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private double xSpeed;
    private double ySpeed;
    private double [] arr=new double[2];

    public MoveablePoint() {
    }

    public MoveablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public double[] Speed(){
        arr[0]=getxSpeed();
        arr[1]=getySpeed();
        return arr;

    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", arr=" + Arrays.toString(Speed()) +
                '}';
    }

    MoveablePoint  move(){
        super.setX((super.getX())+getxSpeed());
        super.setY(super.getY()+getySpeed());
        return this;

    }

}
