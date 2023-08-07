package constructors;

public class ConstructorDemo {

    public ConstructorDemo() {
        System.out.println("Zero args constructor");

    }

    public ConstructorDemo(int a) {
        System.out.println("This is a one args constructor" + a);
    }

    public ConstructorDemo(String name) {
        System.out.println("This is a one args constructor" + name);
    }

    public ConstructorDemo(int a, int b) {
        System.out.println("This is a two args constructor" + (a + b));
    }

    public void addition() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        ConstructorDemo t = new ConstructorDemo();
        ConstructorDemo t1 = new ConstructorDemo(10);
        ConstructorDemo t2 = new ConstructorDemo("Prime");
        ConstructorDemo t3 = new ConstructorDemo(10, 5);
        t.addition();

    }
}
