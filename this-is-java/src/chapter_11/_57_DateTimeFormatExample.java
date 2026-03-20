package chapter_11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _57_DateTimeFormatExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy///M///dd///a/h/m");
        String nowString = now.format(dateTimeFormatter);
        System.out.println(now);
        System.out.println(nowString);

    }
}
