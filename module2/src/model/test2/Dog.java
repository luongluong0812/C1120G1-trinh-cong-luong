package model.test2;

public class Dog extends Animal{

   private String name;

    public Dog() {
    }

    public Dog(double weight, double age) {
        super(weight, age);
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(double weight, double age, String name) {
        super(weight, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Dog run");

    }

    @Override
    public void move() {
        System.out.println("Dog eat");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
