package methodtypes;

public class WithReturnTypesNoParameters {

    public static void main(String[] args) {
        int x = 50;
        //int x = 50;
        //System.out.println(x);
        int answer = addition();

        System.out.println(answer);
        isItRight();
        System.out.println(addition());
        System.out.println(isItRight() );

    }

    //With return type and no parameters
    public static int addition() {
        int a = 20;
        int b = 30;
        int ans = a + b;

        return ans;
    }

    public static String name() {
        int a = 20;
        int b = 30;
        String name = "Prime";
        int ans = a + b;

        return name;
    }

    public static boolean isItRight() {
        boolean a = true;
        boolean b = false;
       // return a;
        return b;


    }
}
