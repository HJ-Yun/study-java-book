package chapter_16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _05_FromCollectionExample {
    public static void main(String[] args) {
        List<_02_Student> list = Arrays.asList(
                new _02_Student("Mark",10),
                new _02_Student("Nick",20),
                new _02_Student("Paul",30)
        );

        Stream<_02_Student> stream = list.stream();
        stream.forEach(s->
        {
            System.out.println(s.getName());
        });

    }
}
