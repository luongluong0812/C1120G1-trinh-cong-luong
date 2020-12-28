package youtube.test;

import java.util.*;
import java.util.HashMap;

public class Set {
    public static void main(String[] args) {
//        java.util.Set<String> set=new TreeSet<>();
//        set.add("ba bich");
//        set.add("ba bich");
//        set.add("ba ro");
//        System.out.println(set);
//        List<String> list=new ArrayList<>();
//        list.add("ba bich");
//        list.add("ba bich");
//        System.out.println(list);
        Map<Integer,String> mao=new TreeMap<>();
        mao.put(1,"mot");
        mao.put(5,"hai");
        mao.put(3,"ba");
        mao.put(4,"ba");
        System.out.println(mao);
        for (Map.Entry<Integer,String> entry:mao.entrySet()){
            System.out.println("key: "+entry.getKey()+"value: "+entry.getValue() );
        }
        System.out.println("*****");
        Map<Integer,String> has=new HashMap<>();
        has.put(1,"mot");
        has.put(5,"hai");
        has.put(3,"ba");
        has.put(4,"ba");
        for (Map.Entry<Integer,String> entry:has.entrySet()){
            System.out.println("key"+entry.getKey());
        }
        System.out.println(has);

    }
}
