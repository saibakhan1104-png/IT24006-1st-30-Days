Date: 21-04-2026
Day: 4
Video number: 6
Video link: https://youtu.be/j_VA2Rp6jM0?si=G4RJ7VnZMBeNXEif

Example-1: Single Inheritance:
class Animalsingle {
    void eat() {
        System.out.println("The animal is eating.");
    }
}
   class dog extends Animalsingle{
        void run()
        {
            System.out.println("Dog runs");
        }
   }

public class AnimalsingleMain {
    public static void main(String[] args){
        dog DOG=new dog();
        DOG.eat();
        DOG.run();
    }
}

Example-2: Multilevel Inheritance:

class Multilevel {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Cat extends Multilevel {
    void bark() {
        System.out.println("Cat is mewing");
    }
}

class Puppy extends Cat {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
       Puppy pp= new Puppy();
        pp.eat();
        pp.bark();
        pp.weep();
    }
}


Example-3: Hierarchical Inheritance:
class EmployeeH {
    void companyName() {
        System.out.println("Company: Tech Solutions Ltd.");
    }
}

class Developer extends EmployeeH {
    void work() {
        System.out.println("Developer writes code");
    }
}

class Manager extends EmployeeH {
    void work() {
        System.out.println("Manager manages team");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.companyName();
        dev.work();
        System.out.println("-----------------------------");
        Manager mng = new Manager();
        mng.companyName();
        mng.work();
    }
}

Example-4: Multiple Inheritance:
interface Phone {
    void call();
}

interface Camera {
    void takePhoto();
}

class Multiple implements Phone, Camera {
    public void call() {
        System.out.println("Calling someone...");
    }
     public void takePhoto() {
        System.out.println("Taking a photo...");
    }
}

public class MultipleMain {
    public static void main(String[] args) {
        Multiple smartPhone = new Multiple();
        smartPhone.call();
        smartPhone.takePhoto();
    }
}

