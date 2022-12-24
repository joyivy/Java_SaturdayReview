package Week07_review;

import java.util.Arrays;

public class margeTwoArrays {
    public static void main(String[] args) {
// this is make two different arrays make new, together one.
        String[]arr1={"A","B","C","D", "Java", "Phyton"};
        String[]arr2={"E","F","G"};
        String[]arr3= new String[arr1.length+ arr2.length];
        int k =0; // this for keep tracking for third array arr3, name is not matter.

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];

            }
        for (int i = 0; i < arr2.length; i++, k++) {
          arr3[k]=  arr2[i];

        }

        System.out.println(Arrays.toString(arr3));


        }
}

