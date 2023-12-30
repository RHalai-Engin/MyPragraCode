package SaturdayDec30.Exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Steve");
        list.add("Tony");
        list.add("Wanda");
        list.add("Vision");
        list.add("Thanos");
        list.add("Strange");

        //LOOP
        System.out.println("++++++++++++++");
        System.out.println("For Loop");
        System.out.println("++++++++++++++");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Using for each loop");
        System.out.println("+++++++++++++++++++++++");
        for (String element: list) {
            System.out.println(element);
        }
        System.out.println("+++++++++++++");
        System.out.println("Iterator");
        System.out.println("+++++++++++++");
        Iterator <String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
