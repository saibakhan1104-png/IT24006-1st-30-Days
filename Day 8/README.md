Date: 26-04-2026
Day: 8
Video number : 10,11
Video Link : https://youtu.be/TDHaeHAlPFg?si=9i4aifK7pRu3qxrD
             https://youtu.be/q-5D9Z9BCVI?si=OjCVJN7VJ3i4-qNA


ArrayList:
Example-1:
~~~
     import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();

          l.add("Apple");
        l.add("Banana");
        l.add("Mango");

        System.out.println("Elements: " + l);
           System.out.println("First element: " + l.get(0));
        l.remove("Banana");// Remove element
        System.out.println("After removal: " + l);

        l.add("Watermelon");//add elements
        l.add("Strawberry");
        System.out.println("After adding: "+l);
    }
}
~~~

LinkedList :
Example-2:
~~~

import java.util.*;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("Elements: " + list);

        list.addFirst("Orange");

        list.addLast("Grapes");

        System.out.println("After adding: " + list);
        list.removeFirst();

        System.out.println("After removal: " + list);
    }
}
~~~
