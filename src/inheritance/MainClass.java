package inheritance;

public class MainClass extends ChildClass{
    public void m5(){
        System.out.println("This is main class method m5");
    }


    public static void main(String[] args) {
        MainClass obj = new MainClass();
        obj.m5();
        obj.m3();
        obj.m4();
        obj.m1();
        obj.m2();
    }
}
