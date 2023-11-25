package SaturdayNov25.StaticDemo;

public class StaticBlock {

    //If you have static block inside the class, it's going to get called first and then the main method
    //If you have two static block then java will go line by line printing static blocks first and then main method
    public static void main(String[] args) {
        System.out.println("We are inside the main method."); // and this will be printed after static block
    }
    static
    {
        System.out.println("we are inside the static block."); //This will be printed first...
    }


}
