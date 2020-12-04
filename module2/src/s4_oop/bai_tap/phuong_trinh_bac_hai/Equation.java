package s4_oop.bai_tap.phuong_trinh_bac_hai;

public class Equation {
    private double a,b,c;



    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta=this.b*this.b-4*this.a*this.c;
       return delta;
    }
    public double getRoot1(){
        double r1;
        r1 = (-this.b-Math.sqrt(getDiscriminant())) /(2*this.a);
        return r1;

    }
    public double getRoot2(){
        double r2=(-this.b+Math.sqrt(getDiscriminant())) /(2*this.a);
        return r2;
    }
}
