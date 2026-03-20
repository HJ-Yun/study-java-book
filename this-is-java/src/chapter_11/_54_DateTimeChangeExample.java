package chapter_11;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class _54_DateTimeChangeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current time : " + now);

        LocalDateTime targetDateTime = null;

        targetDateTime = now
                .withYear(2024)
                .withMonth(10)
                .withDayOfMonth(5)
                .withHour(13)
                .withMinute(30)
                .withSecond(20);
        System.out.println("Target time : " + targetDateTime);

        targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("First day of Year : " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last day of Year : " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("First day of next Year : " + targetDateTime);

        targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of Month : " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of Month : " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next Month : " + targetDateTime);

        targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("First Monday of Month : " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Monday of next week : " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println("Monday of last week" + targetDateTime);
    }
}
