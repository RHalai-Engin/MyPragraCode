package SaturdayNov11;

public class ConditionalDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 15;

        if (x >= y && x >= z){
            System.out.println("X is not largest of all");
        }
        else if (y >= x && y >= z){
            System.out.println("Y is the largest of all");
        }
        else if (z >= x && z >= y){
            System.out.println("Z is not largest of all");
        }
        else{
            System.out.println("Please provide valid Condition...");
        }
    }
}
