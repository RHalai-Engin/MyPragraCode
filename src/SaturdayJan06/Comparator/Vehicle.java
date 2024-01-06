package SaturdayJan06.Comparator;

public class Vehicle implements Comparable<Vehicle>{
    String brand;
    int makeYear;

    public Vehicle(String brand, int makeYear) {
        this.brand = brand;
        this.makeYear = makeYear;
    }

    @Override
    public int compareTo(Vehicle vehicle) {
        return this.makeYear - vehicle.makeYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", makeYear=" + makeYear +
                '}';
    }
}
