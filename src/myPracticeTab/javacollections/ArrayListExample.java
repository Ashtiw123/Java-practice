package myPracticeTab.javacollections;

import java.util.ArrayList;

public class ArrayListExample {
    ArrayList<String> list = new ArrayList<>();

    public void addElementToList() {
        list.add("India");
        list.add("United Kingdom");
        list.add("Dubai");
        list.add("Australia");
        list.add("Pakistan");
    }


    public static void main(String[] args) {
        ArrayListExample example = new ArrayListExample();
        example.addElementToList();
        boolean ans = example.isElementPresentInTheList("India");
        System.out.println(ans);
        System.out.println(example.isElementPresentInTheList("Dubai"));
        System.out.println(example.isElementPresentInTheList("Poland"));
       System.out.println(example.isElementPresentInTheList("Australia"));
       System.out.println(example.isElementPresentInTheList("Australia "));
    }

    public boolean isElementPresentInTheList(String countryName) {
        return list.contains(countryName);


    }
    public boolean verifyElementPresentInTheList(String element){
        boolean ans = false;
        for ( String countryName : list){
            if (countryName.equals(element)){
                ans = true;
                break;
            }
}
            return ans;

}
}