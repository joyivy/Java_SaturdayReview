package week08_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";


        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        list.removeIf(p -> Collections.frequency(list, p) > 1); // remove the elements thata re not unique

        System.out.println(list);

        String result = list.toString().replace("[", "").replace("]", "").replace(", ", ""); // "bdf"

        System.out.println(result);

    }
}


