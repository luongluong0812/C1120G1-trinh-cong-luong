package model.test2;

public abstract class Animal {
    private double weight;
    private double age;

    public Animal() {
    }

    public Animal(double weight, double age) {
        this.weight = weight;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    public abstract void eat();
    public abstract void move();
}
