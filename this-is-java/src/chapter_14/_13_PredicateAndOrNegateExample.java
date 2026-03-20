package chapter_14;

import java.util.function.IntPredicate;

public class _13_PredicateAndOrNegateExample {
    public static void main(String[] args) {
        //2
        IntPredicate predicateA = a -> a % 2 == 0;

        //3
        IntPredicate predicateB = b -> b % 3 == 0;

        IntPredicate predicateAB;
        boolean result;

        //And()
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("9 have 2 and 3? " + result);

        //Or()
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("9 have 2 or 3? " + result);

        //Negate()
        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("9 can divide with 2? " + result);
    }
}
