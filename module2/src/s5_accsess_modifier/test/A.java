package s5_accsess_modifier.test;
public class A {
    static public int X = 2;

    static {
        X = 1;
    }

    static public void method() {
        X = 5;
    }





    public static void main(String[] args) {
        A o = new A();
        A.method();
        A.X = 10;
        System.out.printf("x=%d, y=%d", o.X, A.X);
    }
}

