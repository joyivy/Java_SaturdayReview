package week04_review;

public class combineTwoWorld {

    public static void main(String[] args) {

        String s1 = "one";
        String s2 = "eight";

        if (s1.charAt(s1.length()-1)== s2.charAt(0)){ //if the last charecter of first string is equal to the first character of second string
            System.out.println(s1 + s2.substring(1));
        }
        }
    }

