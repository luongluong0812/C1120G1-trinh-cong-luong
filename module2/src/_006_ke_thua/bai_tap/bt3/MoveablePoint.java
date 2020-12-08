package _006_ke_thua.bai_tap.bt3;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private double xSpeed;
    private double ySpeed;


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

    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double[] Speed() {
        double[] arr = new double[2];
        arr[0] = getXSpeed();
        arr[1] = getYSpeed();
        return arr;

    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", arr=" + Arrays.toString(super.getXY()) +
                '}';
    }

    MoveablePoint move() {
        super.setX((super.getX()) + getXSpeed());
        super.setY(super.getY() + getYSpeed());
        return this;

    }

}
