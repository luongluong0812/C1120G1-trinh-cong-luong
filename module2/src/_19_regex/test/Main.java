package _19_regex.test;

public class Main {
    public static void main(String[] args) {
        System.out.println("+84123456789".matches("(\\+84|0)+[0-9]{9,10}"));
        //String regex = "[\w0-9]+@[a-zA-Z]+(.com|.abc)";
        String regex1="^[\\w]+@[a-z]{3,5}(\\.[a-z]{2,5})+$";
        System.out.println("a123@gmail.com".matches(regex1));

    }
}
