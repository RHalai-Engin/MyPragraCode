package SaturdayNov18;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        for (double n = 0; n <= 100; n++){
            System.out.println("Please enter a Number: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if(n % 3 == 0){
                System.out.println("You can't use the number that can be divided by 3");
                continue;
            }
            System.out.println(n);
        }
    }
}
