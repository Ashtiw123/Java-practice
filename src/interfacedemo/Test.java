package interfacedemo;

public class Test implements InterfaceDemo{
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
        test.m2();
    }
}
