package myPracticeTab.methodtypes;

public class NoReturnNoParameters {

    public static void main(String[] args) {
        int x = 50;
        String name = "Prime";
        System.out.println(x);
        System.out.println(name);
        addition();
        System.out.println("ans");
        NoReturnNoParameters obj1 = new NoReturnNoParameters();
        obj1.subtraction();
        obj1.multiplication();
        myMethod();
        division();
    }

    //No return type (void) no params
    public static void addition() {
        int a = 5;
        int b = 5;
        int ans = a + b;
        System.out.println("Addition of two numbers is : " + ans);

    }

    //No return type(void) no params
    public void subtraction() {
        int a = 10;
        int b = 2;
        int ans = a - b;
        System.out.println("Subtraction of two number is : " + ans);
    }

    public int ashishMaths(){
        int a = 12;
        int b = 6;
        int c = -2;
        return a+b+c;
    }

    void multiplication() {
        System.out.println("I am in multiplication method");
    }

    public static void myMethod() {
        System.out.println("This is my method");
    }

    public static void division() {


    }
}




