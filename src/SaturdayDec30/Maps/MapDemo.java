package SaturdayDec30.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("IPhone", 2000);
        map.put("Samsung", 1800);
        map.put("OnePlus", 1200);
        map.put("Oppo", 900);
        map.put("Jio", 500);
        System.out.println(map);

        System.out.println(map.get("IPhone"));
        System.out.println(map.getOrDefault("ProMax", 0));

    }
}
