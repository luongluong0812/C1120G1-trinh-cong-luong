package _00_string_methor;

public class Test {
    public static void main(String args[]) {
        String s1 = "java string split method by viettuts";
        String[] words = s1.split("\\s");//tach chuoi dua tren khoang trang
        //su dung vong lap foreach de in cac element cua mang chuoi thu duoc
        for (String w : words) {
            System.out.print(w);
        }
    }
}
