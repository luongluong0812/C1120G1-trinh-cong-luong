package _s07_abstractaaaa.thuc_hanh.th1;

public  class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "o o o";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
