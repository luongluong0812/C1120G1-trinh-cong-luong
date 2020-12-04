package _06_ke_thua.bai_tap2;

public class Cylinder extends Circle {
    private double width;
    public Cylinder(){

    }

    public Cylinder(double width) {
        this.width = width;
    }

    public Cylinder(float radius, String color, double width) {
        super(radius, color);
        this.width = width;
    }
    public double theTich(){
        return area()*width;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("the tich la"+theTich());
    }
}
