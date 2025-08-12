package chapter_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _27_ArrayListVsLinkedListExample {
    public static void work(int value){
    }

    //Parallel
    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.parallelStream().forEach(a -> work(a));
        long end = System.nanoTime();
        long runtime = end - start;
        return runtime;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linedList = new LinkedList<Integer>();
        for (int i = 0; i < 1000000; i++){
            arrayList.add(i);
            linedList.add(i);
        }

        //worm up
        long arrayTime = testParallel(arrayList);
        long linkedTime = testParallel(linedList);

        //check
        arrayTime = testParallel(arrayList);
        linkedTime = testParallel(linedList);

        if (arrayTime < linkedTime){
            System.out.println("Array is faster");
        } else {
            System.out.println("Linked is faster");
        }
    }



}
