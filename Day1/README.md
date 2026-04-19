Date:19/04/2026
Day:01
Topic:Creating Class and objects
Video number: 3
Video link: https://youtu.be/lWFzm8qIR1c?si=Hxk_d9vcHZ5B99a3

Example 1:Student.java

public class Student {
    String name;
    String ID;
    int CGPA;

    void displayStudentInfo(){
        System.out.println("Name of the Student:"+name);
        System.out.println("Student ID:"+ID);
        System.out.println("Result:"+CGPA);
    }
}
public class Main1 {
    public static void main(String args[])
    {
        Student S1= new Student();
        S1.name="Saiba Khan";
        S1.ID="IT24006";
        S1.CGPA= (int) 3.94;
        S1.displayStudentInfo();
    }
}


Example 2:car.java

public class car {
    String name;
    String color;
    int year;
    void displayInfo() {
        System.out.println("Car name=" + name);
        System.out.println("Car color=" + color);
        System.out.println("Car year=" + year);
    }
}
public class Main{
    public static void main(String args[])
    {
        car C=new car();
        C.name="Toyota";
        C.color="Red";
        C.year=2020;
        C.displayInfo();
    }
}
