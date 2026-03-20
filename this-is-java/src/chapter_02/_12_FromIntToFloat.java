package chapter_02;

public class _12_FromIntToFloat {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2; // num3 = 1.23456784E8
        num2 = (int) num3; // num2 = 123456784
        int result_1 = num1 - num2;
        System.out.println(result_1);

        num2 = 123456780;

        double num4 = num2; // num4 = 1.2345678E8
        num2 = (int) num4; // num2 = 123456780
        int result_2 = num1 - num2;
        System.out.println(result_2);
    }
}
