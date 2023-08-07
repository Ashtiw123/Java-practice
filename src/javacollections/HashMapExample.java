package javacollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[]args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"bmw");
        map.put(6,"Audi");
        map.put(4,"Honda");

        for (Map.Entry<Integer,String>   car : map.entrySet()){
            System.out.println(car.getKey()+ " "+ car.getValue());
        }
        //Iterate by Iterator
        Iterator<Map.Entry<Integer,String>> carList = map.entrySet().iterator();
        while (carList.hasNext()){
            System.out.println(carList.next());
        }

    }

}
