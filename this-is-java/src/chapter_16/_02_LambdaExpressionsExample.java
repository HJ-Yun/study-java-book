package chapter_16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _02_LambdaExpressionsExample {
    public static void main(String[] args) {
        List<_02_Student> list = Arrays.asList(
                new _02_Student("Mark",90),
                new _02_Student("Nick",92)
        );

        Stream<_02_Student> stream = list.stream();
        stream.forEach( s-> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " : " + score);
            }
        );
    }
}
