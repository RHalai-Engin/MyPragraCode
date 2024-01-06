package SaturdayJan06.Exercise.Exercise03;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileMain {
    public static void main(String[] args) {
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(new Mobile("Samsung", 1500));
        mobileList.add(new Mobile("Motorola", 1200));
        mobileList.add(new Mobile("Oppo", 1800));
        mobileList.add(new Mobile("Apple", 2000));
        mobileList.add(new Mobile("OnePlus", 1700));

        Collections.sort(mobileList);
        System.out.println(mobileList);


       String st1 = "Hello";
        String st2 = "Hello";
        String st3 = new String("Hello");
        String st4 = new String("Hello");
        System.out.println(st1 == st2);
        System.out.println(st1 == st3);
        System.out.println(st3 == st4);

        int x = 5;
        x++;
        int y = x++;
        System.out.println(x + y);

    }
}
