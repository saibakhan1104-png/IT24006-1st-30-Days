Date : 09-05-2026
Day : 19
Video number : 22
Video link :  https://youtu.be/apUcrW2Tmd8?si=Ds9TmIGY-kciD0yt
Topic : Using Time Zones in Java

Example -1:Zone Id
~~~
import java.time.ZoneId;

public class ZoneIdEx {
    public static void main(String[] args) {

        ZoneId zone = ZoneId.systemDefault();

        System.out.println("System Zone ID: " + zone);
        // Example other zones
        System.out.println("India Zone: " + ZoneId.of("Asia/Kolkata"));
        System.out.println("US Zone: " + ZoneId.of("America/New_York"));
    }
}
~~~

Example -2:Zoned Date and Time
~~~
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeEx {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
         DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a z");

         System.out.println("Local Zoned DateTime: " + now.format(format));
        // Another time zone example
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        System.out.println("India Time: " + indiaTime.format(format));
    }
}
~~~

Example -3: Time zones(Meeting Schedule)
~~~
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MeetingSchedule {
    public static void main(String[] args) {

        // Formatter (custom format)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        // Meeting time in UTC
        ZonedDateTime meetingUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        // Same meeting time in different zones
        ZonedDateTime indiaTime = meetingUTC.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime newYorkTime = meetingUTC.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime londonTime = meetingUTC.withZoneSameInstant(ZoneId.of("Europe/London"));

        // Printed with formatter
        System.out.println("Meeting Time (UTC): " + meetingUTC.format(formatter));
        System.out.println("India: " + indiaTime.format(formatter));
        System.out.println("New York: " + newYorkTime.format(formatter));
        System.out.println("London: " + londonTime.format(formatter));
    }
}
~~~
