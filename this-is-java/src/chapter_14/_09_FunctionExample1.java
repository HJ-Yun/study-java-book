package chapter_14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class _09_FunctionExample1 {
    private static List<_09_Student> list = Arrays.asList(
            new _09_Student("Mark",90,96),
            new _09_Student("Nick",95,93)
    );

    public static void printString(Function<_09_Student,String> function){
        for (_09_Student student : list){
            System.out.print(function.apply(student) + " ");
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<_09_Student> toIntFunction){
        for (_09_Student student : list){
            System.out.print(toIntFunction.applyAsInt(student) + " ");
        }
        System.out.println();
    }

    public static double avg(ToIntFunction<_09_Student> function){
        int sum = 0;
        for (_09_Student student : list){
            sum += function.applyAsInt(student);
        }
        double avg = (double) sum / list.size();
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("[Student Name]");
        printString(t -> t.getName());

        System.out.println("[English Score]");
        printInt(t -> t.getEnglishScore());

        System.out.println("[Math Score]");
        printInt(t -> t.getMathScore());

        System.out.println("[English Score Average]");
        double engAvg = avg(s -> s.getEnglishScore());
        System.out.println(engAvg);

        System.out.println("[Math Score Average]");
        double mathAvg = avg(s -> s.getMathScore());
        System.out.println(mathAvg);
    }
}
