package model.test2;

public class Cat extends Dog{
    public Cat() {
    }

    public Cat(double weight, double age) {
        super(weight, age);
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(double weight, double age, String name) {
        super(weight, age, name);
    }
    public void sleep(){
        System.out.println(this.getName()+"alway sleep!");
    }

    @Override
    public String toString() {
        String s = "cat name" + getName();
        return s;
    }
}
