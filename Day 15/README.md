Date : 05-05-2026
Day : 15
Video number : 18
Video link : https://youtu.be/u0SsmS1wFWA?si=KW6zDhvLB-LahqjF
Topic : Working with File input and output stream

Example -1 : Writing and Reading a Text File Using FileInputStream & FileOutputStream
~~~
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileWriteReadExample {

    public static void main(String[] args) {

        try {

            // STEP 1: Create output stream
            FileOutputStream fout =
                    new FileOutputStream("student.txt");

            // STEP 2: Data to write
            String text = "Name: Saiba  Khan\nDepartment: ICT";

            // STEP 3: Convert string to bytes
            byte[] b = text.getBytes();

            // STEP 4: Write bytes into file
            fout.write(b);

            System.out.println("Data written successfully.");

            // STEP 5: Close output stream
            fout.close();

            // STEP 6: Append new data
            FileOutputStream appendFile =
                    new FileOutputStream("student.txt", true);

            String extra = "\nSemester: 2nd";

            appendFile.write(extra.getBytes());

            appendFile.close();

            System.out.println("New data appended.");

            // STEP 7: Open input stream
            FileInputStream fin =
                    new FileInputStream("student.txt");

            int i;

            System.out.println("\nReading File:\n");

            // STEP 8: Read file
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }

            // STEP 9: Available bytes
            System.out.println("\n\nRemaining Bytes: "
                    + fin.available());

            // STEP 10: Close input stream
            fin.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
~~~

Example -2: Copying Binary/Text File Using Buffer
~~~
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyExample {

    public static void main(String[] args) {


        try {

            // STEP 1: Open source file
            FileInputStream fin =
                    new FileInputStream("student.txt");

            // STEP 2: Open destination file
            FileOutputStream fout =
                    new FileOutputStream("data2.txt");

            // STEP 3: Create buffer
            byte[] buffer = new byte[1024];

            int bytesRead;

            // STEP 4: Read and write using buffer
            while ((bytesRead = fin.read(buffer)) != -1) {

                fout.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");

            // STEP 5: Close streams
            fin.close();
            fout.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
~~~
    }
}
~~~`
