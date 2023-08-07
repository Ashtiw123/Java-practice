package myPracticeTab.iterationstatement;

public class WhileLoopExample {
    public static void main(String[] args) {
        //I want to write Prime 5 times
        int a = 1;
        while (a <= 5) {
            System.out.println("a");
            a++; // if we don't put this it will repeat and repeat this will stop when it comes to 5
            // it will become a false statement and stop at 5
        }
        boolean ans = true;
        while (true) {
            if (ans) {
                System.out.println("Prime");
                break;
            }
        }


    }
}
