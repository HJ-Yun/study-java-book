package chapter_07;

public class _03_ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        _03_Calculator myCalc1 = new _03_Calculator();
        System.out.println("Calculator is " + myCalc1.areaCircle(r));
        System.out.println();

        _03_Computer myCalc2 = new _03_Computer();
        System.out.println("Computer is " + myCalc2.areaCircle(r));

    }
}
