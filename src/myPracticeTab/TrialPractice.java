package myPracticeTab;

public class TrialPractice {
    public static void main(String [] args){
        int z;
        TrialPractice obj=new TrialPractice();
        z = obj.myName();
        System.out.println("myName" + z);
        myNamme();
    }
    public int myName(){
        int a = 10;
        int b = 3;
        int c = -4;
        return b+c;
    }

    public static void myNamme(){
        int g = 8;
        System.out.println(g);
    }

}
