package myPracticeTab.statementsififelseswitchforloopwhileloopdowhilceloop;
/*
if(condition){
 if body;
}else if (condition){
 else if body;
}else{
 else body;
}
 */
public class IfAndIfElseStatement {
    public static void main(String[] args) {
        int marks =90;
        if(marks>=80){
            System.out.println("Grade A");
        } else if (marks<80 && marks>=70) {
            System.out.println("Grade B");
        } else if (marks<35) {
            System.out.println("Fail");

    }else {
            System.out.println("Pass");
            }
        System.out.println("Final result");
    }
}
