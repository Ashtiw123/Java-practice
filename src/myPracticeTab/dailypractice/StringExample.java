package myPracticeTab.dailypractice;

public class StringExample {
    public static void main (String [] args){
        String name = "This is my string"; //String declaration
        //Print length of String
        System.out.println("The length of string is: " +name.length());
        //returns a char value at the given index
        System.out.println("The char value at index 5 is : " + name.charAt(5));
        //Check if this string is empty
        System.out.println("Is this string empty: " + name.isEmpty());
    }
}
