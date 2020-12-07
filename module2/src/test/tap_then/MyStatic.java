package test.tap_then;

public class MyStatic {
    private static String name;
   // public  String name;
    private int age;

    //    static {
//        name = "abc";
//    }
    public static void showInfo() {
        System.out.println(name);
    }

    public void showAge() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        MyStatic.name = "abc";
        MyStatic test_1 = new MyStatic();
        test_1.showAge();
        System.out.println("********************");

//        MyStatic.name = "def";
        test_1.name = "def";
        test_1.age = 15;
        MyStatic test_2 = new MyStatic();
        test_1.showAge(); //def 15
        test_2.showAge(); //def 0


//        Integer.parseInt("11");
//        Math.abs(45);
//        Arrays.sort();


    }
}
