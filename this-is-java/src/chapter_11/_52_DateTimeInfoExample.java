package chapter_11;

import java.time.*;

public class _52_DateTimeInfoExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        String strDateTime = now.getYear() + ".";
        strDateTime += now.getMonthValue() + ".";
        strDateTime += now.getDayOfMonth() + " ";
        strDateTime += now.getHour() + ":";
        strDateTime += now.getMinute() + ":";
        strDateTime += now.getSecond() + ":";
        strDateTime += now.getNano() + " ";
        System.out.println(now);
        System.out.println(strDateTime + "\n");

        LocalDate nowDate = now.toLocalDate();
        if (nowDate.isLeapYear()){
            System.out.println("February is until 29th.");
        } else {
            System.out.println("February is until 28th.");
        }

        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("UTC time : " + utcDateTime);
        ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("Seoul time : " + seoulDateTime);
        ZoneId seoulZoneID = seoulDateTime.getZone();
        System.out.println("Seoul Zone ID : " + seoulZoneID);
        ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
        System.out.println("Seoul Zone Offset : " + seoulZoneOffset);
    }
}
