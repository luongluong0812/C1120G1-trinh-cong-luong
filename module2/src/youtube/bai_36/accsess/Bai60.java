package youtube.bai_36.accsess;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai60 {
    public static void main(String[] args) {
//        String [] string=new String[10];
//        ArrayList <Student> arrayList=new ArrayList(12);
//        arrayList.add(0,new Student("luong","08","123","duy tan",05.5f));
//        arrayList.add(1,new Student("luong","08","123","duy tan",05.5f));
//
//
////        System.out.println(string.length);
//        System.out.println(arrayList.size());
//        for (int i=0;i<arrayList.size();i++) System.out.println(arrayList.get(i));
//
//
//
        ArrayList <Integer> arrayList=new ArrayList<>(10);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(1,4);
        arrayList.set(2,9);
        arrayList.remove(2);
        System.out.println("size:"+arrayList.size());
        for(Integer a:arrayList){
            System.out.println(a);
        }
   }
}
