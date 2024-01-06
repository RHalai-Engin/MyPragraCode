package SaturdayJan06.Exercise.Exercise03;

public class Mobile implements Comparable<Mobile>{
    String brand;
    int price;

    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Mobile o) {
        return 0;
    }
}
