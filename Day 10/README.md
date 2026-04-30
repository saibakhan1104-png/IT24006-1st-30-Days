Date: 28-04-2026
Day: 8 
Video number : 13
Video Link : https://youtu.be/PccU1wAdnlM?si=EE1N7PVug0i4ewd1
Topic : Using Queues in Java

Example-1:
~~~
import java.util.*;

public class FruitsQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Mango");
        queue.offer("Orange");
        System.out.println("Queue: " + queue);
        System.out.println("Size: " + queue.size());
        System.out.println("Peek (head element): " + queue.peek());
        System.out.println("Element: " + queue.element());
     
        System.out.println("Removed : " + queue.remove());
        System.out.println("Removed (poll): " + queue.poll());

        System.out.println("Queue after removals: " + queue);
        System.out.println("Size after removal : " + queue.size());

        if(queue.contains("Mango")) {
            System.out.println("Mango is in the list.");
        }
        else
            System.out.println("Mango is not in the list");

        System.out.println("Is empty? " + queue.isEmpty());

        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
    }

~~~

Example-2:
~~~
import java.util.*;

public class Queues {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        //  add() inserts element
        q.add("A");
        q.add("B");

        // offer() inserts element
        q.offer("C");

        System.out.println("Queue after add/offer: " + q);

        //  element()  returns head
        System.out.println("element: " + q.element());

        // peek()
        System.out.println("peek: " + q.peek());

        //  remove()  removes head
        System.out.println("remove: " + q.remove());
        System.out.println("Queue after remove: " + q);

        //  poll() - removes head (null if empty)
        System.out.println("poll(): " + q.poll());
        System.out.println("Queue after poll: " + q);

        //  contains()
        System.out.println("Contains B? " + q.contains("B"));

        // size()
        System.out.println("Size: " + q.size());

        // isEmpty()
        System.out.println("Is empty? " + q.isEmpty());

        //  add more elements
        q.add("X");
        q.add("Y");
        q.add("Z");

        //  iteration
        System.out.println("Iterating:");
        for(String item : q) {
            System.out.println(item);
        }

        // clear()
        q.clear();
        System.out.println("After clear: " + q);

        // isEmpty after clear
        System.out.println("Is empty now? " + q.isEmpty());
    }
}
~~~



