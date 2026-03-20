package chapter_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_ArrayAsListExample {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Mark","Nick","Paul");
        for (String name : list1){
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1,2,3);
        for (Integer number : list2){
            System.out.println(number);
        }
    }
}
