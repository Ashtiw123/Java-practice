package inheritance;

public class ChildClass extends ParentClass {
    public void m3(){
        System.out.println("Child class m3 method");
        //m1();
        }
        public void m4(){
            System.out.println("Child class m4 method");
        //    m2();
        }

    public static void main(String[] args) {
        //child class object is a recommended way / preference
        ChildClass obj1 = new ChildClass();
        obj1.m3();
        obj1.m4();
        obj1.m1();
        obj1.m2();

        // parent class object
        ParentClass obj2 = new ParentClass();
        obj2.m1();
        obj2.m2();
    }

}
