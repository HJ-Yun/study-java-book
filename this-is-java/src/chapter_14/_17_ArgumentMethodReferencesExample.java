package chapter_14;

import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class _17_ArgumentMethodReferencesExample {
    public static void print(int order){
        if (order < 0){
            System.out.println("Bigger");
        } else if (order == 0) {
            System.out.println("Same");
        } else {
            System.out.println("Saller");
        }
    }

    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = (a,b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java","JAVA"));

        function = String :: compareToIgnoreCase;
        print(function.applyAsInt("Java","JAVA"));
    }
}
