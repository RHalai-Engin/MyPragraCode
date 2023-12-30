package SaturdayDec30;

import java.util.*;

public class LinkedListCont {
    public static void main(String[] args) {
        List <Integer> list = new LinkedList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);
        list.add(100000);
        list.add(1000000);

        //Loop
        System.out.println("List using for Loop");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("List using enhanced for loop");
        for (Integer element: list) {
            System.out.println(element);
        }

        //Iterator
        System.out.println("Iterator");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
