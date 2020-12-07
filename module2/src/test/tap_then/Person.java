package test.tap_then;

public class Person extends Animal {
    private String address;
    protected  String id;
    private  String email;
    public Person(){

    }

    public Person(String address, String id, String email) {
        this.address = address;
        this.id = id;
        this.email = email;
    }
    public void speak(){
        this.saySomething();
    }
    public void move(){
        System.out.println("dang di bo");
    }

    @Override
    public void eat() {
        System.out.println("an o nha hang chu dau");
    }
}
