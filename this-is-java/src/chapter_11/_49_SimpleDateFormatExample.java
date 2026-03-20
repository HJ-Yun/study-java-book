package chapter_11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _49_SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("HH : mm : ss");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("E");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("D");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("K");
        System.out.println(sdf.format(now));
    }
}
