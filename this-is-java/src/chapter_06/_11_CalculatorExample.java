package chapter_06;

public class _11_CalculatorExample {
    public static void main(String[] args) {
        _11_Calculator myClac = new _11_Calculator();

        double result1 = myClac.calc(5);
        System.out.println("Result1 = " + result1);

        double result2 = myClac.calc(5,10);
        System.out.println("Result2 = " + result2);
    }
}
