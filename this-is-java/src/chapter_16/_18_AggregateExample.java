package chapter_16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _18_AggregateExample {
    public static void main(String[] args) {
        IntStream countStream = Arrays.stream(new int[] {1,2,3,4,5});
        IntStream sumStream = Arrays.stream(new int[] {1,2,3,4,5});
        IntStream avgStream = Arrays.stream(new int[] {1,2,3,4,5});
        IntStream maxStream = Arrays.stream(new int[] {1,2,3,4,5});
        IntStream minStream = Arrays.stream(new int[] {1,2,3,4,5});
        IntStream findFirst = Arrays.stream(new int[] {1,2,3,4,5});

        long count = countStream
                .filter(n-> n % 2 == 0)
                .count();
        System.out.println("Count : " + count);

        long sum = sumStream
                .filter(n-> n % 2 == 0)
                .sum();
        System.out.println("Sum : " + sum);

        double avg = avgStream
                .filter(n-> n % 2 == 0)
                .average()
                .getAsDouble();
        System.out.println("Average : " + avg);

        int max = maxStream
                .filter(n-> n % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("Max : " + max);

        int min = minStream
                .filter(n-> n % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("Min : " + min);

        int first = findFirst
                .filter(n-> n % 3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("First multiple of 3 : " + first);

    }
}
