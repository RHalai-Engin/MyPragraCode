package SaturdayJan06.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle("Honda", 2019));
        list.add(new Vehicle("Hyundai", 2010));
        list.add(new Vehicle("Mercedes", 2021));
        list.add(new Vehicle("Jaguar", 2022));
        list.add(new Vehicle("Range Rover", 2023));
        list.add(new Vehicle("Toyota", 2014));

        Collections.sort(list);
        System.out.println(list);

    }
}
