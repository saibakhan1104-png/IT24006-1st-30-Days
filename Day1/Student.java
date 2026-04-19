
Example 1:
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
