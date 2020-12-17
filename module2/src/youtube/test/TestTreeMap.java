package youtube.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String,String > map=new TreeMap<>();
        map.put("b","luong");
        map.put("c","nam");
        map.put("z","linh");
        map.put("k","an");
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        System.out.println("************");
        Map<String,String > has=new HashMap<>();
        has.put("b","luong");
        has.put("c","nam");
        has.put("z","linh");
        has.put("k","an");
        for (Map.Entry<String,String> entry:has.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }

    }
}
