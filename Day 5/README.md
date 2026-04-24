Date-23/04/2026
Day : 5
Video number : 7
Video link : 
Topic : Polymorphism

Example-1: Compile-time polymorphism (Method Overloading)

 public class Animal {
    String name;
    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(name+" is eating.");
    }
    public void eat(int qn){
        System.out.println(name+" is eating "+qn+" times.");
    }
    public void eat(String food){
        System.out.println(name+" is eating"+" "+food+".");
    }
}

public class Animalmain {
    public static void main(String[] args){
    Animal a=new Animal("Rover");
        a.eat();
        a.eat(3);
        a.eat("Bread");
}
}

Example-2: Run-Time polymorphism (Method Overriding)
public class AnimalRun {

    public void makesound() {
        System.out.println(" Animal is making sound.");
    }
}
class Dog extends AnimalRun{
     public void makesound(){
        System.out.println("Dog sound: ghew ghew!!");
    }
    public void bark()
    {
        System.out.println("Dog is barking.");
    }
}
class cat extends AnimalRun{
    public void makesound() {
        System.out.println("Cat sound: meow meow!!");
    }
}

public class AnimalMainRun {
    public static void display(AnimalRun a){ //upcasting
        a.makesound();
 }
    public static void main(String[] args){
     AnimalRun a=new AnimalRun();
     Dog d=new Dog();
     cat c=new cat();
     display(a);
     display(d);
     display(c);
  }
}

