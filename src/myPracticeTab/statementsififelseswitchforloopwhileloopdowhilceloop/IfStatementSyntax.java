package myPracticeTab.statementsififelseswitchforloopwhileloopdowhilceloop;

/*
if(condition){
 if body;
}
 */
/*The curly braces are optional when ever we are taking single statement.
The curly braces are mandatory whenever we are taking multiple statements,
 */
public class IfStatementSyntax {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a < b) {
            System.out.println("true");
        }
        System.out.println("Hello");

        if (a > b) {
            System.out.println("true");
        }
        System.out.println("Hello");
    }
}