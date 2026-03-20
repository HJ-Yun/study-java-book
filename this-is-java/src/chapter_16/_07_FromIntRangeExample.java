package chapter_16;

import java.util.stream.IntStream;

public class _07_FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,100);
        stream.forEach(a->{
            sum += a;
        });
        System.out.println("Total(1-100) : " + sum);
    }
}
