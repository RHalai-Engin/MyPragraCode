package TuesdayNov14;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;
        while(i <= 10){
            System.out.println("i = " + i++); //First loop i = 1
            sum = sum + i; // sum will add 1 to i
            System.out.println("sum = " + sum);
        }
        System.out.println("sum is equal to :" + sum);
    }
}