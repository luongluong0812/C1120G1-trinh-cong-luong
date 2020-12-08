package _007_abstract.thuc_hanh.th1;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "o oo ooo oooo";
    }

    @Override
    public String howToEat() {
        return "ga an thoc";
    }
}
