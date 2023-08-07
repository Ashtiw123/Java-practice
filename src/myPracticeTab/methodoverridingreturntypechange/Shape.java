package myPracticeTab.methodoverridingreturntypechange;

/**
 * Actually, it is not possible to override a method in Java by changing its
 * return type only. The method signature, which includes the method name,
 * parameter types, and return type, must remain the same in both the superclass and the subclass.
 * If we try to change the return type of a method in the subclass,
 * we will get a compilation error. However, it is possible to override a method by
 * returning a subtype of the original return type.
 * For example, let's say we have a superclass called Shape with a method called draw(),
 * which returns an object of type Object. We also have a subclass called Circle which extends Shape.
 * If we want to override the draw() method in the Circle class to return a Circle object instead of
 * an Object object, we can do it like this:
 * n this example, we have overridden the 'draw()' method in the 'Circle' class to return a
 * 'Circle' object instead of an 'Object' object. This is possible because Circle is a subtype
 * of Object. However, if we tried to change the return type to something that is not a
 * subtype of the original return type, like int, we would get a compilation error.
 */
public class Shape {
    public Object draw() {
        System.out.println("Drawing a shape");
        return new Object();
    }

    public static void main(String[] args) {
        new Object();
    }
}

