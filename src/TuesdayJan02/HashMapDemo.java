package TuesdayJan02;

import java.util.Map;
import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        //How to create a HashMap

        //Internally - array list of LinkedList
        Map<String, Integer> device = new HashMap<>();
        device.put("IPhone", 1000);
        device.put("Samsung", 1990);
        device.put("OnePlus", 1500);
        device.put("Motorola",1200);
        device.put("Nothing", 1100);
        device.put(null, 100);
        device.put(null, 100);

        System.out.println(device);
        System.out.println("OnePlus: " + device.get("OnePlus"));
        device.putIfAbsent("Oppo", 900);
        device.putIfAbsent("Iphone", 1800); //Iphone is present but it will not override the price
        System.out.println(device);
        System.out.println(device.getOrDefault("Nokia", 1100));
        //^^It will look for Nokia, if it can't find, will return null
        System.out.println(device.getOrDefault("IPhone", 1900));
        //^^It will look for java, if it can find, will return Iphone(value from Map) but won't override value
        device.replace("IPhone", 1500); //This will replace the value for IPhone
        System.out.println(device);
        device.replace("OnePlus", 1500, 1700);
        System.out.println(device);
    }
}
