package test.tap_then;

public class Animal {
    protected  String name;
    protected  int age;
    private float weight;
    protected void saySomething(){
        System.out.println("bla bla");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void eat(){
        System.out.println("an gi ke cha tao");
    }
}
