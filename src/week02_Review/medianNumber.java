package week02_Review;

public class medianNumber {

    public static void main(String[] args) {
        int a= 10;
        int b = 15;
        int c = 20;
        boolean aISmedian = ( b>a && a> c) || ( a > a && a> b);
        // in order for a to median number between three DIFFERENT numbers
        // A need to be less than B and grater than C. or a need to be less than C and grater than B.

        boolean bIsmedian = ( a > b && b> c) || ( c> b && b> a);

        boolean cisMedian = !aISmedian && !bIsmedian;
        if (aISmedian){
            System.out.println(a + " Is the madian number. ");
        }
        if (bIsmedian) {
            System.out.println(b + " is the madian number. ");
        }
        if(cisMedian){
            System.out.println( c + " is the median number");
        }
    }
}
