package myPracticeTab.automation_test;

public class ForLoop_Q4 {
    public void printMyName(String name, int howManyTime){

        for (int i = 1; i<=howManyTime;  i++){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName("Ashish",10);
        obj.printMyName("Ashish",15);


    }
}
