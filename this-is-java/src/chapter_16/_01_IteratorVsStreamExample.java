package chapter_16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class _01_IteratorVsStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mark","Nick","Paul");

        //Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println();

        //Stream
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
