package week08_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(10);
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());

        list.addAll(asList(30, 40, 60, 90));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.addAll(3,  Arrays.asList(45,65,75));
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.removeAll(Arrays.asList(45,40,90));
        System.out.println(list);
        list.remove(Integer.valueOf(75));
        System.out.println(list);

        List<Integer> numbers = new ArrayList<>(list);
        numbers.addAll(Arrays.asList(100,200,300,400,500));
        System.out.println(numbers);
        numbers.retainAll(Arrays.asList(65,300,400));
        System.out.println(numbers);
        ArrayList<String> names = new ArrayList<>();

        names.addAll( Arrays.asList("Java", "SoftSkill", "Selenium", "API", "SQL", "Wooden Spoon"));

        System.out.println(names);

        names.get(2).charAt(2);

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 50, 10, 20, 30, 40, 50, 60 ));

        nums.removeIf( p ->  p < 40 );

        System.out.println(nums);

        //  System.out.println( new LinkedHashSet<>(nums));


    }
}