package chapter_16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class _15_SortingExample {
    public static void main(String[] args) {
        //int
        IntStream intStream = Arrays.stream(new int[] {5,2,4,1,3});
        intStream
                .sorted()
                .forEach(s-> System.out.print(s + ", "));
        System.out.println();

        List<_15_Student> studentList = Arrays.asList(
                new _15_Student("Mark",30),
                new _15_Student("Nick",10),
                new _15_Student("Paul",20)
        );

        studentList.stream()
                .sorted()
                .forEach(s-> System.out.print(s.getScore() + ", "));
        System.out.println();

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s-> System.out.print(s.getScore() + ", "));
    }
}
