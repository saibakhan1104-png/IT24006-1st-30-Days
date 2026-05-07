Date : 03-05-2026
Day : 13
Video number : 16
Video link : https://youtu.be/63c8XmiOrzo?si=w5VIjam8tiAE20eB
Topic : Introduction to JAVA file handling

Example -1: Reading From File
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

Example -2 : Writing From File:
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
~~~

Example-2
