package chapter_16;

import chapter_14._12_Member;

import java.util.Arrays;
import java.util.List;

public class _13_MapExample {
    public static void main(String[] args) {
        List<_02_Student> list = Arrays.asList(
                new _02_Student("Mark",10),
                new _02_Student("Nick",20),
                new _02_Student("Paul",30)
        );

        list.stream()
                .mapToInt(_02_Student::getScore)
                .forEach(System.out::println);
    }
}
