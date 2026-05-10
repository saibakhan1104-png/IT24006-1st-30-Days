Date : 10-05-2026
Day : 20
Video number : 23
Video link : https://youtu.be/wNNcI8ktP34?si=c5pyMN7dSWnMFD_M
Topic : Parsing Dates from String

Example -1:Date parsing
~~~
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParsing {
    public static void main(String[] args) {

        // Define a date string to parse
        String Date = "2026-10-05";
        DateTimeFormatter Dateparse = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Parse the string into LocalDate
        LocalDate date = LocalDate.parse(Date, Dateparse);
        System.out.println("Parsed date : " + date);
    }
}
~~~

Example -2: Date and Time Parsing
~~~
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeParsing {
    public static void main(String[] args) {

        // Date and time string
        String input = "2026-10-05 14:30:45";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Parsing
        LocalDateTime dateTime = LocalDateTime.parse(input, formatter);

        // Output
        System.out.println("Parsed Date and Time : " + dateTime);
    }
}
~~~

Example -3: Extract date from text
~~~
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExtractDatefromText{
    public static void main(String[] args) {

        String Text = " The event will take place on 2026-10-05";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String dateString =Text.substring(Text.indexOf("on")+3);

        try {
            LocalDate date = LocalDate.parse(dateString, formatter);
            System.out.println("Extracted date : " + date);

        } catch (DateTimeParseException e) {

            System.out.println("Invalid Date Format!");
            System.out.println("Error : " + e.getMessage());
        }
    }
}
~~~

Example -4: Extract multiple dates
~~~
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExtractMultipleDate {
    public static void main(String[] args) {
        // Text containing multiple dates
        String text = "Exam: 2026-10-05 Assignment: 2026-11-15 Result: 2026-12-01";
        // Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Split text into words
        String[] words = text.split(" ");
        // Check every word
        for (String word : words) {
            try {
                LocalDate date = LocalDate.parse(word, formatter);
                System.out.println("Extracted Date : " + date);

            } catch (DateTimeParseException e) {
            }
        }
    }
}
 ~~~
