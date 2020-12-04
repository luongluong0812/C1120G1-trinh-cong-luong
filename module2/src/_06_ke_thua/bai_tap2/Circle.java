package _06_ke_thua.bai_tap2;

public class Circle {
    private float radius=3;
    private String color="pink";
    public Circle(){

    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double area(){
        return this.radius*this.radius*Math.PI;
    }
    public void showInfo(){
        String info="ban kinh la:"+getRadius()+ "color"+getColor()+"dien tich:"+area();
        System.out.println(info);
    }
    public  int compareTo(){
        return 0;

    }
}
