package SaturdayDec16;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number 1: ");
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please provide number 2: ");
        int b = scanner1.nextInt();
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
