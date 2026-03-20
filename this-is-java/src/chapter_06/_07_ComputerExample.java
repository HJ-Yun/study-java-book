package chapter_06;

public class _07_ComputerExample {
    public static void main(String[] args) {
        _07_Computer myCom = new _07_Computer();

        int[] value1 ={1, 2, 3};
        int result1 = myCom.sum1(value1);
        System.out.println("Result1 = " + result1);

        int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
        System.out.println("Result2 = " + result2);

        int result3 = myCom.sum2(1, 2, 3);
        System.out.println("Result3 = " + result3);

        int result4 = myCom.sum2(1, 2, 3, 4, 5);
        System.out.println("Result4 = " + result4);
    }
}
