package SaturdayDec22.Lists.ArrayListDemo;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        System.out.println(list);

        list.add(2, 150); //This will add 150 at 2nd index
        System.out.println(list);

        System.out.println(list.contains(800));//we will check if arraylist contains 800 --> it will return false


    }
}
