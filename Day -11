Date : 29-04-2026
Day : 12
Video number : !4
Video link : https://youtu.be/ZarOdaT7P2k?si=bD_E28ZZKcN-unJ2
Topic : Maps (HashMap and TreeMap)

HashMap:Example-1:
~~~
import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // 1. put(key,value)
        map.put(101, "Saiba");
        map.put(102, "Nilima");
        map.put(103, "Rahim");
        map.put(104, "Karim");

        // 2. putIfAbsent()
        map.putIfAbsent(105, "Jamal");

        System.out.println("Initial Map: " + map);
        System.out.println("         ");

        // 3. get()
        System.out.println("Get 102: " + map.get(102));
        System.out.println("Get 104: " + map.get(104));

        // 4. getOrDefault()
        System.out.println("Get 999 : " + map.getOrDefault(999, "Not Found"));

        // 5. containsKey()
        if(map.containsKey(103)) {
            System.out.println("It Contains key 103 ");
        }
        else {
            System.out.println("Key is not found");
        }
        // 6. containsValue()
        System.out.println("Contains value Rahim? " + map.containsValue("Rahim"));

        // 7. replace()
        map.replace(104, "Karim Ahmed");

        // 8. replace(key, oldValue, newValue)
        map.replace(101, "Saiba", "Saiba Khan");

        // 9. remove(key)
        map.remove(105);

        // 10. remove(key, value)
        map.remove(102, "Nilima");

        System.out.println("\nAfter Updates: " + map);

        // 11. size()
        System.out.println("Size: " + map.size());

        // 12. isEmpty()
        System.out.println("Is Empty? " + map.isEmpty());

        // 13. keySet()
        System.out.println("Keys: " + map.keySet());

        // 14. values()
        System.out.println("Values: " + map.values());

        // 15. entrySet()
        System.out.println("\nEntries:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    }
}
~~~

TreeMap:Example-2:
~~~
import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>();

        // 1. put(key,value)
        tm.put(103, "Apple");
        tm.put(101, "Banana");
        tm.put(105, "Mango");
        tm.put(102, "Orange");

        // 2. putIfAbsent()
        tm.putIfAbsent(106, "Grapes");

        System.out.println("Initial TreeMap: " + tm);
        System.out.println(" ");

        // 3. get()
        System.out.println("Get 102: " + tm.get(102));
        System.out.println("Get 105: " + tm.get(105));

        // 4. getOrDefault()
        System.out.println("Get 999: " + tm.getOrDefault(999, "Not Found"));

        // 5. containsKey()
        if (tm.containsKey(103)) {
            System.out.println("It Contains key 103");
        } else {
            System.out.println("Key not found");
        }

        // 6. containsValue()
        System.out.println("Contains value Mango? " + tm.containsValue("Mango"));

        // 7. replace()
        tm.replace(105, "Sweet Mango");

        // 8. replace(key, oldValue, newValue)
        tm.replace(101, "Banana", "Green Banana");

        // 9. remove(key)
        tm.remove(106);

        // 10. remove(key, value)
        tm.remove(102, "Orange");

        System.out.println("\nAfter Updates: " + tm);

        // 11. size()
        System.out.println("Size: " + tm.size());

        // 12. isEmpty()
        System.out.println("Is Empty? " + tm.isEmpty());

        // 13. keySet()
        System.out.println("Keys: " + tm.keySet());

        // 14. values()
        System.out.println("Values: " + tm.values());

        // 15. entrySet()
        System.out.println("\nEntries:");
        for (Map.Entry<Integer, String> e : tm.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // Extra TreeMap methods
        System.out.println("\nFirst Key: " + tm.firstKey());
        System.out.println("Last Key: " + tm.lastKey());
        System.out.println("Higher than 102: " + tm.higherKey(102));
        System.out.println("Lower than 102: " + tm.lowerKey(102));
    }
}
~~~
