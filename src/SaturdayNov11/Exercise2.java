package SaturdayNov11;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.print("Please choose your preferable Language: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Displaying English Menu");

        } else if (choice == 2) {
            System.out.println("Displaying French Menu");

        } else {
            System.out.println("Invalid Input, Please Try Again...");
        }
        System.out.println("1. Mobile");
        System.out.println("2. Internet");
        System.out.println("3. Tv");
        System.out.println("4. Customer Support");
        System.out.println("5. Return to previous menu");
        System.out.print("Please Choose from Above: ");
        int choice2 = scanner.nextInt();

        switch (choice2) {
            case 1:
                System.out.println("Displaying Mobile Menu");
                break;
            case 2:
                System.out.println("Displaying Internet Menu");
                break;
            case 3:
                System.out.println("Displaying TV Menu");
                break;
            case 4:
                System.out.println("Bringing you customer support menu");
                break;
            case 5:
                System.out.println("Taking you back to TuesdayNov07.Main Menu");
                System.out.println("1. Mobile");
                System.out.println("2. Internet");
                System.out.println("3. Tv");
                System.out.println("4. Customer Support");
                System.out.println("5. Return to previous menu");
                break;
            default:
                System.out.println("Please provide Valid Input");
        }
        System.out.println("1. Billing");
        System.out.println("2. Tech Support");
        System.out.println("3. Cancellation");
        System.out.print("Please select one of three options provided: ");
        int choice3 = scanner.nextInt();
        switch (choice3) {
            case 1:
                System.out.println("You have selected billing option.");
                break;
            case 2:
                System.out.println("We will connect you to Tech support in a moment..");
                break;
            case 3:
                System.out.println("Sorry to hear that, we will connect you to one of our representative..");
                break;
            default:
                System.out.println("Please provide valid input!!");

        }
    }
}
