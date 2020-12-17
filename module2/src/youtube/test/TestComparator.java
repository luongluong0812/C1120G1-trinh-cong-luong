package youtube.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Student> listSt=new ArrayList<>();
        listSt.add(new Student("long",20));
        listSt.add(new Student("an",16));
        listSt.add(new Student("an",17));
        listSt.add(new Student("lam",19));
        System.out.println("truoc");
        System.out.println(listSt);
        System.out.println("sau:");
        Collections.sort(listSt,new StudentComparator());
        System.out.println(listSt);

    }
}

