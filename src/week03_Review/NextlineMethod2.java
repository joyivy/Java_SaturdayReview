package week03_Review;

import java.util.Scanner;

public class NextlineMethod2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//n
        System.out.println("Enter your salary: ");
        int salary = input.nextInt(); // 100k
String job_title =input.nextLine();
        System.out.println("Enter your job title: " );
        String jobtitle = input.nextLine();
        System.out.println("My Job Title is; " + jobtitle);

    }
}
