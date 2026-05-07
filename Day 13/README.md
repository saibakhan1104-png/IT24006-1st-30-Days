Date : 03-05-2026
Day : 13
Video number : 16
Video link : https://youtu.be/63c8XmiOrzo?si=w5VIjam8tiAE20eB
Topic : Introduction to JAVA file handling

Example -1 :File handling
~~~
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String [] args){
        //Creating a file:
      File myFile = new File("data.txt");
        try {
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create a File ");
            e.printStackTrace();
        }

        //Writing to a File:
        try{
            FileWriter fileWriter = new FileWriter("data.txt");
            fileWriter.write("This is my first file handling code.");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Read from a File:
       // File myFile =new File("data.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
~~~

Example -2: Reading From File
~~~
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}
~~~

Example - 3 : Writing From File:
~~~
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Hello Java File Handling!\n");
            writer.write("This is the second line.\n");

            writer.close();

            System.out.println("File written successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
~~~

Example-2
