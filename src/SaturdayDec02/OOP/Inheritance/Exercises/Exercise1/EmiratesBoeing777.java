package SaturdayDec02.OOP.Inheritance.Exercises.Exercise1;

public class EmiratesBoeing777 {
    String propellers;
    String economy;
    String business;

    public EmiratesBoeing777(){

    }

    public void showInfo(){
        System.out.println("Propellers");
        System.out.println("Economy");
        System.out.println("Business");
    }
}

class EmiratesAirbus extends EmiratesBoeing777{

    public void luxuryClass(){
        System.out.println("Luxury First Class");
    }
}

class Main{
    public static void main(String[] args) {
        EmiratesAirbus airbus = new EmiratesAirbus();
        airbus.showInfo();
        airbus.luxuryClass();
    }
}
