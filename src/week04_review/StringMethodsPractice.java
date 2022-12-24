package week04_review;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String str = "Cydeo School";
        char ch = str.charAt(1);

       int length=  str.length();
        System.out.println(ch);
        System.out.println(length);

        int lastIndex= str.length() -1;

        char ch2 =str.charAt(lastIndex);
        System.out.println(ch2);
        System.out.println("??????????????????????????????????");


        int indexOfe = str.indexOf ('e');
        System.out.println("indexOfe = " + indexOfe);
        int indexOfFirstO = str.indexOf("o");
        System.out.println("index oif first O = "+ indexOfFirstO );

        int indexOfSecondO = str.indexOf("oo");
        System.out.println("index of second O = " + indexOfSecondO);

        System.out.println("=============================================");

        String s1 = "BATCH 28";
        s1 =s1.toLowerCase();
        System.out.println( " S1 = " + s1);


    String s2 = "I live in Virginia, I love virginia";
    s2= s2.replace(" Virginia", "New York");
        System.out.println(s2);
        System.out.println("---------------------------------");

        String s3="Batch 28 students";
       String t1 = s3.substring(0,8);
        System.out.println(t1);

       String t2= s3.substring(s3.indexOf('s'));
        System.out.println(t2);

        System.out.println("11111111111111111111111");

        String name = "mUhTar";
        name= name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(name);

        System.out.println("?????????????????????????????????????????");

       String a ="yEs";
        System.out.println(a.equalsIgnoreCase("yes"));

        String l = " Todat we eill have Java and Soft Skill class";
       boolean hasSelenium= l.contains("Selenium");
       System.out.println("Has Selenium? " + hasSelenium);

       boolean hasJava = l.contains("java");// case sensetive
        System.out.println(hasJava);


    }
}
