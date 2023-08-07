package myPracticeTab.javacollections;

import java.util.ArrayList;

public class ArrayListDemo {
    //Array
    int a [] = new int[5];

    public static void main(String[] args) {
      //ArrayList for generic object you cannot store primitive
       ArrayList list = new ArrayList();
        list.add(10);
        list.add("Prime");
        list.add(true);
        list.add('H');
        list.add(null);
        list.add("Prime");
        System.out.println(list.size());
        System.out.println(list);

        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
           }
      //  list.remove(2);
        System.out.println("After removing value");


        for ( Object a :  list   ) {
            System.out.println(a);
        }

        ArrayList <String> carList = new ArrayList();
        carList.add("Prime");
        carList.add("Testing");
        ArrayList <Integer> number = new ArrayList();
        number.add(10);
        number.add(20);
        number.add(Integer.valueOf("Prime"));
}
}
