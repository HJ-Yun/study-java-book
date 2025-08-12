package chapter_11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _56_DateTimeParsingExample {
    public static void main(String[] args) {
        DateTimeFormatter formatter;
        LocalDate localDate;

        localDate = LocalDate.parse("2024-05-10");
        System.out.println(localDate);

        formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        localDate = LocalDate.parse("2024-05-01",formatter);
        System.out.println(localDate);

        formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        localDate = LocalDate.parse("2024/04/01",formatter);
        System.out.println(localDate);

        formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        localDate = LocalDate.parse("2024.04.10",formatter);
        System.out.println(localDate);
    }
}
