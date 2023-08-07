package exceptiondemo;

import java.io.FileReader;

public class UncheckedExceptionExample {

    public static void main(String[] args) {
            readingJungleBook("fileName");
            readingMyBook("fileName");
    }
       public static void readFile(String fileName){

        try {
            FileReader reader = new FileReader(fileName);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
   }
    public static void readingJungleBook(String fileName){
        readFile(fileName);

    }
    public static void readingMyBook(String fileName){
        readFile(fileName);
    }

}
