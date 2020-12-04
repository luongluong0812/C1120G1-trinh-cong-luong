package java_interface;

public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("dog chay");

    }

    @Override
    public void eat() {
        System.out.println("hot dog");

    }

    @Override
    public void sleep() {
        System.out.println("dog no sleep");

    }
}
