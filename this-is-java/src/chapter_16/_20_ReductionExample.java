package chapter_16;

import java.util.Arrays;
import java.util.List;

public class _20_ReductionExample {
    public static void main(String[] args) {
        List<_02_Student> studentList = Arrays.asList(
                new _02_Student("Mark",92),
                new _02_Student("Nick",95),
                new _02_Student("Paul",88)
        );

        //If there is no list, Exception occur
        int sum1 = studentList
                .stream()
                .mapToInt(_02_Student::getScore)
                .sum();

        //If there is no list, Exception occur
        int sum2 = studentList
                .stream()
                .mapToInt(_02_Student::getScore)
                .reduce((a,b)-> a + b)
                .getAsInt();

        //If there is no list, 0 will be print.
        int sum3 = studentList
                .stream()
                .mapToInt(_02_Student::getScore)
                .reduce(0,(a,b)-> a + b);

        System.out.println("Sum1 : " + sum1);
        System.out.println("Sum2 : " + sum2);
        System.out.println("Sum3 : " + sum3);
    }
}
