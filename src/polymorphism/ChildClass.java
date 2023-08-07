package polymorphism;

public class ChildClass extends ParentClass{
    @Override
    public void m1(int a, int b) {
        super.m1(a, b);
        System.out.println(a*b);
    }
}
