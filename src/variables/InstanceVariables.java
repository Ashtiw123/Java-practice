package variables;

public class InstanceVariables {

    // Scope                - within the class
    //Memory allocation     - when object is created
    // Instance             -belongs to object

    int a = 10; // a is a Instance variable or Global variable

    //main method is a static method
    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
    }
}
