package java_interface;

public class Fish implements Animal {
    @Override
    public void move() {
        System.out.println("ca boi");
    }

    @Override
    public void eat() {
        System.out.println("ca an het");

    }

    @Override
    public void sleep() {
        System.out.println("ca no sleep");

    }
}
