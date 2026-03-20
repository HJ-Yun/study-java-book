package chapter_14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _11_PredicateExample {
    private static List<_11_Student> list = Arrays.asList(
            new _11_Student("Mark","Male",90),
            new _11_Student("Anny","Female",90),
            new _11_Student("Mike","Male",95),
            new _11_Student("Jenny","Female",92)
    );

    public static double avg(Predicate<_11_Student> predicate){
        int count = 0;
        int sum = 0;
        for (_11_Student student : list){
            if (predicate.test(student)){
                count++;
                sum += student.getScore();
            }
        }
        return (double)sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg(t -> t.getSex().equals("Male"));
        System.out.println("Male Avg : " + maleAvg);

        double feMaleAvg = avg((t -> t.getSex().equals("Female")));
        System.out.println("Female Avg : " + feMaleAvg);
    }
}
