package s4_oop.bai_tap.ptb2;

public class PTB2 {
    double a,b,c;
    double d;
    public PTB2(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;

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

    public double delta(){
        return (this.b*this.b)-4*this.a*this.c;
    }
    public double getRoot1(){
        return (this.b+Math.sqrt(delta()))/(2*this.a);
    }
    public double getRoot2(){
        return (-this.b+Math.sqrt(delta()))/(2*this.a);
    }

}
