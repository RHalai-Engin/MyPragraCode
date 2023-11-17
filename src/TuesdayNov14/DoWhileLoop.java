package TuesdayNov14;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        do{
            int num1 = num * 2;
            System.out.println("2 * " + num + " = " + num1 );
            num++;
        }
        while (num <= 10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number you want to find factorial for: ");
        int i = scanner.nextInt();
        int x = 1;
        int fac = 1;
        do{
            fac = fac * x;
            x++;
        }while(x <= i);
        System.out.println(fac);
    }
}
