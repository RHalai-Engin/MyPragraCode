package SaturdayNov18;

import java.util.Scanner;

public class MethodExercise {

    public static void main(String[] args) {

        System.out.println("++++Welcome to my calculator++++");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 for modulus");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("What kind of calculation would you like to perform, please choose from above ");
        int calculationType = scanner.nextInt();

        switch (calculationType){
            case 1:
                System.out.println(addition(num1, num2));
                break;
            case 2:
                System.out.println(subtraction(num1, num2));
                break;
            case 3:
                System.out.println(multiplication(num1, num2));
                break;
            case 4:
                System.out.println(division(num1, num2));
                break;
            case 5:
                System.out.println(modulus(num1, num2));
                break;
            default:
                System.out.println("Invalid Input, please Try again..");
        }

    }

    public static double addition (double x, double y){
        System.out.println("Adding Two Numbers..");
        return x + y;
    }

    public static double subtraction (double x, double y){
        System.out.println("Subtracting Two Numbers..");
        return x - y;
    }

    public static double multiplication (double x, double y){
        System.out.println("Multiplying Two Numbers..");
        return x * y;
    }

    public static double division (double x, double y){
        System.out.println("Dividing Two Numbers..");
        return x - y;
    }

    public static double modulus (double x, double y){
        System.out.println("Hang tight we will find you remainder..");
        return x % y;
    }
}
