package myPracticeTab.methodtypes;

public class WithReturnTypesWithParameters {

    public int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    public String myName(String name) {

        return name;
    }

    public boolean isItClickable(boolean button) {
        return button;
    }

    public static void main(String[] args) {
        WithReturnTypesWithParameters t = new WithReturnTypesWithParameters();
        int result1 = t.addition(10, 20);
        System.out.println(result1);
        t.myName("Prime");

        System.out.println(t.myName("Prime"));
        boolean result2 = t.isItClickable(true);
        System.out.println(result2);

    }


}
