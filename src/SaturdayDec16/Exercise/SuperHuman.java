package SaturdayDec16.Exercise;

public class SuperHuman {
    Alien a = new Alien();
    public void canFly(){
        System.out.println("Superhuman is flying");
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
