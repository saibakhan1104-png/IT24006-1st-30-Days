Date : 05-04-2026
Day : 7
Video number : 9
Video link: https://youtu.be/lsJ9QjJPbx8?si=VKlM6BPe05dQrb0y
Topic: Inner class

Example-1:Member Inner Class
class Outer {
    private String message = "Hello from Outer class!";

   // Inner class
    class Inner {
        void display() {
            System.out.println(message); // accessing outer class variable
        }
    }
}

public class InnerclassMain {
    public static void main(String[] args) {
        Outer obj = new Outer();          // create outer object
        Outer.Inner innerObj = obj.new Inner(); // create inner object
        innerObj.display();
    }
}


Example-2: Static Nested Class
class Outer {
    static String msg = "Hello from Static Nested";

  static class Inner {
        void show() {
            System.out.println(msg);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner(); // no outer object needed
        in.show();
    }
}


Example-3: Local Inner Class (inside method)
class Outer {
    void display() {
        class Inner {
            void show() {
                System.out.println("Hello from Local Inner");
            }
        }
        Inner in = new Inner();
        in.show();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
    }
}


Example-4: Anonymous Inner Class
abstract class Animal {
    abstract void sound();
}

public class Main {
    public static void main(String[] args) {

   Animal obj = new Animal() {
            void sound() {
                System.out.println("Dog barks");
            }
        };
     obj.sound();
    }
}
