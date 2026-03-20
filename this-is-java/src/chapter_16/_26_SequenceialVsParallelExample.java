package chapter_16;

import java.util.Arrays;
import java.util.List;

public class _26_SequenceialVsParallelExample {
    public static void work(int value){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){}
    }

    //Single
    public static long testSequence(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().forEach(a-> work(a));
        long end = System.nanoTime();
        long runtime = end - start;
        return runtime;
    }

    //Parallel
    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.parallelStream().forEach(a-> work(a));
        long end = System.nanoTime();
        long runtime = end - start;
        return runtime;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        long timeSequence = testSequence(list);
        long timeParallel = testParallel(list);

        if (timeSequence > timeParallel){
            System.out.println("Parallel is faster");
        } else {
            System.out.println("Single is faster");
        }
    }
}
