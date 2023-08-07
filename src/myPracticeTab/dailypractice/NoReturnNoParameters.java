package myPracticeTab.dailypractice;

public class NoReturnNoParameters {
    public static void main(String[] args) {
        int x =6;
        String name = "Ash";
        System.out.println(x);
        System.out.println(name);
        addition();
        System.out.println("an");
        NoReturnNoParameters obj1 = new NoReturnNoParameters();
        obj1.subtraction();
        obj1.division();

    }
    public static void addition(){
        int a = 9;
        int b =5;
        int an = a+b;
        System.out.println("Addition : " + an);
    }
    public static void subtraction(){
        int d = 10;
        int e = 5;
        int ans = d-e;
        System.out.println("subtraction " + ans);
    }
    public static void division(){
        int f = 90;
        int g = 6;
        int ans = f/g;
        System.out.println("division " +  ans);
    }
}
