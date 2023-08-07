package polymorphism;

//compile time polymorphism
// different type of parameters, different number of args
public class MethodOverLoadingExample {
   public void m1(int a){

   }
   public void m1(int a, int b){

   }
   public void m1(int a, String name){

   }
   public void m1(String name, int b){

   }
   public void addition(int a, int b){
      int result = a+b;
      System.out.println(result);

   }
   public void addition(int a, int b, int c){
      int result = a+b+c;
      System.out.println(result);

   }

   public static void main(String[] args) {
      MethodOverLoadingExample obj = new MethodOverLoadingExample();
      obj.m1(10);
      obj.m1(10, "Prime");

   }
}
