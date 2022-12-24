package week03_Review;

import java.util.Scanner;

public class ScannerPractice  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );//\n
        System.out.println("Enter an integer ");
        int num =  input.nextInt(); //12+\n

        System.out.println("You have entered " +num);
        System.out.println("enter a decimal number: ");


        double num2 = input.nextDouble();
        System.out.println("you have entered " +num2);
        System.out.println("Are you employeed? ");
       String employeed= input.next();
        System.out.println("employeed= " + employeed);
        input.close();
    }
}
