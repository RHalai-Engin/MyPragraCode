package SaturdayNov18;

import java.util.Scanner;

public class MoreMethod {
    String language;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String firstName = scanner.next();

        System.out.println("Enter Your Last Name: ");
        String lastName = scanner.next();


        System.out.println("1. English");
        System.out.println("2. Spanish");
        System.out.println("3. French");
        System.out.println("4. Hindi");
        System.out.println("Choose Language from above: ");
        String language = scanner.next();

    }


}
