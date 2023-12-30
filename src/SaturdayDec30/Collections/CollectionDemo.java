package SaturdayDec30.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(53);
        list.add(43);
        list.add(43);
        list.add(55);
        list.add(22);
        list.add(11);
        list.add(12);
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 43));
        Collections.sort(list);
        System.out.println("List after sorting" + list);
    }
}
