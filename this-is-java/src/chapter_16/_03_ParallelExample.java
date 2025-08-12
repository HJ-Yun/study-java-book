package chapter_16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _03_ParallelExample {
    public static void print(String str){
        System.out.println(str + " : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mark", "Nick", "Paul", "Jerry", "Jack");

        //Stream
        Stream<String> stream = list.stream();
        stream.forEach(_03_ParallelExample::print);
        System.out.println();

        //ParallelStream
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(_03_ParallelExample::print);
    }
}
