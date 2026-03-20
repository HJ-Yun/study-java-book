package chapter_16;

import java.util.Arrays;

public class _16_LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        System.out.println("If peek() called last");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(System.out::print); //not worked

        System.out.println("If sum() called last");
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(System.out::print) //print 2,4
                .sum();
        System.out.println("\nTotal : " + total); //total is 6.

        System.out.println("If forEach() called last");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(System.out::print); //print 2,4

    }
}
