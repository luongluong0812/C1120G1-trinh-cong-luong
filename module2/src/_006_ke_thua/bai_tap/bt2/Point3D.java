package _006_ke_thua.bai_tap.bt2;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z=0.0f;
    private float[] arr3D=new float[3];


    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public float getX() {
        return super.getX();
    }

    @Override
    public float getY() {
        return super.getY();
    }
    public void setXYZ(float x,float y,float z){
        return;
    }
    public  float[] getXyz(){
        arr3D[0]=this.getX();
        arr3D[1]=this.getY();
        arr3D[2]=this.getZ();
        return arr3D;
    }

    @Override
    public String toString() {
        return "Point3D{" +"x="+getX()+"y="+getY()+
                "z=" + z +
                ", arr3D=" + Arrays.toString(getXyz()) +
                '}';
    }
}
