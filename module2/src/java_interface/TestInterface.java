package java_interface;

public class TestInterface {
    public static void main(String[] args) {
        var animal=new Fish();
        var animal1=new Cat();
        var animal2=new Dog();
        animal.eat();
        animal1.move();
        animal2.sleep();

    }
}
