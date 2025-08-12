package chapter_16;

import java.util.Arrays;
import java.util.List;

public class _11_FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mark","Mark","Nick","Maul","Jerry");

        names.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        names.stream()
                .filter(n->n.startsWith("M"))
                .forEach(System.out::println);
        System.out.println();

        names.stream()
                .distinct()
                .filter(n->n.startsWith("M"))
                .forEach(System.out::println);
    }
}
