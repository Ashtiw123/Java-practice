package polymorphism;

public class Main extends ChildClass {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.m1(10, 20);
        ParentClass obj1 = new ParentClass();
        obj1.m1(10, 20);
    }

}

