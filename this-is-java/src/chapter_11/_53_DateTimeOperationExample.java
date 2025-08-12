package chapter_11;

import java.time.LocalDateTime;

public class _53_DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current time : " + now);

        LocalDateTime targetDateTime = now
                .plusYears(1)
                .minusMonths(2)
                .plusDays(3)
                .plusHours(4)
                .minusMinutes(5)
                .plusSeconds(6);
        System.out.println("Target time : " + targetDateTime);
    }
}
