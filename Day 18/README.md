Date : 08-05-2026
Day : 18
Video number : 21
Video link : https://youtu.be/ieveCaLfrlE?si=IAW3Vyu1VmH-qXjv
Topic : Formatting Dates in JAVA

Example -1:Formatted Date
~~~
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateFormat {
    public static void main(String[] args) {

        // Current Date
        LocalDate currentDate = LocalDate.now();
          // Formatting Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);

        System.out.println("Current Date: " + currentDate);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
~~~

Example -2:Formatted Time
~~~
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
         DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
         String formattedTime = currentTime.format(format);
         System.out.println("Current Time: " + currentTime);
        System.out.println("Formatted Time: "+formattedTime);
    }
}
~~~

Example -3: Formatted Date and Time
~~~
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        // Different Date-Time Formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm a");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss");

        // Printing Formatted Date-Time
        System.out.println("Format 1: " + dateTime.format(format1));
        System.out.println("Format 2: " + dateTime.format(format2));
        System.out.println("Format 3: " + dateTime.format(format3));
        System.out.println("Format 4: " + dateTime.format(format4));
    }
}
~~~
