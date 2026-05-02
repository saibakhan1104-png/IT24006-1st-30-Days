Date: 02-05-2026
Day: 14
Video number : 17
Video Link : https://youtu.be/NIxcCzJOj3c?si=AtbIoCu1P-GHIy5S
Topic : Byte Stream in java

Example-1: Writing file using Byte Stream 
~~~
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("bytefile.txt");

            String data = "Hello Byte Stream in Java!";

            byte[] b = data.getBytes(); // convert String → bytes

            fos.write(b);

            fos.close();

            System.out.println("Data written using Byte Stream!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
~~~
Example-2: Reading file using Byte Stream 
~~~
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("bytefile.txt");

            int i;

            while ((i = fis.read()) != -1) {
                System.out.print((char) i); // convert byte → char
            }

            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
~~~


}
~~~
