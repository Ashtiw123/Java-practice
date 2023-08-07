package exceptiondemo;

public class ExceptionDemo {


    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        try{
            System.out.println(a/b);
            }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Enter different number again");
        }finally {
            System.out.println("All good");
        }
        System.out.println("Hi");

    }
}
