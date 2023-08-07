package stringexamples;

public class StringDemo {


    public static void main(String[] args) {
        String s1 = "This is a  first string";
        String s2 = "This is a second string";
        String  s3 = "";
        // length of string length will also include space
        int l = s1.length();
        System.out.println(l);
        System.out.println(s1.contains("first"));
        System.out.println(s1.contains("second"));
        System.out.println(s2.toUpperCase());//convert to upper case
        System.out.println(s1.equals(s2));//compare s1 s2
        System.out.println(s1==s2);
        System.out.println(s3.isEmpty());

    }
}
