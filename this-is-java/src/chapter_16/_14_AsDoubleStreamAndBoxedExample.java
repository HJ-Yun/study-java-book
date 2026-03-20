package chapter_16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _14_AsDoubleStreamAndBoxedExample {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        IntStream intStream = Arrays.stream(intArr);
        intStream
                .asDoubleStream()
                .forEach(System.out::println);
        System.out.println();

        intStream = Arrays.stream(intArr);
        intStream
                .boxed()
                .forEach(obj-> System.out.println(obj.intValue()));
    }
}
