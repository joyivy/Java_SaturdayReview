package week02_Review;

public class Operators {

    public static void main(String[] args) {
        //Arithmatic
        System.out.println(20/ 3);
        System.out.println(20.0 / 3);
        System.out.println(20 % 8); //left sonuc will be 4
        System.out.println(100/28.0);
        System.out.println(100%28);
        System.out.println(1 + 2 + " Result A");

        System.out.println("+++++++++++++++++++++++++++++");

        //shorthand
//=
        int a = 200;
        System.out.println("a = " +a);
        a = 2000;
        System.out.println( "a = " + a);
        // += incrise -=

        int x = 100;
       // x=x + 20;
        x+=20; // adding values to veriable on top of its original value

        System.out.println(x);

        // -=

        int y = 200;
        y -=50;
        System.out.println(y);
        System.out.println("+++++++");

        int score = 45;
        score *= 2;
        System.out.println(score);

        int points = 100;
        points /= 2;
        System.out.println(points);

        int cents = 100;
        cents -= 60;
        System.out.println(cents);

        int quarter = cents / 25; // 1
        cents -= 25;
        System.out.println(cents);
        int nickles = cents / 5;
       // cents = cents %1;
        cents %=1;
        System.out.println(cents);

        int amount =  730;
        int hundreds = amount / 100;
        System.out.println(hundreds);
        amount %= 100;
        System.out.println(amount);
        int tenth = amount / 10;
        System.out.println( tenth);

        amount %= 10;
        System.out.println(amount);
        System.out.println("-----------------------------");
        //unary

        System.out.println(-10 + 20);
        System.out.println(10+20);
        int q = 25; //incrise number +1 first step
        System.out.println(++q);
        int r = 50;
        System.out.println(r++); // not incrise first step
        System.out.println(r);
      //dicriment
        int t = 300;
        System.out.println(--t);

        int u = 300;
        System.out.println(u--);
        System.out.println(u);





    }
}
