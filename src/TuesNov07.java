public class TuesNov07 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println(x);
        System.out.println(y);

        int z;
        z = x;
        x = y;
        y = z;

        System.out.println("New value of X :" + x);
        System.out.println("New value of Y :" + y);

        System.out.println("Let's Interchange values without using third/temp variable");
        int a = 10;
        int b = 20;

        System.out.println("Values before changing values");
        System.out.println("New value of a :" +a);
        System.out.println("New value of b :" + b);

        //we will add both values
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after changing values");
        System.out.println("New value of a :" +a);
        System.out.println("New value of b :" + b);

        //Logical operators
        System.out.println("Logical Operators");
        boolean result = !(x <= y || a <= b);
        boolean result1 = x == y && a <= b;
        boolean result2 = x != y && a >= b;
        boolean result3 = x > y || a <= b;
        boolean result4 = x <= y || a <= b;

        //IF ELSE STATEMENTS
        System.out.println("Let's do IF ELSE statements");
        int t = -1;
        int g = 25;
        int year = 2020;
        int num = 100;
        int num1 = 102;

        if (t >= 1) {
            System.out.println("X is Negative");
        }else
        {
            System.out.println("X is Positive");
        }

        if (g % 2 != 0)
        {
            System.out.println("G is odd number ");
        }
        else
        {
            System.out.println("G is Even Number");
        }

        if (year % 4 == 0)
        {
            System.out.println("year 2020 was a leap year");
        }
        else {
            System.out.println("year 2020 was not a leap year");
        }

        if (num >= num1)
        {
            System.out.println("num is less than num1");
        }
        else
        {
            System.out.println("num is greater than num1");
        }




    }
}
