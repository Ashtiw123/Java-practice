package myPracticeTab.automationtest;

public class ForLoop_Q4 {
    public void printMyName(String name, int howManyTimes ){
        for(int i = 1; i <= howManyTimes; i++){
            System.out.println((name));
        }

    }

    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName("AshTiw", 2 );
        obj.printMyName("Prime", 3);
    }
}
