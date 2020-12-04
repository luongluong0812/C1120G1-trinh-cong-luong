package java_interface;

public class Cat implements Animal {

    @Override
    public void move() {
        System.out.println("meo chay");
    }

    @Override
    public void eat() {
        System.out.println("meo an chuot");

    }

    @Override
    public void sleep() {
        System.out.println("meo ngu");

    }
}
