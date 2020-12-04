package youtube.bai_36.accsess;

import java.util.ArrayList;
import java.util.Collections;

public class Comparto {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("456","kb",3.5f));
        list.add(new Student("123","kb",4.0f));
        list.add(new Student("11","kb",5.0f));
        System.out.println("truowcs sap sep");
        for (Student x:list){
            System.out.println(x.toString());
        }
        System.out.println("sau khi sep");
        Collections.sort(list);
        for (Student x:list){
            System.out.println(x.toString());
        }

    }

}
