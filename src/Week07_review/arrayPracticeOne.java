package Week07_review;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPracticeOne {
    public static void main(String[] args) {
        // scores; 10,11,12,13,14,15

        int[] scores ={10,11,12,13,14,15};
        System.out.println(Arrays.toString(scores));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

// this for reverse
        String[] words = {"Java", "Selenium", "API", "SQL","Wooden Spoon", "Phyton"};
        String[] result = new String[6];
        //for (int i = worlds.length - 1, j=0-; i >= 0; i--, j++) {
        for (int i = words.length - 1, j = 0; i >= 0; i--, j++) {
            result[j]=words[i];


        }
        System.out.println(Arrays.toString(result));



        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLL");


        int [] numbers= new int[5];
        Scanner input =new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number");
            numbers[i] =input.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
        input.close();
    }
}
