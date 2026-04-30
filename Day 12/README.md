Date : 30-04-2026
Day : 12
Video number : 15
Video link : https://youtu.be/gtmBSl10DvY?si=s2yvpxJTHUfKH2Yv
Topic : Using Collections in Real World Scenario

Example -1:Employee System Management
~~~
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSystem {

    public static void main(String[] args) {

        HashMap<Integer, Employee> empMap = new HashMap<>();

        empMap.put(101, new Employee(101, "Saiba", 50000));
        empMap.put(102, new Employee(102, "Nilima", 60000));

        // Search employee
        int searchId = 101;

        //For one employee:
        if (empMap.containsKey(searchId)) {
            Employee e = empMap.get(searchId);
            System.out.println(e.name + " earns " + e.salary);
        }
        System.out.println("Multiple emoplyee :");
        //For multiple employee:
        for (Employee e : empMap.values()) {
            System.out.println(e.name + " earns " + e.salary);
        }

    }
}
~~~

Example-2:Library System Management
~~~
import java.util.*;

class Book {
    int id;
    String name;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class LibrarySystem {

    public static void main(String[] args) {

        HashMap<Integer, Book> books = new HashMap<>();
        HashSet<Integer> issuedBooks = new HashSet<>();

        books.put(1, new Book(1, "Java Basics"));
        books.put(2, new Book(2, "Data Structures"));
        books.put(3, new Book(3, "Operating Systems"));

        // Issue book
        issuedBooks.add(2);

        // Display available books
        for (int id : books.keySet()) {
            if (!issuedBooks.contains(id)) {
                System.out.println("Available: " + books.get(id).name);
            }
        }
    }
}
~~~

Example-3: E-commerce
~~~
import java.util.*;

public class ECommerce {

    public static void main(String[] args) {

        HashMap<Integer, String> products = new HashMap<>();
        HashMap<Integer, Integer> price = new HashMap<>();
        ArrayList<Integer> cart = new ArrayList<>();

        products.put(1, "Phone");
        products.put(2, "Laptop");

        price.put(1, 20000);
        price.put(2, 50000);

        // Add to cart
        cart.add(1);
        cart.add(2);

        int total = 0;

        for (int id : cart) {
            System.out.println(products.get(id) + " - " + price.get(id));
            total += price.get(id);
        }

        System.out.println("Total Bill: " + total);
    }
}
~~~
