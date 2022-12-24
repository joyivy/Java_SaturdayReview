package week03_Review;

public class ifstatementOne {
    public static void main(String[] args) {
        // Odd or even

        int num = 100;
        if (num % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
        System.out.println("-------------------------");

        // 28 , 30 ,31
        int month = -39;
        if (month >= 1 && month <= 12) {
            if (month == 2) {
                System.out.println("28 Days");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30 Days");
            } else {
                System.out.println("31 days");
            }
        } else { //if the month is not valid
            // System.out.println("Invalid");
            if (month < 1) {
                System.out.println("minimum month number is 1");
                }else {
                    System.out.println("maximum month number is 12");

                }
            }
        }
    }