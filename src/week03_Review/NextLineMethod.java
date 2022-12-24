package week03_Review;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);// \n


        System.out.println("Enter your full name");
        String fullname = input.nextLine();

        System.out.println("Full name=" +fullname);
        System.out.println("Enter your age;");
        int age = input.nextInt();
        System.out.println("Age= " + age);
        input.nextLine(); // in order to clear the scanner
        System.out.println("Your Scholl Name; ");
        String scholl= input.nextLine();
        System.out.println("Scholl name= " +scholl);


    }
}
