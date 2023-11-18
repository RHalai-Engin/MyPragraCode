package SaturdayNov18;

import java.util.Scanner;

public class LoopsCont {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++){
            System.out.println("Please enter a Number: ");
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            if(i == 5){
                System.out.println("You can't enter this number please try again");
                continue;
            }
            System.out.println(i);
        }
    }
}
