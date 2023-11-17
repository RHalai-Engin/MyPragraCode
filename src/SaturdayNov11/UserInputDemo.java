package SaturdayNov11;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        //Scanner which takes input of primitive types
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the value of num2: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the value of num3: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("Num1 is larget of all");
        }
        else if (num2 >= num1 && num2 >= num3){
            System.out.println("Num2 is larget of all");
        }
        else if (num3 >= num1 && num3 >= num2){
            System.out.println("Num3 is largest of all");
        }
        else {
            System.out.println("Provided Input are Invalid.");
        }
    }
}
