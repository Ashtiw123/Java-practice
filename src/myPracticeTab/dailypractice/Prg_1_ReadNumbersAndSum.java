package myPracticeTab.dailypractice;

import java.util.Scanner;
public class Prg_1_ReadNumbersAndSum {
    //public class Programme_1_ReadNumbersAndSum{
        public static void readTenNumberAndSum(){
            //Scanner declaration for reading input from console
            Scanner scanner = new Scanner(System.in);
            int counter = 0;
            int sum =0;
            while (true){
                int order = counter + 1;
                System.out.print("Enter number #" + order + ":  ");
                boolean isAnInt = scanner.hasNextInt();
                if (isAnInt){
                    int number = scanner.nextInt();
                    counter++;
                    sum += number;
                    if (counter ==10){
                        break;
                    }
                }else{
                    System.out.print("Invalid number");
                }
                scanner.nextLine(); //Handle end of line (enter key)
            }
            System.out.print("sum = " + sum);
            //closing the scanner object
            scanner.close();
        }
       // public static void main(String[] args) {
         //   readTenNumberAndSum();
        }



