package chapter_16;

import java.util.Arrays;
import java.util.List;

public class _04_MapAndReduceExample {
    public static void main(String[] args) {
        List<_02_Student> list = Arrays.asList(
                new _02_Student("Mark",10),
                new _02_Student("Nick",20),
                new _02_Student("Paul",30)
        );

        double avg = list.stream()
                .mapToInt(_02_Student::getScore)
                .average().getAsDouble();

        System.out.println("Average : " + avg);
    }
}
