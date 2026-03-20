package chapter_15;

import java.util.TreeSet;

public class _11_TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;

        score = scores.first();
        System.out.println("Min : " + score);

        score = scores.last();
        System.out.println("Max : " + score);

        score = scores.lower(new Integer(95));
        System.out.println("Lower than 95 : " + score);

        score = scores.higher(new Integer(95));
        System.out.println("Higher than 95 : " + score);

        score = scores.floor(new Integer(95));
        System.out.println("95 or below 95 : " + score);

        score = scores.ceiling(new Integer(85));
        System.out.println("85 or upper 85 : " + score);

        while (!scores.isEmpty()){
            score = scores.pollFirst();
            System.out.println(score + "(Remain : " + scores.size() + ")");
        }
    }
}
