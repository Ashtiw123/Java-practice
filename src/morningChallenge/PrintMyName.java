package morningChallenge;


import java.util.Scanner;

/**
 * Write a java program to print your name (ctrl V)
 */
public class PrintMyName {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        PrintMyName name1 = new PrintMyName();
        name1.printMyName(name);
        //String name = "Ashish";// username scanner class purpose is whatever name user enter
        System.out.println("My name is : " + name);

        scanner.close();
    }
    public void printMyName(String name) {
        System.out.println("My name is : + name);");

    }
}
