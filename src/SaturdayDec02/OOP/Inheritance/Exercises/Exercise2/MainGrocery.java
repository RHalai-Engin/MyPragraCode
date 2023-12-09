package SaturdayDec02.OOP.Inheritance.Exercises.Exercise2;

public class MainGrocery {
    public static void main(String[] args) {
        Costco costco = new Costco();
        costco.shopping();
        costco.collectingPoints();
        Walmart walmart = new Walmart();
        walmart.shopping();
        walmart.collectingPoints();
        NoFrills noFrills = new NoFrills();
        noFrills.shopping();
        noFrills.collectingPoints();
        Panchvati panchvati = new Panchvati();
        panchvati.shopping();
        panchvati.collectingPoints();
    }
}
