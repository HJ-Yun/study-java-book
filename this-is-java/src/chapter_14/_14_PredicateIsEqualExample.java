package chapter_14;

import java.util.function.Predicate;

public class _14_PredicateIsEqualExample {
    public static void main(String[] args) {
        Predicate<String> predicate;

        predicate = Predicate.isEqual(null);
        System.out.println("null and null is same? " + predicate.test(null));

        predicate = Predicate.isEqual("Java");
        System.out.println("null and Java is same? " + predicate.test(null));

        predicate = Predicate.isEqual(null);
        System.out.println("Java and null is same? " + predicate.test("Java"));

        predicate = Predicate.isEqual("Java");
        System.out.println("Java and Java is same? " + predicate.test("Java"));

        predicate = Predicate.isEqual("C#");
        System.out.println("Java and C# is same? " + predicate.test("Java"));
    }
}
