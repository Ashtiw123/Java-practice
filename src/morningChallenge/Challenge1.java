package morningChallenge;

import java.util.Scanner;

public class Challenge1 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input First Number :");
        int num1 = scanner.nextInt();
        System.out.println("Input Second Number : ");
        int num2 = scanner.nextInt();
        Challenge1 challenge1 = new Challenge1();
        challenge1.productOfNumber(num1, num2);
        scanner.close();
    }

    public void productOfNumber(int num1,int num2){
      System.out.println(num1 + "X" + num2 +" = "+ num1 * num2);

        int ans =num1 * num2;
        System.out.println();
}
}
