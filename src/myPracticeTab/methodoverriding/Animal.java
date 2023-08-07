package myPracticeTab.methodoverriding;

/**
 * Method overriding in Java is when a subclass provides its own implementation of a method
 * that is already defined in its superclass.
 * * For example, let's say we have a superclass called Animal with a method called makeSound().
 * We also have a subclass called Dog which extends Animal. If we want the Dog class to have its
 * own implementation of makeSound(),
 * we can override the method in the Dog class like this:
 */
public class Animal {
    public static void main(String[] args) {
        makeSound();
    }
    public static void makeSound() {
        System.out.println("The animal make sound");
    }
}