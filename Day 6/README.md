Date : 24-04-2026
Day : 6
Video number : 8
Video link : https://youtu.be/1SXyi3DK-88?si=uudnZ8LOfxtRk-UH
Topic : Applying Abstraction

Example-1:
abstract class Parent {
   public Parent() {
       System.out.println("It's a constructor!!");
   }
   public void sayHello()
   {
       System.out.println("Hello!!!");
   }
  abstract public void greet1();
   abstract public void greet2();
}

class child1 extends Parent{
  @Override//override or make the class abstract
  public void greet1(){
        System.out.println("Good morning!");
    }
@Override
public void greet2(){
    System.out.println("Good Evening!");
}
}
abstract class child2 extends Parent{
    public void intro(){
        System.out.println("My name is saiba.");
    }
}
public class PMain {
    public static void main(String[] args){
        //Parent p=new Parent();//It can't work as it is an abstract class
          child1 ch= new child1();//concrete class and Calls Parent constructor first
          ch.greet1();
          ch.greet2();
          ch.sayHello();
         // child2 ch2=new child2();//It can't work as it is an abstract class
  }
}

Example-2:
abstract class shape {
    String color;
    public shape(String color) {
        this.color = color;
        System.out.println("Shape constructor called.");
    }
        abstract void draw();
       void displayColor() {
            System.out.println("Color: " + color);
    }
}
class Circle extends shape {
  Circle(String color) {
        super(color); // calling Parent constructor
        System.out.println("Circle constructor called");
    }
 @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}


public class shapemain {
    public static void main(String[] args) {
        Circle c = new Circle("Red");
        c.draw();
        c.displayColor();
    }
}

