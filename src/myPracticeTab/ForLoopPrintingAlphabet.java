package myPracticeTab;

public class ForLoopPrintingAlphabet {
    public static void main(String[] args)
    {
        char i;
        System.out.print("The Alphabets from A to Z are: n");
        for (i = 'A'; i <= 'Z'; i++)
        {
            System.out.printf("%c ", i);
        }
    }
}
