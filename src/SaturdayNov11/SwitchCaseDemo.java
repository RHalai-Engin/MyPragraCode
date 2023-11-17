package SaturdayNov11;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        System.out.println("++++Welcome to my calculator++++");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 for modulus");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("What kind of calculation would you like to perform, please choose from above ");
        int calculationType = scanner.nextInt();

        switch (calculationType){
            case 1:
                System.out.println("Adding Two Numbers..");
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println("Subtracting Two Numbers..");
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println("Multiplying Two Numbers..");
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println("Dividing Two Numbers..");
                System.out.println(num1 / num2);
                break;
            case 5:
                System.out.println("Hang tight we will find you remainder..");
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid Input, please Try again..");
        }
    }
}
