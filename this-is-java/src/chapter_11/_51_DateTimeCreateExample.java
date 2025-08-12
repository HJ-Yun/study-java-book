package chapter_11;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class _51_DateTimeCreateExample {
    public static void main(String[] args) throws InterruptedException{
        LocalDate currDate = LocalDate.now();
        System.out.println("Current date : " + currDate);
        LocalDate targetDate = LocalDate.of(2024,5,10);
        System.out.println("Target date : " + targetDate + "\n");

        LocalTime currTime = LocalTime.now();
        System.out.println("Current time : " + currTime);
        LocalTime targetTime = LocalTime.of(6,30,0,0);
        System.out.println("Target time : " + targetTime + "\n");

        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println("Current date and time : " + currDateTime);
        LocalDateTime targetDateTime = LocalDateTime.of(2024,5,10,6,30,0,0);
        System.out.println("Target date and time : " + targetDateTime + "\n");

        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("UTC time : " + utcDateTime);

        ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York date and time : " +  newyorkDateTime + "\n");

        Instant instant1 = Instant.now();
        Thread.sleep(10);
        Instant instant2 = Instant.now();
        if (instant1.isBefore(instant2)){
            System.out.println("instant1 is faster than instant2");
        } else if (instant1.isAfter(instant2)) {
            System.out.println("instant1 is slower than instant2");
        } else {
            System.out.println("instant1 is same with instant2");
        }
        System.out.println("Different(nanos) : " + instant1.until(instant2, ChronoUnit.NANOS));
    }
}
