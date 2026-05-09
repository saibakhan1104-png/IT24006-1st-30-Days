Date : 07-05-2026
Day : 17
Video number : 20
Video link : https://youtu.be/rs1WKrln-9U?si=8DC7BntdLnNfLUC4
Topic :  An Introduction to Java Date and Time Classes

Example-1: Local Time:
~~~
import java.time.LocalTime;
public class LocalTimeEx {
    public static void main(String[] args) {
         LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);//20 → Hour→ Minute→ Second→ Nanoseconds
         //Java LocalTime.now() can print time up to nanosecond precision.
    }
}
~~~

Example-2: Local Date:
~~~
import java.time.LocalDate;
public class LocalDateEx {
    public static void main(String[] args){
     LocalDate today= LocalDate.now();
        System.out.println("Todays's Date :" + today);//Displays YY:MM:DD
    }
}

~~~

Example-3: Local Date and Time:
~~~
import java.time.LocalDateTime;

public class LocalDateTimeEx {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date and Time: " + dateTime);
    }
}
~~~
