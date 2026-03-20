package chapter_15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class _12_TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
        scores.put(new Integer(87), "Mark");
        scores.put(new Integer(98), "Nick");
        scores.put(new Integer(75), "Paul");
        scores.put(new Integer(95), "Tom");
        scores.put(new Integer(80), "Jerry");

        NavigableMap<Integer, String> lowerMap = scores.descendingMap();
        Set<Map.Entry<Integer, String>> lowerEntry = lowerMap.entrySet();
        for (Map.Entry<Integer, String> entry : lowerEntry){
            System.out.printf("%d-%s ",entry.getKey(),entry.getValue());
        }
        System.out.println();

        NavigableMap<Integer, String> higherMap = scores.descendingMap().descendingMap();
        Set<Map.Entry<Integer, String>> higherEntry = higherMap.entrySet();
        for (Map.Entry<Integer, String> entry : higherEntry){
            System.out.printf("%d-%s ",entry.getKey(),entry.getValue());
        }
    }
}
