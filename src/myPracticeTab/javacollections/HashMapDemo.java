package myPracticeTab.javacollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "BMW");
        map.put(2, "Audi");
        map.put(3, "Honda");
        map.put(4, "Audi");
        System.out.println(map);
        map.put(2,"Mercedes");
        System.out.println(map);
         String value1   = map.get(3);
        System.out.println(value1);

    }

}
