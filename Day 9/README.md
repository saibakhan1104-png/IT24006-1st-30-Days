Date : 27-04-2026
Day : 9
Video number : 12
Video Link : https://youtu.be/XDw-BkAZYmY?si=1LVWDI3e6pJV7rtR
Topic : Sets (HashSet and TreeSet)

HashSet:
Example -1:
~~~
import java.util.*;

public class HashSets {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        //Adding elements:
        set.add("Mango");
        set.add("Banana");
        set.add("Watermelon");
        set.add("Stawberry");
        set.add("Mango");//it will not print (Duplicate)
        set.add("Null"); //null print once
        System.out.println("Name of the fruiits :" + set);

        System.out.println("Size of the set : " + set.size());

        if (set.contains("Banana")) {
            System.out.println("Banana is in the list");
        }
        //removing element:
        set.remove("Mango");
        System.out.println("After removing : " + set);
        if (!set.contains("Mango")) {
            System.out.println("Mango is not present.");
        }
        System.out.println("Iterating:");
        for (String item : set) {
            System.out.println(item);
        }
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println("Iterating: " + it.next());
        }
    }
}

~~~

TreeSet :
Example-2:
~~~
import java.util.*;
public class TreeSetS {
    public static void main(String[] args) {

      TreeSet<String> set = new TreeSet<>();
      //  Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        // Duplicate element
        set.add("Apple");
        set.add("Watermelon");
        System.out.println("TreeSet elements: " + set);
        System.out.println("Size: " + set.size());


        System.out.println("Contains Banana? " + set.contains("Banana"));

        set.remove("Mango");
        System.out.println("Size after removing: " + set.size());

        System.out.println("Iterating:");
        for(String item : set) {
            System.out.println(item);
        }

        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());
    }
}
~~~
