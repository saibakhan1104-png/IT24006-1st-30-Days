Date:21-04-2026
Day: 3
Video number: 5
Video link: https://youtu.be/acfR5vRTZvc?si=blUuMAD1ymBQU_Gn
Topic: Building JAVA constructor.

Example-1:
public class dog {
    String name;
    int age;
    //parameterized constructor:
    dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void DisplayInfo(){
        System.out.println("Name of the dog is:"+name);
        System.out.println(name+"'s age is:"+age+"months");
    }
}
public class MainDog {
    public static void main(String[] args){
        dog Dog= new dog("Tommy",5);
        Dog.DisplayInfo();
    }
}


Example-2:
public class Student {
   String name;
    String ID;
    double CGPA;
    Student(String name,String ID,double CGPA)
    {
        this.name=name;
        this.ID=ID;
        this.CGPA=CGPA;
    }
    public void StudentInfo()
    {
        System.out.println("Name of the Student="+name );
        System.out.println("Student ID="+ID);
        System.out.println("Result in CGPA="+CGPA);
        System.out.println();
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Saiba Khan","IT-24006",3.93);
        Student student2 = new Student("Nilima Khan","IT-24008",3.89);
        Student student3 = new Student("Nawrin Zaman Shurovy","IT-24002",3.87);
        Student student4 = new Student("Annita Miraza Joya","IT-24012",3.85);
       student1.StudentInfo();
        student2.StudentInfo();
        student3.StudentInfo();
        student4.StudentInfo();
    }
}
