package SaturdayNov25.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int [][] num = new int[3][3];
        int [][] num1 = new int[3][3];

        for (int [] element: num) {
            System.out.println(num);
            for (int num2: element) {
                System.out.println(num2);
            }
        }



    }
}
