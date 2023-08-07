package myPracticeTab;

public class Practice {
    public static void main (String [] args){
        Practice obj = new Practice();
        obj.innit();
    }
    public void innit(){
        int c = 6;
        int d = 4;
        System.out.println(c-d);
        Practice obj = new Practice();
        obj.myName();
    }

    public static int myName() {
        int a = 5;
        int b = 5;
        System.out.println("result");
        return a;
    }
}
