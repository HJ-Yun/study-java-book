package chapter_15;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class _11_TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        NavigableSet<Integer> lower = scores.descendingSet();
        for (Integer number : lower){
            System.out.print(number + " ");
        }
        System.out.println();

        NavigableSet<Integer> higher = scores.descendingSet().descendingSet();
        for (Integer number : higher){
            System.out.print(number + " ");
        }
    }
}
