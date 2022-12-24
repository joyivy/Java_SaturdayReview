package week02_Review;

public class swapvariables {

    public static void main(String[] args) {

        // with a temporary varible
        int x =100;
        int y= 200;
        int z=x; // 100 used for containg to original value of X
        x=y; // x=200, X will have the value Y. X no longer have original value
        y=z; // Y will have the original value of X
        System.out.println("x =" + x);
        System.out.println("y= +" + y) ;
        System.out.println("+++++++++++++=============+++++++++++");

        //without temporary variable ; interview quastion

        int a = 10;
        int b = 20;
        a = a+b;
        b = a-b;
        a=a-b;
        System.out.println(" a=" + a);
        System.out.println( " b=" + b);



    }
}
