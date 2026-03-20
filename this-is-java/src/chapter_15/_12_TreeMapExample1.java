package chapter_15;

import java.util.Map;
import java.util.TreeMap;

public class _12_TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
        scores.put(new Integer(87), "Mark");
        scores.put(new Integer(98), "Nick");
        scores.put(new Integer(75), "Paul");
        scores.put(new Integer(95), "Tom");
        scores.put(new Integer(80), "Jerry");

        Map.Entry<Integer, String> entry = null;

        entry = scores.firstEntry();
        System.out.printf("Min : %d - %s\n",entry.getKey(),entry.getValue());

        entry = scores.lastEntry();
        System.out.printf("Max : %d - %s\n",entry.getKey(),entry.getValue());

        entry = scores.lowerEntry(95);
        System.out.printf("Lower than 95 : %d - %s\n",entry.getKey(),entry.getValue());

        entry = scores.higherEntry(95);
        System.out.printf("Higher than 95 : %d - %s\n",entry.getKey(),entry.getValue());

        entry = scores.floorEntry(95);
        System.out.printf("95 or Lower than 95 : %d - %s\n",entry.getKey(),entry.getValue());

        entry = scores.ceilingEntry(85);
        System.out.printf("85 or Higher than 85 : %d - %s\n",entry.getKey(),entry.getValue());

        while (!scores.isEmpty()){
            entry = scores.pollFirstEntry();
            System.out.printf("%d - %s (Remain : %d)\n",entry.getKey(),entry.getValue(),scores.size());
        }
    }
}
