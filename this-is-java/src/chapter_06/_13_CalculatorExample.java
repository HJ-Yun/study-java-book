package chapter_06;

public class _13_CalculatorExample {
    public static void main(String[] args) {
        double circle = 3 * 3 * _13_Calculator.pi;
        double result1 = _13_Calculator.plus(3,5);
        double result2 = _13_Calculator.minus(5,3);

        System.out.println(circle + ", " + result1 + ", " + result2);
    }
}
