package week08_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMaximumNumber {

    public static void main(String[] args) {
//5th maximim number finding
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,9,10,11,12,13,14,15));
        int n = 5;
        for (int i = 0; i < n-1; i++) {
            list.removeIf(p-> p== Collections.max(list));

        }

        int result= Collections.max(list);
        System.out.println("Result" + result);
        }


        /*list.removeIf(p-> p ==Collections.max(list)); // removes maximum numbers
        System.out.println(list);

        list.removeIf(p-> p ==Collections.max(list)); // removes maximum numbers
        System.out.println(list);

        list.removeIf(p-> p ==Collections.max(list)); // removes maximum numbers
        System.out.println(list);

        list.removeIf(p-> p ==Collections.max(list)); // removes maximum numbers
        System.out.println(list);

         */
    }

    /*
    write a program that can return the nth largest number from an arraylist
            ex:
                arraylist = {1,2,3,4,5,6,7,7,8,8}
                n = 5
            output:
                4
     */