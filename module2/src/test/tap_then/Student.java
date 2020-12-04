package test.tap_then;

public class Student extends Person{
    private float mark;
    private String id;
    private  float fee;
    public Student(){

    }
    public  Student(float mark,
                    String Studenid,float fee,String address,String id,String email){
        super(address,id,email);
    }


}

