package s4_oop.bai_tap.Fan;

public class XayDungLopFan{
    private final int SLOW=1,MEDIUM=2,FAST=3;
    private int speed=1;
    private boolean on=true;
    private int radius=5;
    private String color="blue";
    public XayDungLopFan(int speed,boolean on,int radius,String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;

    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public String getSpeed() {
        String speedStr="";
        if(this.speed==getSLOW()){
            speedStr="low";
        }else if (this.speed==getMEDIUM()){
            speedStr="medium";
        }else if(this.speed==getFAST()){
            speedStr="fast";
        }
        return speedStr;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String  getOn() {
        String status="";
        if(on){
            status="fan on";

        } else status="fan off";
        return status;

    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        XayDungLopFan fan= new XayDungLopFan(1,false,5,"red");
        XayDungLopFan fan2= new XayDungLopFan(1,true,6,"blue");
        fan.setOn(true);
        fan.setColor("pink");
        System.out.println("fan1"+fan.getOn()+fan.getColor());
        System.out.println("fan2:"+fan2.getOn());

    }
}
