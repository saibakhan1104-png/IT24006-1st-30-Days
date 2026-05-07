Date : 04-05-2026
Day : 14
Video number :17
Video Link : https://youtu.be/NIxcCzJOj3c?si=_GGt3BnSNqbtFsiF
Topic : Byte streaming 

Example - 1:
~~~
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

    public static void main(String[] args) {

        String source = "input.txt";
        String destination = "output.txt";

        try {

            // Create input stream
            FileInputStream fin = new FileInputStream(source);

            // Create output stream
            FileOutputStream fout = new FileOutputStream(destination);

            int data;

            // Read byte by byte
            while ((data = fin.read()) != -1) {

                // Write byte
                fout.write(data);
            }

            System.out.println("File copied successfully using Byte Streams.");

            // Close streams
            fin.close();
            fout.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
~~~
Example - 2:
~~~
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

    public static void main(String[] args) {

        String source = "input.txt";
        String destination = "output2.txt";

        try {

            // Create reader
            FileReader fr = new FileReader(source);

            // Create writer
            FileWriter fw = new FileWriter(destination);

            int ch;

            // Read character by character
            while ((ch = fr.read()) != -1) {

                // Write character
                fw.write(ch);
            }

            System.out.println("File copied successfully using Character Streams.");

            // Close streams
            fr.close();
            fw.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
~~~
