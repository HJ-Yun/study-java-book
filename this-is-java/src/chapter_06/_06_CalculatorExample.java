package chapter_06;

public class _06_CalculatorExample {
    public static void main(String[] args) {
        _06_Calculator myCalc = new _06_Calculator();

        myCalc.powerOn();

        int result1 = myCalc.plus(2,3);
        System.out.println(result1);

        int result2 = myCalc.minus(2,3);
        System.out.println(result2);

        int result3 = myCalc.multiple(2,3);
        System.out.println(result3);

        int result4 = myCalc.devide(2,3);
        System.out.println(result4);

        myCalc.powerOff();
    }
}
