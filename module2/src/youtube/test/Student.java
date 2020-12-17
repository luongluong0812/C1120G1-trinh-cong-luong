package youtube.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student  {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Student student) {
//        return this.getName().compareTo(student.getName());
//    }
//
//    public static void main(String[] args) {
//        List<Student> list=new ArrayList<>();
//        list.add(new Student("a",19));
//        list.add(new Student("c",15));
//        list.add(new Student("z",12));
//        list.add(new Student("g",11));
//        Collections.sort(list);
//        System.out.println(list);

//    }
}
