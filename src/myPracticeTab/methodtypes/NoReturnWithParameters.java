package myPracticeTab.methodtypes;

public class NoReturnWithParameters {
    public static void main(String[] args) {
        NoReturnWithParameters obj = new NoReturnWithParameters();
        obj.addition(10, 5);//15
        obj.addition(10, 10);//20
        obj.addition(2, 3);//5
        obj.subtraction(10, 5);//5
        obj.subtraction(7, 4);//3
        obj.division(10, 5);//2
        obj.multiplication(10, 5);//50
        courseName("Java");//Java
    }
    //No return type(void) with params
    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println(ans);
    }
    public void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println(ans);
    }
    public void division(int a, int b) {
        int ans = a / b;
        System.out.println(ans);
    }
    public void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println(ans);
    }
    public static void courseName(String course) {
        System.out.println(course);
    }
}