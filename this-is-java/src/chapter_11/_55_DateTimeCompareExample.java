package chapter_11;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class _55_DateTimeCompareExample {
    public static void main(String[] args) {
        LocalDateTime startDateTime = LocalDateTime.of(2023,1,1,9,0,0);
        System.out.println("Start : " + startDateTime);

        LocalDateTime endDateTime = LocalDateTime.of(2024,3,31,18,0,0);
        System.out.println("End : " + endDateTime + "\n");
        //--------------------------------------------------------------------------------------------------------
        if (startDateTime.isBefore(endDateTime)){
            System.out.println("This is proceeding.\n");
        } else if (startDateTime.isAfter(endDateTime)) {
            System.out.println("This is end.\n");
        } else {
            System.out.println("This is end.\n");
        }
        //--------------------------------------------------------------------------------------------------------
        long remainYear = ChronoUnit.YEARS.between(startDateTime,endDateTime);
        long remainMonth = ChronoUnit.MONTHS.between(startDateTime,endDateTime);
        long remainDay = ChronoUnit.DAYS.between(startDateTime,endDateTime);
        long remainHour= ChronoUnit.HOURS.between(startDateTime,endDateTime);
        long remainMin = ChronoUnit.MINUTES.between(startDateTime,endDateTime);
        long remainSec = ChronoUnit.SECONDS.between(startDateTime,endDateTime);

//        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS); // Same as up
//        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS); // Same as up
//        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS); // Same as up
//        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS); // Same as up
//        long remainMin = startDateTime.until(endDateTime, ChronoUnit.MINUTES); // Same as up
//        long remainSec = startDateTime.until(endDateTime, ChronoUnit.SECONDS); // Same as up

        System.out.println("[Remain time]");
        System.out.println("Remain Year : " + remainYear);
        System.out.println("Remain Month : " + remainMonth);
        System.out.println("Remain Day : " + remainDay);
        System.out.println("Remain Hour : " + remainHour);
        System.out.println("Remain Minute : " + remainMin);
        System.out.println("Remain Second : " + remainSec + "\n");
        //--------------------------------------------------------------------------------------------------------
        Period period = Period.between(startDateTime.toLocalDate(),endDateTime.toLocalDate());
        System.out.println("[Remain period]");
        System.out.println(period.getYears() + "[year]/" + period.getMonths() + "[month]/" + period.getDays() + "[day]\n");
        //--------------------------------------------------------------------------------------------------------
        Duration duration = Duration.between(startDateTime.toLocalTime(),endDateTime.toLocalTime());
        System.out.println("Remain Second : " + duration.getSeconds());
    }
}
