package chapter_16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class _19_OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /* //Exception
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        */

        //Method1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional.isPresent()){
            System.out.println(optional.getAsDouble());
        } else {
            System.out.println("Method1 : " + 0.0);
        }

        //Method2
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Method2 : " + avg);

        //Method3
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a-> System.out.println(avg));
    }
}
